package com.xworkz.cartoons.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="cartoon")

public class CartoonEntity {
	
	@Id
	@GenericGenerator(name = "mad",strategy = "increment")
	@GeneratedValue(generator = "mad")
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="SHOW_NAME")
	private String show;
	@Enumerated(EnumType.STRING)
	@Column(name="CHANNEL_NAME")
	private ChannelName channel;
	@Column(name="LANG")
	private String language;
	
	public enum ChannelName{
		POGO,CARTOON_NETWORK,DISNEY;
	}

	public CartoonEntity(String name, String show, ChannelName channel, String language) {
		super();
		this.name = name;
		this.show = show;
		this.channel = channel;
		this.language = language;
	}
	
	

}
