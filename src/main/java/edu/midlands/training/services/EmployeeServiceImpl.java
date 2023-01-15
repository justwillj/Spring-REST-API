package edu.midlands.training.services;

import edu.midlands.training.entities.Employee;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IllegalFormatCodePointException;
import java.util.List;
import java.util.Objects;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
  Employee employee1 = new Employee("James","Smith","Research Aide",true,3);
  Employee employee2 = new Employee("Robert","Williams","Developer",false,11);
  Employee employee3 = new Employee("Maria","Brown","Research Aide",true,2);
  Employee employee4 = new Employee("Mary","Jones","Developer",false,10);
  Employee employee5 = new Employee("David","Johnson","Manager",true,20);

  List<Employee> employeeList =new ArrayList<>(List.of(employee1,employee2,employee3,employee4,employee5));


  @Override
  public List<Employee> getEmployees(Boolean isActive) {
    if (isActive == null){
      return employeeList;
    }
    List<Employee> activeEmployeeList = new ArrayList<>();
    for (Employee e: employeeList) {
      if(e.isActive() == isActive){
        activeEmployeeList.add(e);
      }

    }
    return activeEmployeeList;
  }

  @Override
  public Employee addEmployee(Employee employee) {
    employeeList.add(employee);
    return employee;
  }


  @Override
  public List<Employee> getActiveEmployees(boolean isActive) {
    List<Employee> activeEmployeeList = new ArrayList<>();
    for (Employee e: employeeList) {
      if(e.isActive() == isActive){
        activeEmployeeList.add(e);
      }

    }
    return activeEmployeeList;
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
    employeeList.add(employee1);
    employeeList.add(employee2);
    employeeList.add(employee3);
    employeeList.add(employee4);
    employeeList.add(employee5);
    return employeeList;
  }


}
