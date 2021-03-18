package com.xworkz.icecream.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "ice_cream")
@NamedQueries({
	@NamedQuery(name="deleteByName",query = "delete from IceCreamEntity ice where ice.name=:nm"),
	@NamedQuery(name="getAll",query = "select ice from IceCreamEntity ice"),
	@NamedQuery(name="findByNameAndPrice",query = "select ice from IceCreamEntity ice where ice.name=:nm and ice.price=:pc"),
	@NamedQuery(name="getSumPrice",query = "select sum(ice.price) from IceCreamEntity ice"),
	@NamedQuery(name="getPriceByName",query = "select ice.price from IceCreamEntity ice where ice.name=:nm"),
	@NamedQuery(name="getNameAndFlavourByPrice",query = "select ice.name,ice.flavour from IceCreamEntity ice where ice.price=:pc")
	
	/*@NamedQuery(name="getByMaxPrice",query = "select ice from IceCreamEntity ice where 0=(select count(distinct(i.price)) from IceCreamEntity i where ice.price<i.price)")
	@NamedQuery(name="updatePriceByName",query="update IceCreamEntity set price=:pc where name=:nm")*/
})
public class IceCreamEntity {
	@Id
	@Column(name = "ID")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "FLAVOUR")
	@Enumerated(EnumType.STRING)
	private Flavour flavour;
	@Enumerated(EnumType.STRING)
	@Column(name = "COLOR")
	private Color color;
	@Column(name = "PRICE")
	private double price;

	public enum Flavour {
		CHOCOLATE, BUTTERSCOTCH, CARAMEL, BLACKCURRANT, VANILLA, STRAWBERRY, MIXED
	}

	public enum Color {
		BROWN, BLACK, CREAM, ORANGE, BLUE, PINK, MIX, YELLOW
	}

	public IceCreamEntity(String name, Flavour flavour, Color color, double price) {
		super();
		this.name = name;
		this.flavour = flavour;
		this.color = color;
		this.price = price;
	}
}
