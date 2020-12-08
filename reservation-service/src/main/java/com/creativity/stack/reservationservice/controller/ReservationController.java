package com.creativity.stack.reservationservice.controller;

import com.creativity.stack.reservationservice.domain.Reservation;
import com.creativity.stack.reservationservice.repository.ReservationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    private ReservationRepository reservationRepository;

    public ReservationController(ReservationRepository reservationRepository){
        super();
        this.reservationRepository = reservationRepository;
    }

    public Iterable<Reservation> getAllReservation(){
        return this.reservationRepository.findAll();
    }

    @GetMapping("/{id}")
    private Reservation getIdReservation(@PathVariable("id") long id){
        return this.reservationRepository.findById(id).get();
    }
}
