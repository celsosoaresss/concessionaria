<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet" type="text/css" href="../css/style_menu.css">
</head>
<body>
	<div class="container">
		<div class="sidebar">
			<img src="../images/EDS.png" alt="Logo" class="logo">
			<div class="divider"></div>
			<h2>Menu</h2>
			<div class="menu-items">
				<a href="../users">Ver Usuários</a>
				<a href="../vehicles">Ver Carros</a>
				<a href="../sales">Ver Vendas</a> <!-- Caminho atualizado -->
			</div>
			<div class="logout-button-container">
				<form action="../LogoutServlet" method="post">
					<button type="submit" class="logout-button">Logout</button>
				</form>
			</div>
		</div>
		<div class="content">
			<h1>Bem-Vindo!</h1>
			<h3>Escolha uma das opções no menu à esquerda </h3>
			<!-- A tabela de carros foi removida conforme solicitado -->
		</div>
	</div>
</body>
</html>