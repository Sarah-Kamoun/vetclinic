package com.example.demo.services;

import com.example.demo.entities.ClientEntity;

import java.util.List;
import java.util.Optional;

public interface IClientService {

    public void addClient(ClientEntity C);
    /*
    public Optional<ClientEntity> getClientById(Long id);
    public void deleteClient(Long client_id);

    public List<ClientEntity> getAllclients();*/
}
