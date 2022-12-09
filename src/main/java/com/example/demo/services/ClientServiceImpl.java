package com.example.demo.services;

import com.example.demo.entities.ClientEntity;
import com.example.demo.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
public class ClientServiceImpl implements  IClientService{

    @Autowired
    ClientRepository clientRepo;

    @Override
    public ClientEntity addClient(ClientEntity c){
        clientRepo.save(c);
        return c;
    }

    @Override
    public Optional<ClientEntity> getClientById(Long id){
        Optional<ClientEntity> c;
        c = clientRepo.findById(id);
        return c;
    }

    @Override
    public void deleteClient(Long client_id){
        clientRepo.deleteById(client_id);
    }

    @Override
    public List<ClientEntity> getAllclients()
    {
        List<ClientEntity> clients = (List<ClientEntity>) this.clientRepo.findAll();
        return clients;
    }
}
