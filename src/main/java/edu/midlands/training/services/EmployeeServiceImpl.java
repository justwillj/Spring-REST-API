package edu.midlands.training.services;

import edu.midlands.training.entities.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

  List<Employee> employeeList =new ArrayList<>();
  @Override
  public List<Employee> getEmployee() {
    return employeeList;
  }
}
