package com.xworkz.coupon;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.coupon.dao.CouponDAO;
import com.xworkz.coupon.dao.CouponDAOImpl;
import com.xworkz.coupon.entity.CouponEntity;

public class CouponCreteTester {

	public static void main(String[] args) {
	
		CouponEntity coupon1=new CouponEntity("Licious", "Food", 10, 1);
		CouponEntity coupon2=new CouponEntity("Cool-Wink", "Spects", 40, 3);
		
		CouponDAO dao=new CouponDAOImpl();
		dao.create(coupon1);
		
		CouponEntity coupon3=new CouponEntity("Flipkart", "Grocery", 5, 1);
		CouponEntity coupon4=new CouponEntity("Kazo", "cloths", 15, 2);
		CouponEntity coupon5=new CouponEntity("Swiggy", "mart", 50, 1);
		CouponEntity coupon6=new CouponEntity("Lakme", "cosmetics", 5, 1);
		CouponEntity coupon7=new CouponEntity("Celio", "cloths", 10, 2);
		
		List<CouponEntity> list=new ArrayList<CouponEntity>();
		list.add(coupon3);
		list.add(coupon4);
		list.add(coupon5);
		list.add(coupon6);
		list.add(coupon7);
		
		//dao.create(list);
		
	}

}
