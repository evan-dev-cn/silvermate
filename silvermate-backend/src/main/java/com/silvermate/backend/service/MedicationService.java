package com.silvermate.backend.service;

import com.silvermate.backend.entity.MedicationRecord;

public interface MedicationService {

    void addMedication(MedicationRecord medication);

    void confirmMedication(Long medicationId);
}
