package com.example.tinderaibackend.conversations;

import java.time.LocalDateTime;

public record ChatMessage(
        String messageText,
        String authorId,
        LocalDateTime messageTime
) {
}
