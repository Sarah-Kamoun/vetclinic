package com.example.demo.controller;
import com.example.demo.entities.PetEntity;
import com.example.demo.services.PetServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pet")
@CrossOrigin(origins = "*")
public class PetController {
    @Autowired
    PetServiceImpl petService;

    @GetMapping("/all")
    public List<PetEntity> getAllpets()
    {
        List<PetEntity> pets = this.petService.getAllpets();
        return pets;
    }

    @GetMapping("/{id}")
    public Optional<PetEntity> getPetById(@PathVariable("id") Long Id)
    {
        Optional<PetEntity> pet = this.petService.getPetById(Id);
        return pet;
    }
    @PostMapping("/create")
    public PetEntity addPet(@RequestBody PetEntity newPet)
    {
        PetEntity pet = this.petService.addPet(newPet);
        return pet;
    }

    @PostMapping("/delete")
    public void deletePet(@PathVariable("id") Long Id)
    {
         this.petService.deletePet(Id);
    }
}
