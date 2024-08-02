package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import model.DAO;
import services.UserService;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private UserService service = new UserService();
    
    
    public LoginServlet() {
    	super();
    	
    	
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtém os parâmetros do formulário de login
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        // Teste de conexão e verificação de usuário
        try {
            Boolean user = this.service.login(email, password);
            if (user) {
                // Usuário autenticado com sucesso
                HttpSession session = request.getSession();
                session.setAttribute("usuario", user);
                response.sendRedirect(request.getContextPath() + "/template/dashboard.jsp");
            } else {
                // Falha na autenticação, redireciona para login.jsp com mensagem de erro
                request.setAttribute("mensagemErro", "Usuário ou senha incorretos.");
                request.getRequestDispatcher("/template/login.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect(request.getContextPath() + "/template/login.jsp?error=internal");
        }
    }
    
}