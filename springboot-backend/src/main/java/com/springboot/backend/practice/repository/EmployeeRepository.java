package com.springboot.backend.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.backend.practice.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
