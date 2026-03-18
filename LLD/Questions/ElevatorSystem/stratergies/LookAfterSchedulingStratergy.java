package stratergies;

import java.util.Queue;

import models.Direction;
import models.Elevator;
import models.ElevatorRequest;
import models.RequestType;

public class LookAfterSchedulingStratergy implements SchedulingStratergy{

    @Override
    public int nextStop(Elevator elevator) {
        System.out.println("Look after scheduling stratergy");

        int currentFloor = elevator.getCurrentFloor();
        Queue<ElevatorRequest> requestQueue = elevator.getElevatorRequests();

        // If Request floor is empty -> currentFloor
        if(requestQueue.isEmpty()){
            return currentFloor;
        }

        // Take out the front request
        ElevatorRequest primaryRequest = requestQueue.peek();

        // Floor from the current request
        int primaryFloor = primaryRequest.getFloorNumber();

        // Decide the direction
        Direction direction;

        if(primaryFloor > currentFloor){
            direction = Direction.UP;
        }else if(primaryFloor < currentFloor){
            direction = Direction.DOWN;
        }else{
            return currentFloor;
        }

        Integer nextFloorRequest = null;

        // Iterate over the requests
        for(ElevatorRequest request : requestQueue){
            int reqFloor = request.getFloorNumber();

            if(direction == Direction.UP && reqFloor > currentFloor && reqFloor <= primaryFloor){
                if(request.getRequestType() == RequestType.INTERNAL || 
                    (request.getRequestType() == RequestType.EXTERNAL && request.getDirection() == Direction.UP)){
                        if(nextFloorRequest == null || nextFloorRequest > reqFloor){
                            nextFloorRequest = reqFloor;
                        }
                }
            }else if(direction == Direction.DOWN && reqFloor < currentFloor && reqFloor >= primaryFloor){
                if(request.getRequestType() == RequestType.INTERNAL || 
                    ( request.getRequestType() == RequestType.EXTERNAL && request.getDirection() == Direction.DOWN)){
                        if(nextFloorRequest == null || nextFloorRequest < reqFloor){
                            nextFloorRequest = reqFloor;
                        }
                }
            }
        }

        return (nextFloorRequest == null) ? primaryFloor : nextFloorRequest;
    }
    
}
