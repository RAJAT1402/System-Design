package stratergies;

import java.util.Queue;

import models.Direction;
import models.Elevator;
import models.ElevatorRequest;

public class FCFSSchedulingStratergy implements SchedulingStratergy{

    @Override
    public int nextStop(Elevator elevator) {

        System.out.println("First come first server Scheduling Stratergy");

        Direction elevatorDirection = elevator.getDirection();
        int currentFloor = elevator.getCurrentFloor();
        Queue<ElevatorRequest> elevatorRequests = elevator.getElevatorRequests();

        // If queue is empty then return the current floow
        if(elevatorRequests.isEmpty()){
            return currentFloor;
        }

        // Take out the next request
        int nextFloorRequest = elevatorRequests.remove().getFloorNumber();

        // if next floor is current floor then dont do nothing
        if(nextFloorRequest == currentFloor){
            return currentFloor;
        }

        // Set the elevator direction

        if(elevatorDirection == Direction.IDLE){
            elevator.setDirection(nextFloorRequest > currentFloor ? Direction.UP : Direction.DOWN);
        }else if(elevatorDirection == Direction.UP && nextFloorRequest < currentFloor){
            elevator.setDirection(Direction.DOWN);
        }else if(elevatorDirection == Direction.DOWN && nextFloorRequest > currentFloor){
            elevator.setDirection(Direction.DOWN);
        }

        return nextFloorRequest;
    }
    
    
}
