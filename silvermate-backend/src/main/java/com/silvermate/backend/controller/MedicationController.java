package com.silvermate.backend.controller;

import com.silvermate.backend.config.ApiResponse;
import com.silvermate.backend.entity.MedicationRecord;
import com.silvermate.backend.service.MedicationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/medication")
public class MedicationController {

    private final MedicationService medicationService;

    public MedicationController(MedicationService medicationService) {
        this.medicationService = medicationService;
    }

    @PostMapping("/add")
    public ApiResponse<?> add(@RequestBody MedicationRecord record) {
        medicationService.addMedication(record);
        return ApiResponse.success("服药计划添加成功");
    }

    @PostMapping("/confirm")
    public ApiResponse<?> confirm(@RequestBody MedicationRecord record) {
        medicationService.confirmMedication(record.getMedicationId());
        return ApiResponse.success("服药确认成功");
    }
}
