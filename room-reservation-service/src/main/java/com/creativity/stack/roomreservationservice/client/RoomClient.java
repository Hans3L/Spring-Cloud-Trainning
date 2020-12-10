package com.creativity.stack.roomreservationservice.client;

import com.creativity.stack.roomreservationservice.dto.Room;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "roomservices",url = "${service.url}")
public interface RoomClient {
    @RequestMapping(value = "/room", method = RequestMethod.GET)
    @ResponseBody List<Room> getAllRooms();
    @GetMapping("/room/{id}")
    Room getRoom(@PathVariable("id") long id);
}
