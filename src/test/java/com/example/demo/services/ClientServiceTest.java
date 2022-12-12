package com.example.demo.services;

import com.example.demo.entities.ClientEntity;
import com.example.demo.repositories.ClientRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
@SpringBootTest
public class ClientServiceTest {

    @Autowired
    private ClientRepository clientRepo;

    @Test
    @Rollback(value = false)
    @DisplayName("Test addClient")
    public void testAddClient(){
        ClientEntity client=new ClientEntity(4L,"SarahTest2","kamounn","128534","sabil.com");
        clientRepo.save(client);
    }

}
