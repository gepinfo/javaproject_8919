package com.geppetto.javaproject.dao;

import com.geppetto.javaproject.model.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import java.util.Optional;

public interface EmployeeDao {

    Employee createEmployee(Employee employee);

    Page<Employee> getAllEmployee(Pageable pageable);

    Optional<Employee> updateEmployee(String id);

    void deleteEmployee(String id);

    Optional<Employee> getEmployeeById(String id);

}

