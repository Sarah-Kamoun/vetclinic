package com.example.demo.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.*;

@SuppressWarnings("serial")

@Entity
@Table(name="appointment")
public class AppointmentEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private LocalDate date;
	private LocalTime hour;

	@OneToOne
	private SurgeryEntity surgery;
	
	@ManyToOne
	private VetEntity vet;
	
	@OneToOne
	private PetEntity pet;
	
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHour() {
        return this.hour;
    }

    public void setHour(LocalTime hour) {
        this.hour = hour;
    }

    public SurgeryEntity getSurgery() {
		return this.surgery;
	}

	public void setSurgery(SurgeryEntity surgery) {
		this.surgery = surgery;
	}

	public VetEntity getVet() {
		return this.vet;
	}

	public void setVet(VetEntity vet) {
		this.vet = vet;
	}

	public PetEntity getPet() {
		return this.pet;
	}

	public void setPet(PetEntity pet) {
		this.pet = pet;
	}

	@Override
    public String toString() {
        return "com.example.demo.entities.AppointmentEntity{" +
                "date=" + date +
                ", hour=" + hour +
                '}';
    }
    
	public AppointmentEntity() {
		// TODO Auto-generated constructor stub
	}

}
