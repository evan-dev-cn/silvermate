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
    private String relaitonType;

    @Column(nullable = false)
    private LocalDateTime createTime =LocalDateTime.now();

    @Column(nullable = false)
    private Byte status =1;//1有效0无效

}
