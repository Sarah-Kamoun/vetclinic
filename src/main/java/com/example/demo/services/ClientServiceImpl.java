package com.example.demo.services;

import com.example.demo.entities.ClientEntity;
import com.example.demo.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ClientServiceImpl {

    ClientRepository clientRepo;


    public ClientEntity addClient(ClientEntity c){
        ClientEntity cl=this.clientRepo.save(c);
        return cl;
    }

    public Optional<ClientEntity> getClientById(Long id){
        Optional<ClientEntity> cl=this.clientRepo.findById(id);
        return cl;
    }

    public void deleteClient(Long client_id){
        clientRepo.deleteById(client_id);
    }

    public List<ClientEntity> getAllclients()
    {
        List<ClientEntity> clients = (List<ClientEntity>) this.clientRepo.findAll();
        return clients;
    }


}
