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

  @Override
  public List<Employee> isActive(boolean status) {
    List<Employee> activeEmployeeList = new ArrayList<>();
    for (Employee e: employeeList) {
      if(e.isActive() == status){
        activeEmployeeList.add(e);
      }
    }
    return activeEmployeeList;
  }


  @Override
  public List<Employee> getActiveEmployees(boolean activeStatus) {
    List<Employee> activeEmployeeList = new ArrayList<>();
    for (Employee e: employeeList) {
      if(e.isActive() != activeStatus){
         employeeList.remove(e);
      }
    }
    return employeeList;
  }

  @Override
  public Employee getEmployeeById(int id) {
    for (Employee e: employeeList) {
      if(e.getEmployeeId() == id){
        return e;
      }
    }
    return null;
  }
}
