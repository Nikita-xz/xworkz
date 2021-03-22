package com.xworkz.temple.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name="temple")
@NamedQueries({
	@NamedQuery(name="findByName", query="select temple from TempleEntity temple where name=:nm"),
	@NamedQuery(name="getAll", query="select temple from TempleEntity temple"),
	@NamedQuery(name="deleteById", query="delete TempleEntity temple where temple.id=:tid")
})

public class TempleEntity {
	@Id
	@Column(name="T_ID")
	private int tid;
	@Column(name="NAME")
	private String name;
	@Column(name="LOCATION")
	private String location;
	@Column(name="NO_OF_VISITORS_PER_DAY")
	private int noOfVisitorsPerDay;
	@Column(name="NO_OF_PRIEST")
	private int noOfPriest;
	
	public TempleEntity(int tid, String name, String location, int noOfVisitorsPerDay, int noOfPriest) {
		super();
		this.tid = tid;
		this.name = name;
		this.location = location;
		this.noOfVisitorsPerDay = noOfVisitorsPerDay;
		this.noOfPriest = noOfPriest;
	}
	
	

}
