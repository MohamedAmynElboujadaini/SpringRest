package com.example.SpringDataRest;

import com.example.SpringDataRest.modele.Proprietaire;
import com.example.SpringDataRest.modele.ProprietaireRepo;
import com.example.SpringDataRest.modele.Voiture;
import com.example.SpringDataRest.modele.VoitureRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(VoitureRepo repository, ProprietaireRepo proprietaireRepo) {
		// Create Proprietaire instances
		Proprietaire proprietaire1 = new Proprietaire("Ali", "Hassan");
		Proprietaire proprietaire2 = new Proprietaire("Najat", "Bani");

		// Save Proprietaires
		proprietaireRepo.save(proprietaire1);
		proprietaireRepo.save(proprietaire2);

		return args -> {
			// Create and save Voiture instances associated with Proprietaire
			repository.save(new Voiture("Toyota", "Corolla", "Grise", "A-1-9090", 2018, 95000, proprietaire1));
			repository.save(new Voiture("Ford", "Fiesta", "Rouge", "A-2-8090", 2015, 90000, proprietaire1));
			repository.save(new Voiture("Honda", "CRV", "Bleu", "A-3-7090", 2016, 140000, proprietaire2));
		};
	}
}
