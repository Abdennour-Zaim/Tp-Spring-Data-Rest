package com.example.application_data_rest;

import com.example.application_data_rest.enums.Genre;
import com.example.application_data_rest.model.Etudiant;
import com.example.application_data_rest.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationDataRestApplication implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(ApplicationDataRestApplication.class, args);

    }
    @Autowired
    EtudiantRepository etudiantRepository;
    @Override
    public void run(String... args) throws Exception{
        Etudiant e1=Etudiant.builder()
                .nom("Adnani")
                .prenom("Morad")
                .genre(Genre.Homme)
                .build();
        etudiantRepository.save(e1);
    }

}
