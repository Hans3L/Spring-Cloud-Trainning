package com.creativity.stack.roomservice.repository;

import com.creativity.stack.roomservice.domain.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
