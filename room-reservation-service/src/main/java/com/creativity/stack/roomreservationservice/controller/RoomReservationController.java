package com.creativity.stack.roomreservationservice.controller;

import com.creativity.stack.roomreservationservice.client.RoomClient;
import com.creativity.stack.roomreservationservice.dto.Room;
import com.creativity.stack.roomreservationservice.dto.RoomReservation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/room-reservations")
public class RoomReservationController {

   private final RoomClient roomClient;

    public RoomReservationController(RoomClient roomClient){
        this.roomClient = roomClient;
    }

    @GetMapping
    public List<RoomReservation> getRoomReservation(){
        List<Room> rooms = this.roomClient.getAllRooms();
        List<RoomReservation> roomReservations = new ArrayList<>();
        rooms.forEach(room -> {
            RoomReservation roomReservation = new RoomReservation();
            roomReservation.setRoomNumber(room.getRoomNumber());
            roomReservation.setRoomName(room.getName());
            roomReservation.setRoomId(room.getId());
            roomReservations.add(roomReservation);
        });
        return roomReservations;
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hola esta todo OK";
    }


}
