package com.example.llama2.models;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

@Getter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Jacksonized
public class LlamaResponse {
    String response;
}
