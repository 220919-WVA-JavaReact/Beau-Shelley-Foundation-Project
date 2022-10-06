package com.revature.project.models;

import java.util.Objects;

public class Tickets {

    private int ticket_id;

    private String reason;

    private String status;

    private double amount;

    private int employeeId;

    public Tickets(int ticket_id, String reason, String status, double amount, int employeeId) {
        this.ticket_id = ticket_id;
        this.reason = reason;
        this.status = status;
        this.amount = amount;
        this.employeeId = employeeId;
    }


    public Tickets(String reason, String status, double amount, int employeeId) {
        this.reason = reason;
        this.status = status;
        this.amount = amount;
        this.employeeId = employeeId;
    }

    public Tickets(String reason, double amount, int employeeId) {
        this.reason = reason;
        this.amount = amount;
        this.employeeId = employeeId;
    }

    public Tickets() {
    }

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Tickets{" +
                "ticket_id=" + ticket_id +
                ", reason='" + reason + '\'' +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                ", employeeId=" + employeeId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tickets tickets = (Tickets) o;
        return ticket_id == tickets.ticket_id && Double.compare(tickets.amount, amount) == 0 && employeeId == tickets.employeeId && reason.equals(tickets.reason) && status.equals(tickets.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticket_id, reason, status, amount, employeeId);
    }
}

