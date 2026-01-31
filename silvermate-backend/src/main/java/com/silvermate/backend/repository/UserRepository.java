package com.silvermate.backend.repository;

import com.silvermate.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserAccountAndUserPassword(String userAccount, String userPassword);

}
