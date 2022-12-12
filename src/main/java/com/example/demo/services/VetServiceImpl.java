package com.example.demo.services;

import com.example.demo.entities.VetEntity;
import com.example.demo.repositories.VetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VetServiceImpl{

    @Autowired
    VetRepository vetRepo;


    public VetEntity addVet(VetEntity v){
        VetEntity vv= this.vetRepo.save(v);
        return vv;
    }


    public Optional<VetEntity> getVetById(Long id){
        Optional<VetEntity> v=this.vetRepo.findById(id);

        return v;
    }


    public void deleteVet(Long vet_id){
        this.vetRepo.deleteById(vet_id);
    }


    public List<VetEntity> getAllvets()
    {
        List<VetEntity> vets = (List<VetEntity>) this.vetRepo.findAll();
        return vets;
    }
}
