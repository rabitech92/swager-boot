package com.jwt.boot.relationExample.repository;

import com.jwt.boot.relationExample.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepo2  extends JpaRepository<Department, Long> {
}
