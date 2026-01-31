package com.silvermate.backend.service.impl;

import com.silvermate.backend.entity.MedicationRecord;
import com.silvermate.backend.repository.MedicationRepository;
import com.silvermate.backend.service.MedicationService;
import org.springframework.stereotype.Service;

@Service
public class MedicationServiceImpl implements MedicationService {

    private final MedicationRepository medicationRepository;

    public MedicationServiceImpl(MedicationRepository medicationRepository) {
        this.medicationRepository = medicationRepository;
    }

    @Override
    public void addMedication(MedicationRecord medicationRecord) {
        medicationRepository.save(medicationRecord);
    }

    @Override
    public void confirmMedication(Long medicationId) {
        MedicationRecord record =
                medicationRepository.findById(medicationId).orElse(null);

        if (record != null) {
            record.getMedicationStatus(); // 1 = 已服药
            medicationRepository.save(record);
        }
    }
}
