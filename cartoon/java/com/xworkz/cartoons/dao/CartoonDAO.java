package com.xworkz.cartoons.dao;

import java.util.List;

import com.xworkz.cartoons.entity.CartoonEntity;
import com.xworkz.cartoons.entity.CartoonEntity.ChannelName;

public interface CartoonDAO {

	public void create(List<CartoonEntity> entity);
	
	public CartoonEntity findByName(String name);
	
	public CartoonEntity findByChannelAndLanguage(ChannelName channel,String language);
}
