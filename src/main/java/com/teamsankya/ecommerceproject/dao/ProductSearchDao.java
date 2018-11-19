package com.teamsankya.ecommerceproject.dao;

import java.util.List;

import com.teamsankya.ecommerceproject.dto.ProductInfoBean;

/**
 * We perform Database connectivity, configuration and interaction 
 * and giving response back to controller
 */

public interface ProductSearchDao {

	public List<ProductInfoBean> productSearch(String productName);

}
