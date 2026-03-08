package services;

import java.util.Date;

import exceptions.NoParkingSpotAvailableException;
import models.Gate;
import models.ParkingSpot;
import models.Ticket;
import models.Vehicle;
import models.VehicleType;
import repositories.TicketRepository;
import stratergies.spotAssignmentStratergy.SpotAssignment;

public class TicketService {
    
    private VehicleService vehicleService;
    private GateService gateService;
    private SpotAssignment spotAssignment;
    private TicketRepository ticketRepository;

    public TicketService(VehicleService vehicleService, GateService gateService, SpotAssignment spotAssignment, TicketRepository ticketRepository){
        this.vehicleService = vehicleService;
        this.gateService = gateService;
        this.spotAssignment = spotAssignment;
        this.ticketRepository = ticketRepository;
    }

    public Ticket generateTicket(String vehicleNumber, Long gateId, VehicleType vehicleType) throws NoParkingSpotAvailableException{
        
        // on the basis of vehicle number we need to create the object
        // if not present -> create it
        Vehicle vehicle = vehicleService.getVehicle(vehicleNumber);
        
        if(vehicle == null){
            vehicle = vehicleService.registerVehicle(vehicleNumber, vehicleType);
        }

        Gate gate = gateService.getGateByID(gateId);
        ParkingSpot parkingSpot = spotAssignment.assignParkingSpot(vehicleType); // Todo throw exception here

        if(parkingSpot == null){
            System.out.println("No Spot Avaialable for vehicle");
            throw new NoParkingSpotAvailableException("No Parking Spot Available for given vehicle");
        }

        Ticket ticket = new Ticket();
        ticket.setVehicle(vehicle);
        ticket.setGate(gate);
        ticket.setId(1l);
        ticket.setEntryTime(new Date());
        ticket.setParkingSpot(parkingSpot);

        ticketRepository.saveTicket(ticket);

        return ticket;
    }
}
