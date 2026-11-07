package com.klef.soa.service;

import com.klef.soa.entity.Ticket;
import java.util.List;

public interface TicketService {
    Ticket addTicket(Ticket ticket);
    Ticket updateTicket(Long ticketId, Ticket ticket);
    String deleteTicket(Long ticketId);
    List<Ticket> getAllTickets();
    Ticket getTicketById(Long ticketId);
    List<Ticket> getTicketsByName(String name);
    List<Ticket> getTicketsByType(String type);
}
