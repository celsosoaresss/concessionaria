package view;

import model.Comprador;
import model.Vendedor;
import model.Gerente;
import model.User;
import java.util.Scanner;

public class UserView {
    private Scanner scanner;

    public UserView() {
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Bem-vindo ao sistema da concessionária!");
        System.out.println("Escolha uma opção:");
        System.out.println("1. Ver informações do usuário");
        System.out.println("2. Cadastrar usuário");
        System.out.println("3. Cadastrar cliente");
        System.out.println("4. Sair");
    }

    public void displayProfile(User user) {
        System.out.println("Perfil do Usuário:");
        System.out.println(user);
    }

    public void showUserInfo(User user) {
        System.out.println("===== Informações do Usuário Logado =====");
        System.out.println("Nome: " + user.getName());
        System.out.println("CPF: " + user.getCpf());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Tipo: " + user.getType());
        System.out.println("=========================================");
    }

    public int getUserChoice() {
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public User getUserDetails() {
        scanner.nextLine(); // Consumir a nova linha
        System.out.print("Nome: ");
        String name = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        //String password = scanner.nextLine();
        System.out.print("Tipo (Comprador/Vendedor/Gerente): ");
        String type = scanner.nextLine();

        switch (type) {
            case "Comprador":
                return new Comprador(name, cpf, email, type);
            case "Vendedor":
                return new Vendedor(name, cpf, email, type);
            case "Gerente":
                return new Gerente(name, cpf, email, type);
            default:
                throw new IllegalArgumentException("Tipo desconhecido: " + type);
        }
    }

    public void showUserCreatedSuccess() {
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void showClientCreatedSuccess() {
        System.out.println("Cliente cadastrado com sucesso!");
    }
}