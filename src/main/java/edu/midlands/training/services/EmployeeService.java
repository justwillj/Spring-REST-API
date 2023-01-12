package edu.midlands.training.services;

import edu.midlands.training.entities.Employee;
import java.util.List;

public interface EmployeeService {

  List<Employee> getEmployee();

  Employee addEmployee(Employee employee);

  List<Employee> isActive(boolean status);

  List<Employee> getActiveEmployees(boolean activeStatus);

  Employee getEmployeeById(int id);

  Employee updateEmployee(int id, Employee employee);
}
