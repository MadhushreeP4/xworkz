package com.xworkz.waterfall.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="space_agency")

public class SpaceAgencyEntity {
	
	@Id
	@GenericGenerator(name = "mad",strategy = "increment")
	@GeneratedValue(generator = "mad")
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="FORMED")
	private int formedIn;
	@Column(name="ANNUAL_BUDGET_IN_MILLIONS")
	private int annualBudgetInMillions;
	@Column(name="COUNTRY")
	private String country;
	
	public SpaceAgencyEntity(String name, int formedIn, int annualBudgetInMillions, String country) {
		super();
		this.name = name;
		this.formedIn = formedIn;
		this.annualBudgetInMillions = annualBudgetInMillions;
		this.country = country;
	}
	
	

}
