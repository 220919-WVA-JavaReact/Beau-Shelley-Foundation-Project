package com.revature.project;

import com.revature.project.models.Employees;
import com.revature.project.service.EmployeeService;
import com.revature.project.service.TicketService;

import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    static EmployeeService es = new EmployeeService();

    static TicketService ts =new TicketService();


    public static void main(String[] args){

        Employees loggedInUser = null;
        boolean running = true;

        while (running){
            if (loggedInUser == null){
                System.out.println("Press 1 to Login, 2 to Register, or q to quit");
                String choice = sc.nextLine();

                switch (choice){
                    case "1":
                        loggedInUser = es.login();
                        break;
                    case "2":
                        loggedInUser = es.register();
                        break;
                    case "q":
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid Input");
                }
            }else {
                System.out.println("To create a reimbursement ticket press 1 or q to quit");
                String choice = sc.nextLine();
                switch(choice){
                    case "1":
                    ts.createTicket(loggedInUser);
                    break;
                    case"q":
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid Input");
                }
            }
        }

    }
}
