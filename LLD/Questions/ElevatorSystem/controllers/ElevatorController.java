package controllers;

import models.ElevatorRequest;
import services.ElevatorService;

public class ElevatorController {
    
    private final ElevatorService elevatorService;

    public ElevatorController(ElevatorService elevatorService){
        this.elevatorService = elevatorService;
    }

    public void submitRequest(ElevatorRequest elevatorRequest){
        elevatorService.addRequest(elevatorRequest);
    }

    public void step(){
        elevatorService.step();
    }

    public String getElevatorStatus(){
        return elevatorService.elevatorStatus();
    }
}
