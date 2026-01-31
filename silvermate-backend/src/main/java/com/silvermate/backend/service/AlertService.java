package com.silvermate.backend.service;

import com.silvermate.backend.entity.AbnormalAlert;
import java.util.List;

public interface AlertService {

    List<AbnormalAlert> listByChildId(Long childId);
}
