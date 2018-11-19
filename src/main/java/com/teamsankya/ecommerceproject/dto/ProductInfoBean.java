package com.teamsankya.ecommerceproject.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 
 * The {@link ProductInfoBean} implements {@link Serializable}. Constructor -
 * created NoArgument Constructor. Used TOStringBuilder. {@link Entity} -
 * Specifies that the class is an entity,this annotation is applied to the
 * entity class. {@link Table} - Specifies the primary table for the annotated
 * entity. {@link Id} - Specifies mapped column of the entity is assumed to be
 * the primary key of the primary table. {@link Column} - Specifies the mapped
 * column for a persistent property or field.
 */

@Entity
@Table(name = "product_details")
public class ProductInfoBean implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "TABLE_GEN")
	@Column(name = "productId")
	private String productId;
	@Column(name = "productName")
	private String productName;
	@Column(name = "productBrand")
	private String productBrand;
	@Column(name = "productPrice")
	private double productPrice;
	@Column(name = "productColor")
	private String productColor;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	@Override
	public String toString() {
		return "ProductInfoBean [productId=" + productId + ", productName=" + productName + ", productBrand="
				+ productBrand + ", productPrice=" + productPrice + ", productColor=" + productColor + "]";
	}

}
