package stratergies;

import models.Elevator;

public interface SchedulingStratergy {
    
    int nextStop(Elevator elevator);
}
