package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Cliente {
    public void imprimirClientes() {
        String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/empresa";
        String user = "root";
        String password = "081002";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, user, password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM clientes");

            while (resultSet.next()) {
                System.out.println("Nome: " + resultSet.getString("Nome") +
                        ", CPF: " + resultSet.getString("CPF") +
                        ", Cidade: " + resultSet.getString("Cidade"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


