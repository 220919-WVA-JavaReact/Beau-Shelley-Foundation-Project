package com.revature.project.dao;

import com.revature.project.models.Employees;

public interface EmployeeDAO {

Employees getByUsername(String username);

Employees registerEmployees(String first, String last, String username, String password);




}
