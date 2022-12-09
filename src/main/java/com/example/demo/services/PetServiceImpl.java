package com.example.demo.services;

import com.example.demo.entities.PetEntity;
import com.example.demo.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
@Service
public class PetServiceImpl implements  IPetService{

    @Autowired
    PetRepository petRepo;

    @Override
    public PetEntity addPet(PetEntity p){
        petRepo.save(p);
        return p;
    }

    @Override
    public Optional<PetEntity> getPetById(Long id){
        return petRepo.findById(id);
    }

    @Override
    public void deletePet(Long pet_id){
        petRepo.deleteById(pet_id);
    }

    @Override
    public List<PetEntity> getAllpets()
    {
        List<PetEntity> pets = (List<PetEntity>) this.petRepo.findAll();
        return pets;
    }
}
