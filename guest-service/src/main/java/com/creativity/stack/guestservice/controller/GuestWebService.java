package com.creativity.stack.guestservice.controller;

import com.creativity.stack.guestservice.domain.Guest;
import com.creativity.stack.guestservice.repository.GuestRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guest")
public class GuestWebService {

    private GuestRepository guestRepository;

    public GuestWebService(GuestRepository guestRepository) {
        super();
        this.guestRepository = guestRepository;
    }

    @GetMapping
    public Iterable<Guest> getAllGuest() {
        return this.guestRepository.findAll();
    }

    @GetMapping("/{id}")
    public Guest getGuest(@PathVariable("id") long id) {
        return this.guestRepository.findById(id).get();
    }
}
