package com.example.llama2.controller;

import com.example.llama2.models.LlamaRequest;
import com.example.llama2.service.LlamaService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@RequestMapping("/api/llama/v1")
public class LlamaController {

    @Autowired
    LlamaService llamaService;

    @PostMapping("/generate")
    public ResponseEntity<String> generateResponse(@RequestBody LlamaRequest request)
        throws Exception {
        return ResponseEntity.ok(llamaService.generateText(request));
    }
}
