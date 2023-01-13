package edu.midlands.training.entities;

import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
  private static AtomicInteger ID_GENERATOR  = new AtomicInteger(1);
  private String employeeId = String.valueOf(ID_GENERATOR.getAndIncrement());

  private String firstName;

  private String lastName;

  private String title;

  private boolean isActive;

  private int tenure;


  public Employee() {
  }

  public Employee(String firstName, String lastName, String title, boolean isActive,
      int tenure) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.title = title;
    this.isActive = isActive;
    this.tenure = tenure;
  }

  public static AtomicInteger getIdGenerator() {
    return ID_GENERATOR;
  }

  public static void setIdGenerator(AtomicInteger idGenerator) {
    ID_GENERATOR = idGenerator;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean active) {
    isActive = active;
  }

  public int getTenure() {
    return tenure;
  }

  public void setTenure(int tenure) {
    this.tenure = tenure;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "employeeId=" + employeeId +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", title='" + title + '\'' +
        ", isActive=" + isActive +
        ", tenure=" + tenure +
        '}';
  }
}
