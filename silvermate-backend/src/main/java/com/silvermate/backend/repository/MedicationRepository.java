package com.silvermate.backend.repository;

import com.silvermate.backend.entity.MedicationRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicationRepository extends JpaRepository<MedicationRecord, Long> {

    List<MedicationRecord> findByUserId(Long userId);
}
