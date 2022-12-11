package com.example.demo.services;

import com.example.demo.entities.PetEntity;
import com.example.demo.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
@Service
public class PetServiceImpl{

    @Autowired
    PetRepository petRepo;


    public PetEntity addPet(PetEntity p){
        PetEntity newp=this.petRepo.save(p);
        return newp;
    }


    public  PetEntity getPetById(Long id){
        Optional<PetEntity> pet=this.petRepo.findById(id);
        PetEntity thepet=pet.orElseThrow();
        return thepet;
    }


    public void deletePet(Long pet_id){
        petRepo.deleteById(pet_id);
    }

    public List<PetEntity> getAllpets()
    {
        List<PetEntity> pets = (List<PetEntity>) this.petRepo.findAll();
        return pets;
    }
}
