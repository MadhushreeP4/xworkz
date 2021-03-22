package com.xworkz.machine.entity;

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
@Table(name="machine")
@NamedQueries({
	@NamedQuery(name = "findByNameFromMachineEntity",query = "select machine from MachineEntity machine where machine.name=:nm"),
	@NamedQuery(name = "getAllFromMachineEntity",query = "select machine from MachineEntity machine")
})
public class MachineEntity {
	
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="TYPE")
	private String type;
	@Column(name="COMPANY_NAME")
	private String companyName;
	
	public MachineEntity(String name, String type, String companyName) {
		super();
		this.name = name;
		this.type = type;
		this.companyName = companyName;
	}
}
