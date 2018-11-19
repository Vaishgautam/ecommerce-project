package com.teamsankya.ecommerceproject.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.teamsankya.ecommerceproject.dao.ProductSearchDaoImpl;
import com.teamsankya.ecommerceproject.dto.ProductInfoBean;

/**
 * This is a Controller class to interact with view and model
 * 
 * {@link ProductSearchController} Indicates that a particular class serves the
 * role of a controller. {@link RequestMapping} This specify what HTTP Request
 * is handled by the controller and by its method. {@link Autowired} This is
 * used for automatic dependency injection.
 */

@Controller
public class ProductSearchController {

	@Autowired
	private ProductSearchDaoImpl daoImpl;

	final Logger LOGGER = Logger.getLogger(ProductSearchController.class);

	@RequestMapping(method = RequestMethod.GET, path = "getproduct")
	public ModelAndView searchProduct(@RequestParam("product") String productName) {
		LOGGER.info("product name: " + productName);
		List<ProductInfoBean> dto = daoImpl.productSearch(productName);
		if (dto != null) {
			String pname = null;
			for (ProductInfoBean productInfoBean : dto) {
				pname = productInfoBean.getProductName();
				LOGGER.info(pname);
			}
			return new ModelAndView("productlist", "msg", dto);
		} else {
			return new ModelAndView("failure", "msg", "no result found");
		}
	}
}
