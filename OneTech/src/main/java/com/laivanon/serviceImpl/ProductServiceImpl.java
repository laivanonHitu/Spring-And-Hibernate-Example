package com.laivanon.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laivanon.DAO.ProductsDAO;
import com.laivanon.model.ProductsModel;
import com.laivanon.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductsDAO productsDAO;

	public void setProductDao(ProductsDAO ProductDAO) {
		this.productsDAO = ProductDAO;
	}

	public List<ProductsModel> listProduct() {
		return this.productsDAO.listProduct();
	}


}
