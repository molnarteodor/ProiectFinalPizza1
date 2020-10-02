package ro.fasttrackit.proiectfinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.proiectfinal.domain.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}
