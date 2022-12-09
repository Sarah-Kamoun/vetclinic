package com.example.demo.controller;
import com.example.demo.entities.VetEntity;
import com.example.demo.services.VetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vet")
@CrossOrigin(origins = "*")
public class VetController {
    @Autowired
    VetServiceImpl vetService;

    @GetMapping("/all")
    public List<VetEntity> getAllvets()
    {
        List<VetEntity> vets = this.vetService.getAllvets();
        return vets;
    }

    @GetMapping("/{id}")
    public Optional<VetEntity> getVetById(@PathVariable("id") Long Id)
    {
        Optional<VetEntity> vet = this.vetService.getVetById(Id);
        return vet;
    }
    @PostMapping("/add")
    public VetEntity addVet(@RequestBody VetEntity newVet)
    {
        VetEntity vet = this.vetService.addVet(newVet);
        return vet;
    }

    @PostMapping("/del")
    public void deleteVet(@PathVariable("id") Long Id)
    {
        this.vetService.deleteVet(Id);
    }
}
