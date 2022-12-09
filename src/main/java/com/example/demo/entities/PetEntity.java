package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.*;

@SuppressWarnings("serial")

@Entity
@Table(name="pet")
public class PetEntity implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String species;
	private String breed;
	
	@OneToOne  ( mappedBy="pet" )
	private AppointmentEntity appointment;
	
	@ManyToOne
	private ClientEntity client;
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AppointmentEntity getAppointment() {
		return this.appointment;
	}

	public void setAppointment(AppointmentEntity appointment) {
		this.appointment = appointment;
	}

	public ClientEntity getClient() {
		return this.client;
	}

	public void setClient(ClientEntity client) {
		this.client = client;
	}
    
	public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return this.name+": "+this.breed;
    }
    
	public PetEntity() {
		// TODO Auto-generated constructor stub
	}
	public PetEntity(String name,String species,String breed) {
		this.name=name;
		this.species=species;
		this.breed=breed;
	}
	public PetEntity(Long id, String name,String species,String breed) {
		this.id=id;
		this.name=name;
		this.species=species;
		this.breed=breed;
	}
}
