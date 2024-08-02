package repo;

import model.Venda;
import arq.AbstractDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VendaDAO extends AbstractDAO {
    public VendaDAO() {
        super();
    }

    public List<Venda> getAllVendas() {
        String sql = "SELECT v.id, c.name AS nome_carro, c.ano, c.marca, c.preco, vend.name AS vendedor_nome, comp.name AS comprador_nome " +
                     "FROM venda v " +
                     "JOIN users vend ON v.id_vendedor = vend.id " +
                     "JOIN users comp ON v.id_comprador = comp.id " +
                     "JOIN vehicles c ON v.id_carro = c.id";
        List<Venda> vendas = new ArrayList<>();
        try {
            ResultSet res = this.dao.getQuery(sql, new ArrayList<>());
            
            if(res == null) {
            	return null;
            }
            
            while (res.next()) {
                int id = res.getInt("id");
                String carroNome = res.getString("nome_carro");
                int ano = res.getInt("ano");
                String marca = res.getString("marca");
                double preco = res.getDouble("preco");
                String vendedorNome = res.getString("vendedor_nome");
                String compradorNome = res.getString("comprador_nome");

                Venda venda = new Venda(id, 0, 0, 0, carroNome, ano, marca, null, preco, vendedorNome, compradorNome);
                vendas.add(venda);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vendas;
    }
}