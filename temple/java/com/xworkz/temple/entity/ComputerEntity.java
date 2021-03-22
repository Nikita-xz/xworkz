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
@Table(name="computer")
@NamedQueries({
	@NamedQuery(name="findByNameOfComputer", query="select comp from ComputerEntity comp where name=:nm"),
	@NamedQuery(name="delete", query="delete ComputerEntity comp where comp.id=:cid"),
	@NamedQuery(name="get", query="select comp from ComputerEntity comp"),
})

public class ComputerEntity {
	@Id
	@Column(name="C_ID")
	private int cid;
	@Column(name="BRAND")
	private String brand;
	@Column(name="PRICE")
	private int price;
	@Column(name="TYPE")
	private String type;
	@Column(name="NAME")
	private String name;
	
	public ComputerEntity(int cid, String brand, int price, String type, String name) {
		super();
		this.cid = cid;
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.name = name;
	}
	
	

}
