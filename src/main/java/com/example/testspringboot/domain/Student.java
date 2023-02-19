package com.example.testspringboot.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {  //实现序列化，否则无法存入redis数据库
    private Integer id;
    private String name;
    private String age;
    private String sex;

}
