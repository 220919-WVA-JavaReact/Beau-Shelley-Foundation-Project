package com.revature.project.dao;

import com.revature.project.models.Employees;
import com.revature.project.util.connectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public Employees getByUsername(String username) {
        Employees employees = new Employees();

        try (Connection conn = connectionUtil.getConnection()) {
            String sql = "Select * From employees where username = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);

            ResultSet rs;

            if ((rs = stmt.executeQuery()) != null) {
                rs.next();
                int receivedId = rs.getInt("employee_id");
                String receivedFirst = rs.getString("first");
                String receivedLast = rs.getString("last");
                String receivedUsername = rs.getString("username");
                String receivedPassword = rs.getString("password");

                employees = new Employees(receivedId, receivedFirst, receivedLast, receivedUsername, receivedPassword);
            }

        } catch (SQLException e) {
            System.out.println("Sorry, something went wrong!");
        }
        return employees;
    }


    @Override
    public Employees registerEmployees(String first, String last, String username, String password) {

        Employees employees = new Employees();

        try (Connection conn = connectionUtil.getConnection()) {
            String sql = "Insert into employees (first,last,username,password) values (?,?,?,?) Returning *";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, first);
            stmt.setString(2, last);
            stmt.setString(3, username);
            stmt.setString(4, password);

            ResultSet rs;

            if ((rs = stmt.executeQuery()) != null) {
                rs.next();
                int receivedId = rs.getInt("employee_id");
                String receivedFirst = rs.getString("first");
                String receivedLast = rs.getString("last");
                String receivedUsername = rs.getString("username");
                String receivedPassword = rs.getString("password");

                employees = new Employees(receivedId, receivedFirst, receivedLast, receivedUsername, receivedPassword);
            }

        } catch (SQLException e) {
            System.out.println("Unable to register user");
        }

        return employees;

    }
}
