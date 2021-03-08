package com.xworkz.coupon.dao;

import java.util.List;

import com.xworkz.coupon.entity.CouponEntity;

public interface CouponDAO {
	
	void create(CouponEntity entity);
	
	CouponEntity getById(int id);
	
	void updateValidyMonthsAndOfferById(int months,int offer,int id);
	
	void deleteById(int id);
	
	void create(List<CouponEntity> entities);

}
