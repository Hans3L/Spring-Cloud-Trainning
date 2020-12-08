package com.creativity.stack.reservationservice.repository;

import com.creativity.stack.reservationservice.domain.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
