package com.silvermate.backend.controller;

import com.silvermate.backend.config.ApiResponse;
import com.silvermate.backend.config.ApiResponse;
import com.silvermate.backend.service.RelationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/relation")
public class RelationController {

    private final RelationService relationService;

    public RelationController(RelationService relationService) {
        this.relationService = relationService;
    }

    @GetMapping("/elder/list")
    public ApiResponse<?> listElders(@RequestParam Long childId) {
        return ApiResponse.success(relationService.listEldersByChildId(childId));
    }
}
