package com.example.demo.repositories;

import com.example.demo.entities.VetEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepository extends CrudRepository <VetEntity,Long> {
}
