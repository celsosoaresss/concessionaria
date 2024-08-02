package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Vehicle;
import services.VehicleService;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = { "/vehicles" })
public class CarrosListServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private VehicleService service = new VehicleService();

    public CarrosListServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obter a lista de veículos do serviço
        List<Vehicle> vehicleList = this.service.getAllVehicles();

        // Definir a lista de veículos como um atributo da requisição
        request.setAttribute("vehicleList", vehicleList);

        // Encaminhar para a JSP para exibir a tabela de veículos
        request.getRequestDispatcher("/template/vehicle.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}