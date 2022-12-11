package com.example.demo.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name="client")
public class ClientEntity implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	
	@OneToMany(mappedBy="client")
	private List<PetEntity> pets;
	
	public List<PetEntity> getPets() {
		return this.pets;
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
	
    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
    
	public ClientEntity() {
		// TODO Auto-generated constructor stub
	}

	public ClientEntity(String firstname,String lastname,String phonenumber, String email) {
		this.firstName=firstname;
		this.lastName=lastname;
		this.phoneNumber=phonenumber;
		this.email=email;
	}

	public ClientEntity(Long id,String firstname,String lastname,String phonenumber, String email) {
		this.id=id;
		this.firstName=firstname;
		this.lastName=lastname;
		this.phoneNumber=phonenumber;
		this.email=email;
	}

}
