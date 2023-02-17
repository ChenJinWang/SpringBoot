package com.example.testspringboot.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id
    private Integer id;
    private String name;
    private Integer t_id;
}
