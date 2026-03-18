import models.Building;
import models.Direction;
import models.Elevator;
import models.ElevatorRequest;
import models.Floor;
import models.RequestType;
import services.ElevatorService;
import stratergies.LookAfterSchedulingStratergy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import controllers.ElevatorController;

public class main {
    public static void main(String[] args) throws InterruptedException{
        Building building = new Building();

        building.setName("Test Tower");
        building.setAddress("magnum global park");

        List<Floor> floorList = new ArrayList<>();
        for(int i = 0 ; i < 10 ; i++){
            Floor floor = new Floor();
            long id = (long)(123 + i);
            floor.setId(id);
            floor.setFloor(i);
            floorList.add(floor);
        }
        
        List<Elevator> elevatorList = new ArrayList<>();
        Queue<ElevatorRequest> elevatorRequest = new LinkedList<>();
        

        Elevator elevator = new Elevator();
        elevator.setId(345L);
        elevator.setName("e1");
        elevator.setCurrentFloor(0);
        elevator.setDirection(Direction.IDLE);
        elevator.setWeight(0.0);
        elevator.setCapacity(400.0);
        elevator.setElevatorRequests(elevatorRequest);

        elevatorList.add(elevator);

        building.setFloors(floorList);
        building.setElevators(elevatorList);

        ElevatorRequest req1 = new ElevatorRequest();
        req1.setFloorNumber(2);
        req1.setDirection(Direction.UP);
        req1.setRequestType(RequestType.EXTERNAL);

        ElevatorRequest req2 = new ElevatorRequest();
        req2.setFloorNumber(2);
        req2.setDirection(Direction.UP);
        req2.setRequestType(RequestType.EXTERNAL);

        ElevatorRequest req3 = new ElevatorRequest();
        req3.setFloorNumber(5);
        req3.setRequestType(RequestType.INTERNAL);

        ElevatorRequest req4 = new ElevatorRequest();
        req4.setFloorNumber(10);
        req4.setRequestType(RequestType.INTERNAL);

        LookAfterSchedulingStratergy lookAfterSchedulingStratergy = new LookAfterSchedulingStratergy();
        ElevatorService elevatorService = new ElevatorService(elevator, lookAfterSchedulingStratergy);
        ElevatorController elevatorController = new ElevatorController(elevatorService);

        elevatorController.submitRequest(req1);
        elevatorController.submitRequest(req2);
        elevatorController.submitRequest(req3);
        elevatorController.submitRequest(req4);

        for(int i = 0 ; i < 20 ; i++){
            System.out.println("Tick " + i + " : " + elevatorController.getElevatorStatus());
            elevatorController.step();
            Thread.sleep(200);
        }

        System.out.println("Final Status : " + elevatorController.getElevatorStatus());
    }
}
