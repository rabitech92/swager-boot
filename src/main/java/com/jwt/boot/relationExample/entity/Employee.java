package com.jwt.boot.relationExample.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Employee extends BaseModel{
    private String nameT1;

    @ManyToOne
    @JoinColumn(name = "test_entity_id", referencedColumnName = "id",nullable = true)
    private Department department;

    //@OneToMany(mappedBy = "orderEntity")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eMPLOYEE")
    private List<TestEntity3> testEntity3s;


//    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Collection<TestEntity4> testEntity4s;


    @ManyToMany
    @JoinTable(
            name = "testEntity_like",
            joinColumns = @JoinColumn(name = "test_entit4_id"),
            inverseJoinColumns = @JoinColumn(name = "test_entit1_id"))
    Set<TestEntity4> testEntity4Set;
}
