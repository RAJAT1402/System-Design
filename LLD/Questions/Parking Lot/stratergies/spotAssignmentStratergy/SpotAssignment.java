package stratergies.spotAssignmentStratergy;

import models.ParkingSpot;
import models.VehicleType;

public interface SpotAssignment {

    ParkingSpot assignParkingSpot(VehicleType vehicleType);
}