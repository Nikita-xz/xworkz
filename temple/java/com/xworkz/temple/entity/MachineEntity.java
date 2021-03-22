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
@Table(name="machine")
@NamedQueries({
	@NamedQuery(name="findByNameOfMachine", query="select machine from MachineEntity machine where name=:nm"),
	@NamedQuery(name="deleteofmachine", query="delete MachineEntity machine where machine.id=:mid"),
	@NamedQuery(name="getAllOfMachine", query="select machine from MachineEntity machine")
})


public class MachineEntity {
	@Id
	@Column(name="M_ID")
	private int mid;
	@Column(name="NAME")
	private String name;
	@Column(name="TYPE")
	private String type;
	@Column(name="COMPANY_NAME")
	private String companyName;
	
	public MachineEntity(int mid, String name, String type, String companyName) {
		super();
		this.mid = mid;
		this.name = name;
		this.type = type;
		this.companyName = companyName;
	}
	
	

}
