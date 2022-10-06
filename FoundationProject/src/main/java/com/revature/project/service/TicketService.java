package com.revature.project.service;

import com.revature.project.dao.TicketDAOImpl;
import com.revature.project.dao.TicketsDAO;
import com.revature.project.models.Employees;
import com.revature.project.models.Tickets;

import java.util.Scanner;

public class TicketService {

    Scanner sc = new Scanner(System.in);

    TicketsDAO td = new TicketDAOImpl();

    public void createTicket(Employees employees){
        System.out.println("Please enter reason for reimbursement");
        String reason = sc.nextLine();
        System.out.println("Please enter amount you wished to be reimbursed for");
        Double amount = sc.nextDouble();
        


        Tickets tickets = new Tickets(reason, amount, employee_id);

        boolean successful = td.createTicket(tickets);

        if (successful) {
            System.out.println("Ticket Created");
        }else {
            System.out.println("Something went wrong");
        }
    }
}
