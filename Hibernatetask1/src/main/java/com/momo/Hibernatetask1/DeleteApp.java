package com.momo.Hibernatetask1;

import org.hibernate.Session;

import com.momo.entity.ProductDetails;

import com.momo.utils.HibernateUtils;

public class DeleteApp {
	public static void main(String[] args) {
		Session session = HibernateUtils.openSession();

		ProductDetails pDetails = session.get(ProductDetails.class, 2);

		session.beginTransaction();
		session.delete(pDetails);
		session.getTransaction().commit();
		System.out.println(pDetails);

		session.close();
	}
}
