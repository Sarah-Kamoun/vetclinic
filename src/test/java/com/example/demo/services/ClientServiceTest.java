package com.example.demo.services;

import com.example.demo.entities.ClientEntity;
import com.example.demo.repositories.ClientRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

//@DataJpaTest
@SpringBootTest
public class ClientServiceTest {

    ClientRepository clientRepo;

    @Test
    @Rollback(value = false)
    @DisplayName("Test addClient")
    public void testAddClient(){
        ClientEntity client=new ClientEntity(1L,"SarahTest","kamoun","1234","abc@gmail.com");
        clientRepo.save(client);
    }
/*
    @Test
    @Rollback(value = false)
    @DisplayName("test getClientById")
    public void TestGetClientById(){
        Long id=1L;
        Optional<ClientEntity> cl= clientRepo.findById(id);
        assertEquals(cl.get().getId(),1L);
    }

    @Test
    @Order(3)
    @Rollback(value = false)
    @DisplayName("test deleteClient")
    public void TestDeleteClient(){
        Long id=1L;
        clientRepo.deleteById(id);
        assertNull(clientRepo.findById(id));
    }
*/
}
