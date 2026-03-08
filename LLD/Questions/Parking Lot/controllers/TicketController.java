package controllers;

import DTO.GenerateTicketRequestDto;
import DTO.GenerateTicketResponseDto;
import exceptions.NoParkingSpotAvailableException;
import models.ResponseStatus;
import models.Ticket;
import services.TicketService;

public class TicketController {
    
    // Things Needed
    // Vechicle, gate, operator, 
    // public Ticket generateTicker(Vehicle vehicle, Gate gate){
    //     return null;
    // }

    // Issues
    // 1. If we add more parameters to input part then current users start failing
    // 2. Models are the internal details, exposing them is not a good thing ( critical )
    // fix -> DTO (Data Transfer Object)
    // request DTO , response DTO

    private TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto generateTicketRequestDto){
        
        try{
            Ticket ticket = ticketService.generateTicket(generateTicketRequestDto.getVehicleNumber(), 
                                                     generateTicketRequestDto.getGateId(), 
                                                     generateTicketRequestDto.getVechicleType());

            GenerateTicketResponseDto generateTicketResponseDto = new GenerateTicketResponseDto();
            generateTicketResponseDto.setTicket(ticket);
            generateTicketResponseDto.setResponseStatus(ResponseStatus.SUCCESS);

            return generateTicketResponseDto;
        } catch(NoParkingSpotAvailableException e){
            GenerateTicketResponseDto generateTicketResponseDto = new GenerateTicketResponseDto();
            generateTicketResponseDto.setResponseStatus(ResponseStatus.FAILURE);
            return generateTicketResponseDto;
        }
    }


}
