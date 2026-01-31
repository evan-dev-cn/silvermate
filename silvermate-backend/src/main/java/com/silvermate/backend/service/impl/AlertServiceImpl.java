package com.silvermate.backend.service.impl;

import com.silvermate.backend.entity.AbnormalAlert;
import com.silvermate.backend.entity.AbnormalAlert;
import com.silvermate.backend.repository.AlertRepository;
import com.silvermate.backend.service.AlertService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AlertServiceImpl implements AlertService {

    private final AlertRepository alertRepository;

    public AlertServiceImpl(AlertRepository alertRepository) {
        this.alertRepository = alertRepository;
    }

    @Override
    public List<AbnormalAlert> listByChildId(Long childId) {
        return alertRepository.findByChildId(childId);
    }
}
