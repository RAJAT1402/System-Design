package stratergies.spotAssignmentStratergy;

import models.ParkingSpot;
import models.VehicleType;

public class RandomSpotAssignmentStratergy implements SpotAssignment{

    @Override
    public ParkingSpot assignParkingSpot(VehicleType vehicleType) {
        System.out.println("random spot assignment");
       return null;
    }
    
}
