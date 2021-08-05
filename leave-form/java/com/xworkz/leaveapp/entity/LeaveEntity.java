package com.xworkz.leaveapp.entity;

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
@Table(name = "leaveform")
@NamedQueries({
	@NamedQuery(name = "findByName",query = "select leave from LeaveEntity leave where leave.name=:nm")
})
public class LeaveEntity {

	@Id
	@Column(name = "LID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "NO_OF_LEAVES")
	private String noOfLeaves;
	@Column(name = "REASON")
	private String reason;
	@Column(name = "START_DATE")
	private String startDate;

	public LeaveEntity(String name, String email, String noOfLeaves, String reason, String startDate) {
		super();
		this.name = name;
		this.email = email;
		this.noOfLeaves = noOfLeaves;
		this.reason = reason;
		this.startDate = startDate;
	}

}
