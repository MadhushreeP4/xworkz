package com.xworkz.waterfall.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="states")

public class StateEntity {
	@Id
	@GenericGenerator(name="mad",strategy = "increment")
	@GeneratedValue(generator = "mad")
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="POPULATION")
	private double population;
	@Column(name="NO_OF_DISTRICTS")
	private int noOfDistricts;
	@Column(name="LANGUAGE")
	private String language;
	
	public StateEntity(String name, double population, int noOfDistricts, String language) {
		super();
		this.name = name;
		this.population = population;
		this.noOfDistricts = noOfDistricts;
		this.language = language;
	}
	
	

}
