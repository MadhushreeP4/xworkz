package com.xworkz.coupon;

import com.xworkz.coupon.dao.CouponDAO;
import com.xworkz.coupon.dao.CouponDAOImpl;

public class CouponTester {

	public static void main(String[] args) {
		
		CouponDAO dao=new CouponDAOImpl();
		
		System.out.println(dao.getById(1));
		
		dao.updateValidyMonthsAndOfferById(2, 25, 2);
		
		dao.deleteById(1);
	}

}
