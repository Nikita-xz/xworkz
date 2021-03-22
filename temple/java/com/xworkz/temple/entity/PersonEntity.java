package com.xworkz.temple.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@Entity
@Table(name="person")
@NamedQueries({
	@NamedQuery(name="findByNameOfPerson", query="select person from PersonEntity person where name=:nm"),
	@NamedQuery(name="deleteOfPerson", query="delete PersonEntity person where person.id=:mid"),
	@NamedQuery(name="getAllOfPerson", query="select person from PersonEntity person")
})


public class PersonEntity {
	@Id
	@Column(name="P_ID")
	private int pid;
	@Column(name="NAME")
	private String name;
	@Column(name="EMAIL")
	private String email;
	@Column(name="PHONE_NO")
	private float phoneNo;
	
	public PersonEntity(int pid, String name, String email, float phoneNo) {
		super();
		this.pid = pid;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
	}
	
	
	

}
