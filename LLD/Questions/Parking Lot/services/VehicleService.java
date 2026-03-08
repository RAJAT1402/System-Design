package services;

import models.Vehicle;
import models.VehicleType;
import repositories.VehicleRepository;

public class VehicleService {
    
    private VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository){
        this.vehicleRepository = vehicleRepository;
    }

    public Vehicle getVehicle(String vehicleNumber){

        // DB Call
        return null;
    }

    public Vehicle registerVehicle(String vehicleNumber, VehicleType vehicleType) {
        
        Vehicle vehicle = new Vehicle();
        vehicle.setId(1L);
        vehicle.setNumber(vehicleNumber);
        vehicle.setVehicleType(vehicleType);

        vehicleRepository.saveVehicle(vehicle);

        return vehicle;
    }
}
