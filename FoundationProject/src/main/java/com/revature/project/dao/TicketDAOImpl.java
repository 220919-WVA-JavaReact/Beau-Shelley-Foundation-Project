package com.revature.project.dao;

import com.revature.project.models.Tickets;
import com.revature.project.util.connectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TicketDAOImpl implements TicketsDAO{
    @Override
    public boolean createTicket(Tickets tickets) {

        try (Connection conn = connectionUtil.getConnection()){
          String sql = "Insert Into ticket (reason, amount, employee_id)  values (?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, tickets.getReason());
            stmt.setDouble(2, tickets.getAmount());
            stmt.setInt(3, tickets.getEmployeeId());

            int rowsUpdated = stmt.executeUpdate();

            if (rowsUpdated == 1){
                return true;
            }

        }catch (SQLException e) {
            System.out.println("Sorry, something went wrong");
        }
        return false;
    }
}
