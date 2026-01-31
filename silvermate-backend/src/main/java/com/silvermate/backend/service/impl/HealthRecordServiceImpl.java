package com.silvermate.backend.service.impl;

import com.silvermate.backend.entity.HealthRecord;
import com.silvermate.backend.repository.HealthRecordRepository;
import com.silvermate.backend.service.HealthRecordService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthRecordServiceImpl implements HealthRecordService {

    private final HealthRecordRepository healthRecordRepository;

    public HealthRecordServiceImpl(HealthRecordRepository healthRecordRepository) {
        this.healthRecordRepository = healthRecordRepository;
    }

    @Override
    public void addRecord(HealthRecord record) {
        healthRecordRepository.save(record);
    }

    @Override
    public List<HealthRecord> listByUserId(Long userId) {
        return healthRecordRepository.findByUserId(userId);
    }
}
