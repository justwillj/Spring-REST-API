package edu.midlands.training.services;

import edu.midlands.training.entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  List<Employee> employeeList =new ArrayList<>();
  Employee employee1 = new Employee("fsdf","Test","TEST",true,5);



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
      if(Objects.equals(e.getEmployeeId(), String.valueOf(id))){
        return e;
      }
    }
    return null;
  }

  @Override
  public Employee updateEmployee(int id, Employee employee) {
    Employee oldEmployee = getEmployeeById(id);
    for (Employee e: employeeList) {
      if(Objects.equals(e.getEmployeeId(), String.valueOf(id))){
        int index = employeeList.indexOf(e);
        oldEmployee = employee;
        employeeList.set(index,oldEmployee);
      }
    }
    return oldEmployee;
  }

  @Override
  public void deleteEmployee(Integer id) {
    Employee oldEmployee = getEmployeeById(id);
    employeeList.remove(oldEmployee);
  }

  @Override
  public List<Employee> listOfEmployees() {
    return employeeList;
  }


}
