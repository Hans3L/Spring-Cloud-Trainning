package com.creativity.stack.roomservice.controller;

import com.creativity.stack.roomservice.domain.Room;
import com.creativity.stack.roomservice.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomRepository repository;

    @GetMapping
    public Iterable<Room> getRoomAll(){
        return this.repository.findAll();
    }

    @GetMapping("/{id}")
    public Room getRoom(@PathVariable("id") long id){
        return this.repository.findById(id).get();
    }
}
