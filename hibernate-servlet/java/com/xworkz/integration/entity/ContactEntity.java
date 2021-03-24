package com.xworkz.integration.entity;

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
@Table(name = "contact")
@NamedQueries({
	@NamedQuery(name = "findByName",query = "select contact from ContactEntity contact where contact.name=:nm"),
	@NamedQuery(name = "findByEmail",query = "select contact from ContactEntity contact where contact.email=:mail"),
	@NamedQuery(name = "findAll",query = "select contact from ContactEntity contact")
})
public class ContactEntity {
	
	@Id
	@Column(name = "CID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "PHONE")
	private String phone;
	@Column(name = "COMPANY")
	private String company;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "ABOUT_US")
	private String aboutUs;
	
	
	public ContactEntity(String name, String phone, String company, String email, String aboutUs) {
		super();
		this.name = name;
		this.phone = phone;
		this.company = company;
		this.email = email;
		this.aboutUs = aboutUs;
	}
	
	

}
