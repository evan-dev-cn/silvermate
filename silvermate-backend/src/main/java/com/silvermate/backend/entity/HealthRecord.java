package com.silvermate.backend.entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;
/**
 * ClassName: HealthRecord
 * Package: com.silvermate.backend.entity
 * Description:
 *
 * @Author Evander
 * @Create 2026/1/31 10:31
 * @Version 1.0
 */
@Entity
@Table(name = "t_health_record")
public class HealthRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long healthId;

    @Column(nullable = false)
    private long userId;

    @Column(nullable = false, length = 50)
    private String healthType;

    @Column(nullable = false, length = 50)
    private String healthValue;

    @Column(length = 100)
    private String normalRange;

    @Column(nullable = false)
    private LocalDateTime recordTime;

    @Column(nullable = false)
    private Byte recordWay = 1; // 1-手动录入, 2-设备同步

    @Column(length = 500)
    private  String remark;

    @Column(nullable = false)
    private LocalDateTime createTime = LocalDateTime.now();

    //getter&setter
    public long getHealthId() {return healthId;}
    public void setHealthId(long healthId) {this.healthId = healthId;}

    public long getuserId() {return userId;}
    public void setUserId(long userId){this.userId = userId;}

    public String getHealthType() { return healthType; }
    public void setHealthType(String healthType) { this.healthType = healthType; }

    public String getHealthValue() { return healthValue; }
    public void setHealthValue(String healthValue) { this.healthValue = healthValue; }

    public String getNormalRange() { return normalRange; }
    public void setNormalRange(String normalRange) { this.normalRange = normalRange; }

    public LocalDateTime getRecordTime() { return recordTime; }
    public void setRecordTime(LocalDateTime recordTime) { this.recordTime = recordTime; }

    public Byte getRecordWay() { return recordWay; }
    public void setRecordWay(Byte recordWay) { this.recordWay = recordWay; }

    public String getRemark() { return remark; }
    public void setRemark(String remark) { this.remark = remark; }

    public LocalDateTime getCreateTime() { return createTime; }
    public void setCreateTime(LocalDateTime createTime) { this.createTime = createTime; }

}
