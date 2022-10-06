package com.revature.project.service;

import com.revature.project.dao.EmployeeDAO;
import com.revature.project.dao.EmployeeDAOImpl;
import com.revature.project.dao.TicketDAOImpl;
import com.revature.project.dao.TicketsDAO;
import com.revature.project.models.Employees;

import java.util.Scanner;

public class EmployeeService {

    Scanner sc = new Scanner(System.in);

    EmployeeDAO td = new EmployeeDAOImpl();

    public Employees login(){
        System.out.println("Please enter your username");
        String username = sc.nextLine();
        System.out.println("Please enter your password");
        String password = sc.nextLine();

        Employees employees = td.getByUsername(username);
        if (employees.getEmployee_id() == 0){
            System.out.println("No user associated with that username");
        }else {
            if (employees.getPassword().equals(password)){
                System.out.println("Welcome to the reimbursement service");
                return employees;
            }
        }
        return null;
    }

    public Employees register(){
        System.out.println("Please enter your first name");
        String first = sc.nextLine();
        System.out.println("Please enter your last name");
        String last = sc.nextLine();
        System.out.println("Please enter your username");
        String username = sc.nextLine();
        System.out.println("Please enter your password");
        String password = sc.nextLine();

        Employees employees = td.registerEmployees(first,last,username,password);
        if (employees.getEmployee_id() != 0){
            System.out.println("Registration Complete");
            return employees;
        }
        return null;
    }


}
