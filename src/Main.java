
import controller.AuthController;
import controller.UserController;
import model.User;
import view.LoginView;
import view.UserView;

public class Main {
    public static void main(String[] args) {
        LoginView loginView = new LoginView();
        AuthController authController = new AuthController();

        String email = loginView.getEmail();
        String password = loginView.getPassword();

        User user = authController.login(email, password);

        if (user != null) {
            loginView.showLoginSuccess();
            UserView userView = new UserView();
            UserController userController = new UserController(userView, user);
            userController.start();
        } else {
            loginView.showLoginFailure();
        }
    }
}
