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
@Table(name = "vendor")
@NamedQueries({
	@NamedQuery(name="findByNameOfVendor", query="select vendor from VendorEntity vendor where name=:nm"),
	@NamedQuery(name="deleteOfVendor", query="delete VendorEntity vendor where vendor.id=:vid"),
	@NamedQuery(name="getAllOfVendor", query="select vendor from VendorEntity vendor")
})

public class VendorEntity {
	@Id
	@Column(name = "V_ID")

	private int vid;
	@Column(name = "NAME")
	private String name;
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "PRICE")
	private int price;

	public VendorEntity(int vid, String name, String location, int price) {
		super();
		this.vid = vid;
		this.name = name;
		this.location = location;
		this.price = price;
	}

}
