package view;

import java.util.Scanner;

public class LoginView {
    private Scanner scanner;

    public LoginView() {
        this.scanner = new Scanner(System.in);
    }

    public String getEmail() {
        System.out.print("Email: ");
        return scanner.nextLine();
    }

    public String getPassword() {
        System.out.print("Senha: ");
        return scanner.nextLine();
    }

    public void showLoginSuccess() {
        System.out.println("Login realizado com sucesso!");
    }

    public void showLoginFailure() {
        System.out.println("Falha no login. Verifique suas credenciais.");
    }
}
