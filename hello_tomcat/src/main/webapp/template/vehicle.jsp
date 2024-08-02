<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Vehicle"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Veículos</title>
<link rel="stylesheet" type="text/css" href="./css/style_users.css">
</head>
<body>
    <div class="container">
        <div class="sidebar">
            <img src="./images/EDS.png" alt="Logo" class="logo">
            <div class="divider"></div>
            <h2>Menu</h2>
            <div class="menu-items">
                <a href="./users">Ver Usuários</a> 
                <a href="./vehicles">Ver Carros</a> 
                <a href="./sales">Ver Vendas</a>
            </div>
            <div class="logout-button-container">
                <form action="./LogoutServlet" method="post">
                    <button type="submit" class="logout-button">Logout</button>
                </form>
            </div>
        </div>
        <div class="content">
            <h1>Todos os veículos</h1>
            <div class="table-container">
                <table border="1">
                    <thead>
                        <tr>
                            <th>Nome</th>
                            <th>Ano</th>
                            <th>Marca</th>
                            <th>Modelo</th>
                            <th>Preço</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                        // Recupera a lista de veículos da requisição
                        List<Vehicle> vehicleList = (List<Vehicle>) request.getAttribute("vehicleList");
                        if (vehicleList != null) {
                            for (Vehicle vehicle : vehicleList) {
                        %>
                        <tr>
                            <td><%= vehicle.getName() %></td>
                            <td><%= vehicle.getAno() %></td>
                            <td><%= vehicle.getMarca() %></td>
                            <td><%= vehicle.getModelo() %></td>
                            <td>R$ <%= vehicle.getPreco() %></td>
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