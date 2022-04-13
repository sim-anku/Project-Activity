package com.ltts.ticketapp.bo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.ticketapp.model.Ticket;

@Repository
public interface TicketBo extends JpaRepository<Ticket,Integer> {

}
