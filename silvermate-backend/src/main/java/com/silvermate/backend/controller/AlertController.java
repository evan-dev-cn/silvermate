package com.silvermate.backend.controller;

import com.silvermate.backend.config.ApiResponse;
import com.silvermate.backend.service.AlertService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/alert")
public class AlertController {

    private final AlertService alertService;

    public AlertController(AlertService alertService) {
        this.alertService = alertService;
    }

    @GetMapping("/list")
    public ApiResponse<?> list(@RequestParam Long childId) {
        return ApiResponse.success(alertService.listByChildId(childId));
    }
}
