<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Venda"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Vendas</title>
<link rel="stylesheet" type="text/css" href="./css/style_venda.css">
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
            <h1>Lista de Vendas</h1>
            <div class="table-container">
                <table border="1">
                    <thead>
                        <tr>
                            <th>Carro</th>
                            <th>Ano</th>
                            <th>Marca</th>
                            <th>Preço</th>
                            <th>Vendedor</th>
                            <th>Comprador</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                        // Recupera a lista de vendas da requisição
                        List<Venda> vendaList = (List<Venda>) request.getAttribute("vendaList");
                        if (vendaList != null) {
                            for (Venda venda : vendaList) {
                        %>
                        <tr>
                            
                            <td><%= venda.getCarroNome() %></td>
                            <td><%= venda.getAno() %></td>
                            <td><%= venda.getMarca() %></td>
                            <td>R$ <%= venda.getPreco() %></td>
                            <td><%= venda.getVendedorNome() %></td>
                            <td><%= venda.getCompradorNome() %></td>
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