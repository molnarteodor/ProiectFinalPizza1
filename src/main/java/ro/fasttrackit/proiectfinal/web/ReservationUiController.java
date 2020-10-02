package ro.fasttrackit.proiectfinal.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ro.fasttrackit.proiectfinal.service.ReservationService;

@Controller
public class ReservationUiController {
    private final ReservationService reservationService;

    public ReservationUiController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }


    @GetMapping("meniu")
    public String meniupage(){
        return "meniu";
    }
    @GetMapping("index")
    public String indexpage(){
        return "index";
    }
    @GetMapping("rezervare")
    public String rezervarepage(Model pageModel){
        pageModel.addAttribute("rezervare", reservationService.getAll());
        return "rezervare";
    }
    @GetMapping("rezervari")
    public String rezervaripage(){
        return "rezervari";
    }
}