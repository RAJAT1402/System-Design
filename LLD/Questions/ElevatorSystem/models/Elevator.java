package models;

import java.util.Queue;

public class Elevator extends BaseModel{
    private String name;
    private int currentFloor;
    private Direction direction;
    private Queue<ElevatorRequest> elevatorRequests;
    private double weight;
    private double capacity;
    private Panel panel;
    private ElevatorSensor elevatorSensor;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCurrentFloor() {
        return currentFloor;
    }
    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }
    public Direction getDirection() {
        return direction;
    }
    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    public Queue<ElevatorRequest> getElevatorRequests() {
        return elevatorRequests;
    }
    public void setElevatorRequests(Queue<ElevatorRequest> elevatorRequests) {
        this.elevatorRequests = elevatorRequests;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getCapacity() {
        return capacity;
    }
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
    public Panel getPanel() {
        return panel;
    }
    public void setPanel(Panel panel) {
        this.panel = panel;
    }
    public ElevatorSensor getElevatorSensor() {
        return elevatorSensor;
    }
    public void setElevatorSensor(ElevatorSensor elevatorSensor) {
        this.elevatorSensor = elevatorSensor;
    }

    
}
