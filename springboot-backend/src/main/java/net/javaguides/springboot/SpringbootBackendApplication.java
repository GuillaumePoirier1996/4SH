package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.model.EntranceMov;
import net.javaguides.springboot.model.ExitMov;
import net.javaguides.springboot.model.Mov;
import net.javaguides.springboot.repository.MovsRepo;

// pour les tests
import java.util.Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private MovsRepo movsRepo;

	@Override
	public void run(String... args) throws Exception {

		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date movD = format.parse("12-05-2023 19:28:00");

		Date d = new Date();

		Mov newMov = new Mov(d, "Guigui", movD);

		this.movsRepo.save(newMov);

		this.movsRepo
				.save(new EntranceMov(d, "Guigzaille", movD, "123", "VSL1", "AWB", 234567, 12,
						12, 12, 12, "desc1", "X"));

		this.movsRepo.save(new ExitMov(d, "Guigzaille", movD, "123", "VSL1", "AWB", 234567, 12,
				12, 12, 12, "desc1", "X", "AX", "AS"));

		// test du classement par heure de création
		// for (int i = 0; i < 60; i++) {
		// this.movsRepo.save(new Mov(d, "Guigz", movD));

		// try {
		// // pause de 1 seconde
		// Thread.sleep(1000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }

		// d = new Date();
		// }
	}
}
