package com.example.demo.controller;
import com.example.demo.entities.ClientEntity;
import com.example.demo.services.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/client")
@CrossOrigin(origins = "*")
public class ClientController {
    @Autowired
    ClientServiceImpl clientService;

/*
    @GetMapping("/all")
    public List<ClientEntity> getAllclients()
    {
        List<ClientEntity> clients = this.clientService.getAllclients();
        return clients;
    }

    @GetMapping("/{id}")
    public Optional<ClientEntity> getClientById(@PathVariable("id") Long Id)
    {
        Optional<ClientEntity> client = this.clientService.getClientById(Id);
        return client;
    }*/

    @PostMapping("/create")
    public void addClient(@RequestBody ClientEntity newClient)
    {
        clientService.addClient(newClient);
    }
    /*
    @PostMapping("/del")
    public void deleteClient(@PathVariable("id") Long Id)
    {
        this.clientService.deleteClient(Id);
    }
    */

}
