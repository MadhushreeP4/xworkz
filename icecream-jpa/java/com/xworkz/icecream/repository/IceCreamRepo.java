package com.xworkz.icecream.repository;

import java.util.List;

import com.xworkz.icecream.entity.IceCreamEntity;

public interface IceCreamRepo {
	
	public void persist(IceCreamEntity entity);//d
	
	public void deleteByName(String name);//d
	
	public void updatePriceByName(String name,double price);//d
	
	public List<IceCreamEntity> getAll();//d
	
	public IceCreamEntity findByNameAndPrice(String name,double price);//d
	
	public IceCreamEntity getByMaxPrice();
	
	public IceCreamEntity getByMinPrice();
	
	public Double getSumPrice();//d
	
	public Double getPriceByName(String name);//d
	
	public List<Object[]> getNameAndFlavourByPrice(double price);

}
