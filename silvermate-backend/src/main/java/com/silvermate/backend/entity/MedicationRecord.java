package com.silvermate.backend.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "t_medication_record")
public class MedicationRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long medicationId;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false, length = 100)
    private String drugName;

    @Column(nullable = false, length = 50)
    private String drugDosage;

    @Column(nullable = false)
    private LocalDateTime medicationTime;

    private LocalDateTime actualMedicationTime;

    @Column(nullable = false)
    private Byte medicationStatus = 0; // 0-未服药, 1-已服药, 2-逾期未服

    private LocalDateTime reminderTime;

    @Column(length = 500)
    private String remark;

    @Column(nullable = false)
    private LocalDateTime createTime = LocalDateTime.now();

    @Column(nullable = false)
    private LocalDateTime updateTime = LocalDateTime.now();

    // getter & setter
    public Long getMedicationId() { return medicationId; }
    public void setMedicationId(Long medicationId) { this.medicationId = medicationId; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public String getDrugName() { return drugName; }
    public void setDrugName(String drugName) { this.drugName = drugName; }

    public String getDrugDosage() { return drugDosage; }
    public void setDrugDosage(String drugDosage) { this.drugDosage = drugDosage; }

    public LocalDateTime getMedicationTime() { return medicationTime; }
    public void setMedicationTime(LocalDateTime medicationTime) { this.medicationTime = medicationTime; }

    public LocalDateTime getActualMedicationTime() { return actualMedicationTime; }
    public void setActualMedicationTime(LocalDateTime actualMedicationTime) { this.actualMedicationTime = actualMedicationTime; }

    public Byte getMedicationStatus() { return medicationStatus; }
    public void setMedicationStatus(Byte medicationStatus) { this.medicationStatus = medicationStatus; }

    public LocalDateTime getReminderTime() { return reminderTime; }
    public void setReminderTime(LocalDateTime reminderTime) { this.reminderTime = reminderTime; }

    public String getRemark() { return remark; }
    public void setRemark(String remark) { this.remark = remark; }

    public LocalDateTime getCreateTime() { return createTime; }
    public void setCreateTime(LocalDateTime createTime) { this.createTime = createTime; }

    public LocalDateTime getUpdateTime() { return updateTime; }
    public void setUpdateTime(LocalDateTime updateTime) { this.updateTime = updateTime; }
}
