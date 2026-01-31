package com.silvermate.backend.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "t_abnormal_alert")
public class AbnormalAlert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long alertId;

    @Column(nullable = false)
    private Long elderId;

    @Column(nullable = false)
    private Long childId;

    @Column(nullable = false, length = 50)
    private String alertType;

    @Column(nullable = false, length = 500)
    private String alertContent;

    @Column(nullable = false)
    private LocalDateTime alertTime;

    private Long relatedRecordId;

    @Column(nullable = false)
    private Byte readStatus = 0; // 0-未阅读, 1-已阅读

    private LocalDateTime readTime;

    // getter & setter
    public Long getAlertId() { return alertId; }
    public void setAlertId(Long alertId) { this.alertId = alertId; }

    public Long getElderId() { return elderId; }
    public void setElderId(Long elderId) { this.elderId = elderId; }

    public Long getChildId() { return childId; }
    public void setChildId(Long childId) { this.childId = childId; }

    public String getAlertType() { return alertType; }
    public void setAlertType(String alertType) { this.alertType = alertType; }

    public String getAlertContent() { return alertContent; }
    public void setAlertContent(String alertContent) { this.alertContent = alertContent; }

    public LocalDateTime getAlertTime() { return alertTime; }
    public void setAlertTime(LocalDateTime alertTime) { this.alertTime = alertTime; }

    public Long getRelatedRecordId() { return relatedRecordId; }
    public void setRelatedRecordId(Long relatedRecordId) { this.relatedRecordId = relatedRecordId; }

    public Byte getReadStatus() { return readStatus; }
    public void setReadStatus(Byte readStatus) { this.readStatus = readStatus; }

    public LocalDateTime getReadTime() { return readTime; }
    public void setReadTime(LocalDateTime readTime) { this.readTime = readTime; }
}
