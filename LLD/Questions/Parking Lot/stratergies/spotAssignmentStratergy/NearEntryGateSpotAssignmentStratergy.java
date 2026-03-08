package stratergies.spotAssignmentStratergy;

import models.ParkingSpot;
import models.VehicleType;

public class NearEntryGateSpotAssignmentStratergy implements spotAssignment{

    @Override
    public ParkingSpot assignParkingSpot(VehicleType vehicleType) {
        System.out.println("Near entry gate spot assignment");

        return null;
    }
    
}
