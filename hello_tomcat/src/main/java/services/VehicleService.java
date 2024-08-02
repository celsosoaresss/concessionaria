package services;

import model.Vehicle;
import repo.VehicleDAO;

import java.util.List;

public class VehicleService {
    private VehicleDAO vehicleDAO = new VehicleDAO();

    public List<Vehicle> getAllVehicles() {
        return vehicleDAO.getAllVehicles();
    }
}