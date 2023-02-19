package com.jwt.boot.relationExample.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
@Data
public class TestEntity4 extends BaseModel{

    private String nameT4;

    @ManyToMany(mappedBy = "testEntity4Set")
    Set<Employee> likes;
}
