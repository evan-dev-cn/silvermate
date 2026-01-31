package com.silvermate.backend.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
/**
 * ClassName: ElderChildRelation
 * Package: com.silvermate.backend.entity
 * Description:
 *
 * @Author Evander
 * @Create 2026/1/24 21:21
 * @Version 1.0
 */
@Entity
@Table(name = "t_elder_child_relation")
public class ElderChildRelation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long relationId;

    @Column(nullable = false)
    private Long elderId;

    @Column(nullable = false)
    private Long childId;

    @Column(length = 20)
    private String relationType;

    @Column(nullable = false)
    private LocalDateTime createTime =LocalDateTime.now();

    @Column(nullable = false)
    private Byte status =1;//1有效0无效

    public Long getRelationId() { return relationId; }
    public void setRelationId(Long relationId) { this.relationId = relationId; }

    public Long getElderId() { return elderId; }
    public void setElderId(Long elderId) { this.elderId = elderId; }

    public Long getChildId() { return childId; }
    public void setChildId(Long childId) { this.childId = childId; }

    public String getRelationType() { return relationType; }
    public void setRelationType(String relationType) { this.relationType = relationType; }

    public LocalDateTime getCreateTime() { return createTime; }
    public void setCreateTime(LocalDateTime createTime) { this.createTime = createTime; }

    public Byte getStatus() { return status; }
    public void setStatus(Byte status) { this.status = status; }
}
