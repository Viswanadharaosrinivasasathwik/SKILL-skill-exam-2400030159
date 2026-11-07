package com.klef.soa.controller;

import com.klef.soa.entity.Ticket;
import com.klef.soa.service.TicketService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    private final TicketService ticketService;

    public TicketController(TicketService ticketService) { this.ticketService = ticketService; }

    @PostMapping("/insert")
    public Ticket addTicket(@RequestBody Ticket ticket) { return ticketService.addTicket(ticket); }

    @PutMapping("/update/{id}")
    public Ticket updateTicket(@PathVariable Long id, @RequestBody Ticket ticket) {
        return ticketService.updateTicket(id, ticket);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTicket(@PathVariable Long id) { return ticketService.deleteTicket(id); }

    @GetMapping("/displayall")
    public List<Ticket> getAllTickets() { return ticketService.getAllTickets(); }

    @GetMapping("/display/{id}")
    public Ticket getTicketById(@PathVariable Long id) { return ticketService.getTicketById(id); }

    @GetMapping("/findByName/{name}")
    public List<Ticket> getTicketsByName(@PathVariable String name) { return ticketService.getTicketsByName(name); }

    @GetMapping("/findByType/{type}")
    public List<Ticket> getTicketsByType(@PathVariable String type) { return ticketService.getTicketsByType(type); }
}
