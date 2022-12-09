package com.example.demo.entities;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@SuppressWarnings("serial")

@Entity
@Table(name="vet")
public class VetEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String username;
	private String password;	
	
	@OneToMany (mappedBy="vet")
	private List<AppointmentEntity> appointments;
	
	public List<AppointmentEntity> getAppointments() {
		return this.appointments;
	}

	public void setAppointments(List<AppointmentEntity> appointments) {
		this.appointments = appointments;
	}

	public long getId(){
		return this.id;
	}
	
	public void setId(long id){
		this.id = id;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getPhoneNumber(){
		return this.phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
    
	public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }  
    
	public VetEntity() {
		// TODO Auto-generated constructor stub
	}

	public VetEntity(String firstname,String lastname,String phonenb, String email, String username, String password) {
		this.firstName=firstname;
		this.lastName=lastname;
		this.phoneNumber=phonenb;
		this.email=email;
		this.username=username;
		this.password=password;
	}

	public VetEntity(Long id,String firstname,String lastname,String phonenb, String email, String username, String password) {
		this.id=id;
		this.firstName=firstname;
		this.lastName=lastname;
		this.phoneNumber=phonenb;
		this.email=email;
		this.username=username;
		this.password=password;
	}
}
