package com.gl.empmgmt.samir.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.empmgmt.samir.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
}
