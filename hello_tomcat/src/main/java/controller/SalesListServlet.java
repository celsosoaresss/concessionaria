package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Venda;
import services.VendaService;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = { "/sales" })
public class SalesListServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private VendaService service = new VendaService();

    public SalesListServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obter a lista de vendas do serviço
        List<Venda> vendaList = this.service.getAllVendas();

        // Definir a lista de vendas como um atributo da requisição
        request.setAttribute("vendaList", vendaList);

        // Encaminhar para a JSP para exibir a tabela de vendas
        request.getRequestDispatcher("/template/sales.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}