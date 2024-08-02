<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="../css/style.css">
</head>
<body>
    <div class="container">.
        <div class="login-box">
            <img src="../images/EDS.png" alt="Logo" class="logo">
            <h2>SEJA BEM-VINDO</h2>
            <form action="../LoginServlet" method="post">
                <label for="email">Insira o seu e-mail:</label>
                <input type="text" id="email" name="email" required>

                <label for="password">Insira sua senha:</label>
                <input type="password" id="password" name="password" required>

                <div class="button-container">
                    <button type="button" onclick="window.close();">Sair</button>
                    <button type="submit">Login</button>
                </div>
            </form>
            <% if(request.getParameter("error") != null) { %>
                <p style="color: red;">Usuário ou senha inválidos.</p>
            <% } %>
        </div>
    </div>
</body>
</html>