package repo;

import model.Vehicle;
import arq.AbstractDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VehicleDAO extends AbstractDAO {
    public VehicleDAO() {
        super();
    }

    public List<Vehicle> getAllVehicles() {
        String sql = "SELECT * FROM vehicles";
        List<Vehicle> vehicles = new ArrayList<>();
        try {
            ResultSet res = this.dao.getQuery(sql, new ArrayList<>());
            while (res.next()) {
                int id = res.getInt("id");
                String name = res.getString("name");
                int ano = res.getInt("ano");
                String marca = res.getString("marca");
                String modelo = res.getString("modelo");
                double preco = res.getDouble("preco");

                Vehicle vehicle = new Vehicle(id, name, ano, marca, modelo, preco, ano, modelo, ano, preco, modelo);
                vehicles.add(vehicle);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vehicles;
    }
}