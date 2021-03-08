package com.xworkz.coupon.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@javax.persistence.Entity
@Table(name="coupon")

public class CouponEntity {
	
	@Id
	@GenericGenerator(name="mad",strategy = "increment")
	@GeneratedValue(generator = "mad")
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="TYPE")
	private String type;
	@Column(name="OFFER_IN_PERCENTAGE")
	private int offerInPercentage;
	@Column(name="VALIDITY_MONTHS")
	private int validityMonth;
	
	public CouponEntity(String name, String type, int offerInPercentage, int validityMonth) {
		super();
		this.name = name;
		this.type = type;
		this.offerInPercentage = offerInPercentage;
		this.validityMonth = validityMonth;
	}
	
	

}
