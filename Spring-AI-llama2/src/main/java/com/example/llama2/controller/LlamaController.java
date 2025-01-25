package com.example.llama2.controller;

import com.example.llama2.models.LlamaRequest;
import com.example.llama2.models.LlamaResponse;
import com.example.llama2.service.LlamaService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@RequestMapping("/api/llama/v1")
public class LlamaController {

    @Autowired
    LlamaService llamaService;

    @PostMapping("/generate")
    public ResponseEntity<LlamaResponse> generateResponse(@RequestBody LlamaRequest request)
        throws JsonProcessingException {
        return ResponseEntity.ok(llamaService.generateText(request));
    }
}
