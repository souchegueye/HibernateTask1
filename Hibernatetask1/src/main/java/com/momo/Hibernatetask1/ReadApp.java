package com.momo.Hibernatetask1;

import org.hibernate.Session;

import com.momo.entity.ProductDetails;

import com.momo.utils.HibernateUtils;

public class ReadApp {
	public static void main(String[] args) {
		Session session = HibernateUtils.openSession();

		ProductDetails pdDetails = session.get(ProductDetails.class, 1);
		System.out.println(pdDetails);

		session.close();
	}
}
