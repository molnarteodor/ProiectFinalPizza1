package ro.fasttrackit.proiectfinal.api;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.fasttrackit.proiectfinal.domain.Reservation;
import ro.fasttrackit.proiectfinal.service.ReservationService;

@RestController
@RequestMapping("api/rezervari")
public class ReservationController {
    private final ReservationService reservationService;

    public ReservationController(final ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping
    Reservation addReservation(@RequestBody Reservation newReservation) {
        return reservationService.addReservation(newReservation);
    }

}
