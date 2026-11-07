package com.klef.soa.repository;

import com.klef.soa.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByName(String name);
    List<Ticket> findByType(String type);
}
