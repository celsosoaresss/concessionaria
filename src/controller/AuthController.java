package controller;

import model.Database;
import model.User;
import model.Comprador;
import model.Vendedor;
import model.Gerente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthController {

    public User login(String email, String password) {
        String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            stmt.setString(2, password);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String name = rs.getString("name");
                    String cpf = rs.getString("cpf");
                    String role = rs.getString("type");

                    switch (role) {
                        case "Comprador":
                            return new Comprador(name, cpf, email, role);
                        case "Vendedor":
                            return new Vendedor(name, cpf, email, role);
                        case "Gerente":
                            return new Gerente(name, cpf, email, role);
                        default:
                            throw new IllegalArgumentException("Role desconhecido: " + role);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}