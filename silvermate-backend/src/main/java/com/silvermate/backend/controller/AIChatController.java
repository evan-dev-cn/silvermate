package com.silvermate.backend.controller;

import com.silvermate.backend.config.ApiResponse;
import com.silvermate.backend.service.AIChatService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/ai")
public class AIChatController {

    private final AIChatService aiChatService;

    public AIChatController(AIChatService aiChatService) {
        this.aiChatService = aiChatService;
    }

    @PostMapping("/chat")
    public ApiResponse<?> chat(@RequestBody Map<String, Object> body) {
        Long userId = Long.valueOf(body.get("userId").toString());
        String userInput = body.get("userInput").toString();
        return ApiResponse.success(aiChatService.chat(userId, userInput));
    }
}
