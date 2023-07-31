package com.momo.Hibernatetask1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.momo.entity.ProductDetails;

import com.momo.utils.HibernateUtils;

public class CreateApp {
	public static void main(String[] args) {
		Session session = HibernateUtils.openSession();

		ProductDetails pDetails2 = new ProductDetails();
		pDetails2.setProdId(3);
		pDetails2.setProdname("DVD");
		pDetails2.setProdPrice(3500);
		pDetails2.setProdQuantity(2);
		pDetails2.setProdTax(50);
		pDetails2.setProdTotalPrice(7050);
		

		session.beginTransaction();
		session.save(pDetails2);
		session.getTransaction().commit();
		System.out.println("Product Record Saved");

		session.close();
	}
}
