package models;

import java.util.List;

public class Building extends BaseModel{
    private String name;
    private String address;
    private List<Elevator> elevators;
    private List<Floor> floors;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public List<Elevator> getElevators() {
        return this.elevators;
    }
    public void setElevators(List<Elevator> elevators) {
        this.elevators = elevators;
    }
    public List<Floor> getFloors() {
        return floors;
    }
    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    
}
