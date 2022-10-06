package com.revature.project.models;

import java.util.Objects;

public class Employees {

    private int employee_id;

    private String first;

    private String last;

    private String username;

    private String password;


    public Employees(int employee_id, String first, String last, String username, String password) {
        this.employee_id = employee_id;
        this.first = first;
        this.last = last;
        this.username = username;
        this.password = password;
    }

    public Employees(String first, String last, String username, String password) {
        this.first = first;
        this.last = last;
        this.username = username;
        this.password = password;
    }

    public Employees() {
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employee_id=" + employee_id +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return employee_id == employees.employee_id && first.equals(employees.first) && last.equals(employees.last) && username.equals(employees.username) && password.equals(employees.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee_id, first, last, username, password);
    }
}
