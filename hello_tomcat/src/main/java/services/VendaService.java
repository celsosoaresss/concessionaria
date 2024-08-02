package services;

import model.Venda;
import repo.VendaDAO;

import java.util.List;

public class VendaService {
    private VendaDAO vendaDAO = new VendaDAO();

    public List<Venda> getAllVendas() {
        return this.vendaDAO.getAllVendas();
    }
}