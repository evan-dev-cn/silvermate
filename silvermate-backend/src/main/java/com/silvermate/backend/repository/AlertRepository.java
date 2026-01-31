package com.silvermate.backend.repository;

import com.silvermate.backend.entity.AbnormalAlert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlertRepository extends JpaRepository<AbnormalAlert, Long> {

    // Spring Data JPA 会自动实现
    List<AbnormalAlert> findByChildId(Long childId);
}
