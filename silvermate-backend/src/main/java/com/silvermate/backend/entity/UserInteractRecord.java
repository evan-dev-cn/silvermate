package com.silvermate.backend.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "t_user_interact_record")
public class UserInteractRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long interactId;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String userInput;

    @Column(columnDefinition = "TEXT")
    private String aiResponse;

    @Column(nullable = false)
    private Byte executeStatus = 0; // 0-未执行, 1-执行成功, 2-执行失败

    @Column(nullable = false)
    private LocalDateTime interactTime = LocalDateTime.now();

    // getter & setter
    public Long getInteractId() { return interactId; }
    public void setInteractId(Long interactId) { this.interactId = interactId; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public String getUserInput() { return userInput; }
    public void setUserInput(String userInput) { this.userInput = userInput; }

    public String getAiResponse() { return aiResponse; }
    public void setAiResponse(String aiResponse) { this.aiResponse = aiResponse; }

    public Byte getExecuteStatus() { return executeStatus; }
    public void setExecuteStatus(Byte executeStatus) { this.executeStatus = executeStatus; }

    public LocalDateTime getInteractTime() { return interactTime; }
    public void setInteractTime(LocalDateTime interactTime) { this.interactTime = interactTime; }
}
