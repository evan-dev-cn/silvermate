package com.silvermate.backend.service;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
/**
 * ClassName: RelationService
 * Package: com.silvermate.backend.service
 * Description:
 *
 * @Author Evander
 * @Create 2026/1/31 10:46
 * @Version 1.0
 */
@Service
public interface RelationService {
    /**
     * 查询子女绑定的老人列表
     * @param childId 子女ID
     * @return 老人基础信息列表
     */
    List<Map<String,Object>> listEldersByChildId(Long childId);
}
