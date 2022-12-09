package com.example.demo.services;

import com.example.demo.entities.VetEntity;

import java.util.List;
import java.util.Optional;

public interface IVetService {

    public VetEntity addVet(VetEntity v);
    public Optional<VetEntity> getVetById(Long id);
    public void deleteVet(Long vet_id);

    public List<VetEntity> getAllvets();
}
