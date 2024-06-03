package controller;

import model.Database;
import model.User;
import view.UserView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserController {
    private UserView view;
    private User user;

    public UserController(UserView view, User user) {
        this.view = view;
        this.user = user;
    }

    public void start() {
        view.showUserInfo(user); // Exibir as informações do usuário logado
        int choice;
        do {
            view.displayMenu();
            choice = view.getUserChoice();
            switch (choice) {
                case 1:
                    view.displayProfile(user);
                    break;
                case 2:
                    User newUser = view.getUserDetails();
                    createUser(newUser);
                    view.showUserCreatedSuccess();
                    break;
                case 3:
                    User newClient = view.getUserDetails(); // Supondo que clientes e usuários têm os mesmos campos
                    createClient(newClient);
                    view.showClientCreatedSuccess();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (choice != 4);
    }

    private void createUser(User user) {
        String sql = "INSERT INTO users (name, cpf, email, password, type) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getCpf());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, "defaultPassword"); // Mudar para senha real se estiver capturando
            stmt.setString(5, user.getType());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void createClient(User user) {
        // A lógica para criar um cliente pode ser similar ao método createUser
        createUser(user); // Assumindo que é similar, chamamos createUser
    }
}