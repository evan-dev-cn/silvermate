package com.silvermate.backend.service;
import com.silvermate.backend.entity.User;
/**
 * ClassName: UserService
 * Package: com.silvermate.backend.service
 * Description:
 *
 * @Author Evander
 * @Create 2026/1/31 10:46
 * @Version 1.0
 */
public interface UserService {

    /**
     * 用户登录（子女端）
     * @param userAccount 账号
     * @param userPassword 明文密码
     * @return 登录成功的用户信息，失败返回 null
     */
    User login(String userAccount, String userPassword);
}
