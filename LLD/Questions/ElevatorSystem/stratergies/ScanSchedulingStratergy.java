package stratergies;

import models.Elevator;

public class ScanSchedulingStratergy implements SchedulingStratergy{

    @Override
    public int nextStop(Elevator elevator) {
        System.out.println("Inside Scan scheduling stratergy");
        return 0;
    }
}
