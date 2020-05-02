package org.personal.employee.dao;

import org.personal.employee.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    Employee save(Employee Employee);

    Employee update(Employee Employee);

    List<Employee> findAll();

    Employee remove(Long id);

    Employee findOne(Long id);
}
