package com.silvermate.backend.service.impl;

import com.silvermate.backend.repository.ElderChildRelationRepository;
import com.silvermate.backend.service.RelationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RelationServiceImpl implements RelationService {

    private final ElderChildRelationRepository relationRepository;

    public RelationServiceImpl(ElderChildRelationRepository relationRepository) {
        this.relationRepository = relationRepository;
    }

    @Override
    public List<Map<String, Object>> listEldersByChildId(Long childId) {
        return relationRepository.findEldersByChildId(childId);
    }
}
