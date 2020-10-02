package ro.fasttrackit.proiectfinal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.proiectfinal.domain.Reservation;
import ro.fasttrackit.proiectfinal.repository.ReservationRepository;

import javax.persistence.Id;
import java.util.List;

@SpringBootApplication
public class ProiectFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProiectFinalApplication.class, args);
	}

	@Bean
	CommandLineRunner atStartup(ReservationRepository repo) {
		Integer id = null;
		return args -> repo.saveAll(List.of(
				new Reservation("Popescu Ion", "0710000000", id),
		        new Reservation("John Wick", "0711111111", id),
				new Reservation("Vin Diesel", "0722222222", id),
		        new Reservation("Selena Gomez", "0733333333", id)
		));
	}
}
