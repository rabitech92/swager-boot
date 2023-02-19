package com.jwt.boot.relationExample.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class TestEntity3 extends BaseModel{
    private String nameT3;


    @ManyToOne
    @JoinColumn(name = "test_entity_id", referencedColumnName = "id", nullable = true)
    private Employee eMPLOYEE;
}
