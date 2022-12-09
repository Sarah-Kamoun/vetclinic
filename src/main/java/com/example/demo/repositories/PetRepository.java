package com.example.demo.repositories;

import com.example.demo.entities.PetEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PetRepository extends CrudRepository <PetEntity,Long> {
}
