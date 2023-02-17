package com.example.testspringboot.dao;

import com.example.testspringboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {

    //自定义语句,nativeQuery表示原生的
    @Query(value = "select * from user where id = 1", nativeQuery = true)
    List<User> getAllBy();
}
