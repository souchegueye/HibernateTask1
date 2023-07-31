package com.momo.Hibernatetask1;

import org.hibernate.Session;

import com.momo.entity.ProductDetails;

import com.momo.utils.HibernateUtils;

public class UpdateApp {
	public static void main(String[] args) {
		Session session = HibernateUtils.openSession();

		ProductDetails pdDetails = session.get(ProductDetails.class, 2);
		pdDetails.setProdId(2);
		pdDetails.setProdname("Ipad");
		pdDetails.setProdPrice(800);
		pdDetails.setProdQuantity(1);
		pdDetails.setProdTax(20);
		pdDetails.setProdTotalPrice(820);

		session.beginTransaction();
		session.update(pdDetails);
		session.getTransaction().commit();
		System.out.println(pdDetails);

		session.close();
	}
}
