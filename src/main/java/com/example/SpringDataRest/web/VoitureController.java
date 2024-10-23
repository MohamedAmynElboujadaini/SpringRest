package com.example.SpringDataRest.web;


import com.example.SpringDataRest.modele.Voiture;
import com.example.SpringDataRest.modele.VoitureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class VoitureController {
    @Autowired
    private VoitureRepo voitureRepo;
    @RequestMapping("/voitures")
    public Iterable<Voiture> getVoitures(){return voitureRepo.findAll();}
}