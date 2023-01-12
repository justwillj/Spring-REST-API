package edu.midlands.training.entities;

public class Employee {

  private Integer employeeId;

  private String firstName;

  private String lastName;

  private String age;

  private boolean isActive;


  public Employee() {
  }

  public Employee(Integer employeeId, String firstName, String lastName, String age,
      boolean isActive) {
    this.employeeId = employeeId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.isActive = isActive;
  }

}
