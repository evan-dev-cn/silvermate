package com.silvermate.backend.service.impl;

import com.silvermate.backend.service.AIChatService;
import org.springframework.stereotype.Service;

@Service
public class AIChatServiceImpl implements AIChatService {

    @Override
    public String chat(Long userId, String userInput) {
        // 先写死，保证接口跑通
        return "建议您注意休息，如有不适请及时联系家属";
    }
}
