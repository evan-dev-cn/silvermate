package com.silvermate.backend.controller;

import com.silvermate.backend.config.ApiResponse;
import com.silvermate.backend.entity.HealthRecord;
import com.silvermate.backend.service.HealthRecordService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/health")
public class HealthController {

    private final HealthRecordService healthRecordService;

    public HealthController(HealthRecordService healthRecordService) {
        this.healthRecordService = healthRecordService;
    }

    @PostMapping("/add")
    public ApiResponse<?> add(@RequestBody HealthRecord record) {
        healthRecordService.addRecord(record);
        return ApiResponse.success("健康记录添加成功");
    }

    @GetMapping("/list")
    public ApiResponse<?> list(@RequestParam Long userId) {
        return ApiResponse.success(healthRecordService.listByUserId(userId));
    }
}
