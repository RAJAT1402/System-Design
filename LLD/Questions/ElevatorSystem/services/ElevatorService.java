package services;

import java.util.Iterator;
import java.util.Queue;

import constants.ElevatorConstants;
import models.Direction;
import models.Elevator;
import models.ElevatorRequest;
import models.RequestType;
import stratergies.SchedulingStratergy;

public class ElevatorService {
    
    private final Elevator elevator;
    private final SchedulingStratergy schedulingStratergy;

    public ElevatorService(Elevator elevator, SchedulingStratergy schedulingStratergy){
        this.elevator = elevator;
        this.schedulingStratergy = schedulingStratergy;
    }

    public void addRequest(ElevatorRequest  elevatorRequest){
        Queue<ElevatorRequest> elevatorRequestQueue = elevator.getElevatorRequests();
        
        // Do Basic Checks
        // 1> Queue should not be null
        // 2> handle the duplicate requests 

        if(elevatorRequest == null){
            // throw exception
        }

        elevatorRequestQueue.add(elevatorRequest);
        
    }

    public void step(){

        Queue<ElevatorRequest> requests = elevator.getElevatorRequests();

        // If queue is empty or null
        if(requests == null || requests.isEmpty()){
            elevator.setDirection(Direction.IDLE);
            return;
        }

        // Get the current floor
        int currentFloor = elevator.getCurrentFloor();

        // Get the target floor by scheduling stratergy
        int targetFloor = schedulingStratergy.nextStop(elevator);

        // If current floor = target floor
        // 1> processArrivalsAtFloor
        // 2> If queue is empty -> set dir as IDLE
        // 3> If queue is not empty -> get new target floor by scheduling stratergy
        // 4> Based on greater and smaller -> set the direction
        if(currentFloor == targetFloor){

            processArrivalsAtFloor(currentFloor); // Some task related to opening / closing

            if(requests.isEmpty()){
                elevator.setDirection(Direction.IDLE);
            }else{
                int newTargetFloor = schedulingStratergy.nextStop(elevator);
                if(newTargetFloor > currentFloor){
                    elevator.setDirection(Direction.DOWN);
                }else if(newTargetFloor < currentFloor){
                    elevator.setDirection(Direction.UP);
                }else{
                    elevator.setDirection(Direction.IDLE);
                }
            }
        }


        // Flow for when current floor != target floor
        // 1> set the new floor as current floor 
        // 2> set the direction
        // 3> perform process at arrival
        // 4> check for queue is empty or not -> set the dir
        int newFloor = currentFloor;
        if(targetFloor > currentFloor){
            newFloor = currentFloor + 1;
            elevator.setDirection(Direction.UP);
        }else{
            newFloor = currentFloor - 1;
            elevator.setDirection(Direction.DOWN);
        }

        elevator.setCurrentFloor(newFloor);
        processArrivalsAtFloor(newFloor);

        if(requests.isEmpty()){
            elevator.setDirection(Direction.IDLE);
        }
    }

    public String elevatorStatus(){
        Queue<ElevatorRequest> elevatorRequests = elevator.getElevatorRequests();
        int size = elevatorRequests.size();

        return String.format("Floor = %s, Dir = %s, QueueSize = %s", elevator.getCurrentFloor(), elevator.getDirection(), size);
    }

    private void processArrivalsAtFloor(int floor){

        Queue<ElevatorRequest> requests = elevator.getElevatorRequests();

        // If queue is empty or null
        if(requests == null || requests.isEmpty()){
            return;
        }

        Iterator<ElevatorRequest> it = requests.iterator();
        while(it.hasNext()){
            ElevatorRequest request = it.next();

            if(request.getFloorNumber() != floor){
                continue;
            }

            if(request.getRequestType() == RequestType.INTERNAL){
                it.remove();

                System.out.println("Dropped of the passenger at the floor " + request.getFloorNumber());
            }else{
                double currentWeight = elevator.getWeight();
                double capacityWeight = elevator.getCapacity();
               
                if(currentWeight + ElevatorConstants.AVERAGE_WEIGHT <= capacityWeight){
                    elevator.setWeight(currentWeight + ElevatorConstants.AVERAGE_WEIGHT);
                    it.remove();
                    System.out.println("Passenger boarded at floor " + floor);
                }else{
                    System.out.println("Cannot board the passenger at floor " + floor + " because current weight > capacity");
                }
            }
        }


    }
}
