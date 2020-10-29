package com.laivanon.DAOImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.laivanon.DAO.ProductsDAO;
import com.laivanon.model.ProductsModel;

@Repository
public class ProductsDAOImpl implements ProductsDAO {
	@Autowired
	private static final Logger logger = LoggerFactory.getLogger(ProductsDAOImpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@SuppressWarnings("unchecked")
	public List<ProductsModel> listProduct() {
		Session session = this.sessionFactory.getCurrentSession();
		List<ProductsModel> listProduct = session.createQuery("from product").list();
		for (ProductsModel p : listProduct) {
			logger.info("list product" + p);
		}
		return listProduct;
	}
	
	
}
