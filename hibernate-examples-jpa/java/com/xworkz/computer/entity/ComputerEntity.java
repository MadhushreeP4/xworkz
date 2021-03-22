package com.xworkz.computer.entity;

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
@Table(name = "computer")
@NamedQueries({
	@NamedQuery(name = "findByNameFromComputerEntity", query = "select computer from ComputerEntity computer where name=:nm"),
	@NamedQuery(name = "getAllFromComputerEntity", query = "select computer from ComputerEntity computer")
})
public class ComputerEntity {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "PRICE")
	private int price;
	@Column(name = "TYPE")
	private String type;
	@Column(name = "BRAND")
	private String brand;

	public ComputerEntity(String name, int price, String type, String brand) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
		this.brand = brand;
	}

}
