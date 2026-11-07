package com.klef.soa.service;

import com.klef.soa.entity.Ticket;
import com.klef.soa.repository.TicketRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {
    private final TicketRepository ticketRepository;

    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Ticket addTicket(Ticket ticket) {
        ticket.setTicketId(null);
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket updateTicket(Long ticketId, Ticket updatedTicket) {
        Ticket existing = getTicketById(ticketId);
        existing.setName(updatedTicket.getName());
        existing.setType(updatedTicket.getType());
        existing.setStatus(updatedTicket.getStatus());
        existing.setLocation(updatedTicket.getLocation());
        return ticketRepository.save(existing);
    }

    @Override
    public String deleteTicket(Long ticketId) {
        if (!ticketRepository.existsById(ticketId)) return "Ticket not found with id: " + ticketId;
        ticketRepository.deleteById(ticketId);
        return "Ticket deleted successfully with ID: " + ticketId;
    }

    @Override
    public List<Ticket> getAllTickets() { return ticketRepository.findAll(); }

    @Override
    public Ticket getTicketById(Long ticketId) {
        return ticketRepository.findById(ticketId)
                .orElseThrow(() -> new RuntimeException("Ticket not found with id: " + ticketId));
    }

    @Override
    public List<Ticket> getTicketsByName(String name) { return ticketRepository.findByName(name); }

    @Override
    public List<Ticket> getTicketsByType(String type) { return ticketRepository.findByType(type); }
}
