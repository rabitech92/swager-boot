package com.jwt.boot.relationExample.repository;

import com.jwt.boot.relationExample.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestRepo extends JpaRepository<Employee, Long> {
    List<Employee> findByDepartmentId(Long id);
}
