package edu.midlands.training.services;

import edu.midlands.training.entities.Employee;
import java.util.List;

public interface EmployeeService {

  List<Employee> getEmployees(Boolean isActive);

  Employee addEmployee(Employee employee);

  List<Employee> getActiveEmployees(boolean isActive);

  Employee getEmployeeById(int id);

  Employee updateEmployee(int id, Employee employee);

  void deleteEmployee(Integer id);

  List<Employee> listOfEmployees();
}
