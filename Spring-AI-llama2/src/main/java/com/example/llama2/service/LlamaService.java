package com.example.llama2.service;

import com.example.llama2.models.LlamaRequest;
import com.example.llama2.models.LlamaResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Slf4j
public class LlamaService {

    RestTemplate restTemplate;

    private static final String LLAMA_API_URL = "http://localhost:11434/api/generate";

    public String generateText(LlamaRequest request) throws Exception {
        // Create headers
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

        ObjectMapper objectMapper = new ObjectMapper();
        String requestPayload = objectMapper.writeValueAsString(request);

        log.info("Generated JSON Payload: {}", requestPayload);

        // Wrap the payload and headers into an HttpEntity
        HttpEntity<String> httpEntity = new HttpEntity<>(requestPayload, headers);

        // Make the POST request and map the response to LlamaResponse
        ResponseEntity<String> response = restTemplate.exchange(
            LLAMA_API_URL,
            HttpMethod.POST,
            httpEntity,
            String.class
        );
        return parseNdjsonResponse(response.getBody(), objectMapper);
    }

    private String parseNdjsonResponse(String ndjsonResponse, ObjectMapper objectMapper)
        throws Exception {
        String[] lines = ndjsonResponse.split("\n");
        StringBuilder finalResponse = new StringBuilder();

        for (String line : lines) {
            if (!line.trim().isEmpty()) {
                LlamaResponse parsedResponse = objectMapper.readValue(line, LlamaResponse.class);
                if (!parsedResponse.isDone()) {
                    finalResponse.append(parsedResponse.getResponse());
                } else {
                    break;
                }
            }
        }

        log.info("Response: {}", finalResponse);
        return finalResponse.toString();
    }
}
