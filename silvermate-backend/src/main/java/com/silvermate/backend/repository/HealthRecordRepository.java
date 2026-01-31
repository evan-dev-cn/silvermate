package com.silvermate.backend.repository;

import com.silvermate.backend.entity.HealthRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HealthRecordRepository extends JpaRepository<HealthRecord, Long> {

    List<HealthRecord> findByUserId(Long userId);
}
