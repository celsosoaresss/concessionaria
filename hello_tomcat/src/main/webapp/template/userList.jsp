<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.User"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Usuários</title>
<link rel="stylesheet" type="text/css" href="./css/style_users.css">
</head>
<body>
	<div class="container">
		<div class="sidebar">
			<img src="./images/EDS.png" alt="Logo" class="logo">
			<div class="divider"></div>
			<h2>Menu</h2>
			<div class="menu-items">
				<a href="./users">Ver Usuários</a> <a
					href="./vehicles">Ver Carros</a> <a href="./sales">Ver
					Vendas</a>
			</div>
			<div class="logout-button-container">
				<form action="./LogoutServlet" method="post">
					<button type="submit" class="logout-button">Logout</button>
				</form>
			</div>
		</div>
		<div class="content">
			<h1>Todos os usuários</h1>
			<div class="table-container">
				<table border="1">
					<thead>
						<tr>
							<th>Tipo</th>
							<th>Nome</th>
							<th>Email</th>
							<th>CPF</th>
						</tr>
					</thead>
					<tbody>
						<%
                        // Recupera a lista de usuários da requisição
                        List<model.User> userList = (List<model.User>) request.getAttribute("userList");
                        if (userList != null) {
                            for (model.User user : userList) {
                    %>
						<tr>
							<td><%= user.getType() %></td>
							<td><%= user.getName() %></td>
							<td><%= user.getEmail() %></td>
							<td><%= user.getCpf() %></td>
						</tr>
						<%
                            }
                        }
                    %>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>