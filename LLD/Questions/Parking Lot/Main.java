import DTO.GenerateTicketRequestDto;
import DTO.GenerateTicketResponseDto;
import controllers.TicketController;
import models.Ticket;
import models.VehicleType;
import repositories.GateRepository;
import repositories.TicketRepository;
import repositories.VehicleRepository;
import services.GateService;
import services.TicketService;
import services.VehicleService;
import stratergies.spotAssignmentStratergy.RandomSpotAssignmentStratergy;
import stratergies.spotAssignmentStratergy.SpotAssignment;

public class Main {
    public static void main(String[] args) {
        
        ObjectRegistry objectRegistry = new ObjectRegistry();

        VehicleRepository vehicleRepository = new VehicleRepository();
        VehicleService vehicleService = new VehicleService(vehicleRepository);

        GateRepository gateRepository = new GateRepository();
        GateService gateService = new GateService(gateRepository);

        TicketRepository ticketRepository = new TicketRepository();
        SpotAssignment spotAssignment = new RandomSpotAssignmentStratergy();  

        TicketService ticketService = new TicketService(vehicleService, gateService, spotAssignment, ticketRepository);
        TicketController ticketController = new TicketController(ticketService);

        objectRegistry.registerObject("ticketController", ticketController);
        objectRegistry.registerObject("ticketService", ticketService);
        objectRegistry.registerObject("spotAssignment", spotAssignment);
        objectRegistry.registerObject("ticketRepository", ticketRepository);
        objectRegistry.registerObject("gateService", gateService);
        objectRegistry.registerObject("gateRepository", gateRepository);
        objectRegistry.registerObject("vehicleService", vehicleService);
        objectRegistry.registerObject("vehicleRepository", vehicleRepository);

        GenerateTicketRequestDto generateTicketRequestDto = new GenerateTicketRequestDto();
        generateTicketRequestDto.setGateId(1L);
        generateTicketRequestDto.setVehicleNumber("DL1A2154");
        generateTicketRequestDto.setVechicleType(VehicleType.SMALL);

        TicketController tc = (TicketController)objectRegistry.getObject("ticketController");
        GenerateTicketResponseDto generateTicketResponseDto = tc.generateTicket(generateTicketRequestDto);

        Ticket ticket = generateTicketResponseDto.getTicket();

        System.out.println(ticket);
    }
}

// Requirements
// 1. Operator should be able to generate ticket
// 2. admin should be able to create parking lot

// Dependencies
// topological sort
