package com.example.demo.services;

import com.example.demo.entities.PetEntity;

import java.util.List;
import java.util.Optional;

public interface IPetService {

    public PetEntity addPet(PetEntity p);
    public Optional<PetEntity> getPetById(Long id);
    public void deletePet(Long pet_id);

    public List<PetEntity> getAllpets();
}
