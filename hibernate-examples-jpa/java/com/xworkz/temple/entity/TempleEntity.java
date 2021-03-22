package com.xworkz.temple.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "temple")
@NamedQueries({
	@NamedQuery(name = "findByName", query = "select temple from TempleEntity temple where temple.name=:nm"),
	@NamedQuery(name = "getAll", query = "select temple from TempleEntity temple")
})
public class TempleEntity {
	
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "VISITORS_PER_DAY")
	private int noOfVisitorsPerDay;
	@Column(name = "NO_OF_PRIEST")
	private int noOfPriest;
	
	
	public TempleEntity(String name, String location, int noOfVisitorsPerDay, int noOfPriest) {
		super();
		this.name = name;
		this.location = location;
		this.noOfVisitorsPerDay = noOfVisitorsPerDay;
		this.noOfPriest = noOfPriest;
	}
	
	

}
