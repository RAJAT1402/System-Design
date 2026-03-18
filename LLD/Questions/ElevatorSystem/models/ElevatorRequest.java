package models;

public class ElevatorRequest extends BaseModel{
    private int FloorNumber;
    private Direction direction;
    private RequestType requestType;
    
    public int getFloorNumber() {
        return FloorNumber;
    }
    public void setFloorNumber(int floorNumber) {
        FloorNumber = floorNumber;
    }
    public Direction getDirection() {
        return direction;
    }
    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    public RequestType getRequestType() {
        return requestType;
    }
    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    } 

    
}
