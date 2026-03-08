package repositories;

import java.util.HashMap;
import java.util.Map;

import models.Ticket;

public class TicketRepository {
    Map<Long, Ticket> map = new HashMap<>();

    public void saveTicket(Ticket ticket){
        map.put(ticket.getId(), ticket);
    }

    public Ticket getTicket(Long id){
        return map.get(id);
    }
}
