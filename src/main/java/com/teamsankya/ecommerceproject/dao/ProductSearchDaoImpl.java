package com.teamsankya.ecommerceproject.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.teamsankya.ecommerceproject.dto.ProductInfoBean;


/**
 * Here we are implementing ProductSearchDao interface. see
 * org.hibernate.SessionFactory {@link Autowired} This is used for automatic
 * dependency injection
 */

public class ProductSearchDaoImpl implements ProductSearchDao {

	/**
	 * SessionFactory is usually created during application start up and kept for
	 * later use.
	 */

	@Autowired
	private SessionFactory sessionFactory;

	public List<ProductInfoBean> productSearch(String productName) {
		String qry = "from ProductInfoBean  where productName='" + productName + "'";
		Session session = sessionFactory.openSession();
		System.out.println(session);
		Query query = session.createQuery(qry);
		List<ProductInfoBean> dto = query.list();
		return dto;
	}

}
