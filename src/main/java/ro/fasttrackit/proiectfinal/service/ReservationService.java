package ro.fasttrackit.proiectfinal.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.proiectfinal.domain.Reservation;
import ro.fasttrackit.proiectfinal.repository.ReservationRepository;

import java.util.List;

@Service
public class ReservationService {
    private final ReservationRepository reservationRepository;

    public ReservationService(final ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> getAll(){
        return reservationRepository.findAll();
    }

    public Reservation addReservation(Reservation newReservation) {
        return reservationRepository.save(newReservation);
    }
}
