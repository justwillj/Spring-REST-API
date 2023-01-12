package edu.midlands.training.services;

import edu.midlands.training.entities.Employee;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  List<Employee> employeeList =new ArrayList<>();
  @Override
  public List<Employee> getEmployee() {
    return employeeList;
  }

  @Override
  public Employee addEmployee(Employee employee) {
    employeeList.add(employee);
    return employee;
  }
}
