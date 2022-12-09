package com.example.demo.services;

import com.example.demo.entities.VetEntity;
import com.example.demo.repositories.VetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VetServiceImpl implements  IVetService{

    @Autowired
    VetRepository vetRepo;

    @Override
    public VetEntity addVet(VetEntity v){
        this.vetRepo.save(v);
        return v;
    }

    @Override
    public Optional<VetEntity> getVetById(Long id){
        return this.vetRepo.findById(id);
    }

    @Override
    public void deleteVet(Long vet_id){
        this.vetRepo.deleteById(vet_id);
    }

    @Override
    public List<VetEntity> getAllvets()
    {
        List<VetEntity> vets = (List<VetEntity>) this.vetRepo.findAll();
        return vets;
    }
}
