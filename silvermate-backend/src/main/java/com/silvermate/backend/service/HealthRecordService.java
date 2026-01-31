package com.silvermate.backend.service;

import com.silvermate.backend.entity.HealthRecord;
import org.springframework.stereotype.Service;

import java.util.List;

public interface HealthRecordService {

    void addRecord(HealthRecord record);

    List<HealthRecord> listByUserId(Long userId);
}
