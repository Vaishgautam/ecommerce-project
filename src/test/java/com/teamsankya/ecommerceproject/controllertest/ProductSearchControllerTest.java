package com.teamsankya.ecommerceproject.controllertest;

import org.junit.Test;

import junit.framework.TestCase;
import net.sourceforge.jwebunit.WebTester;

public class ProductSearchControllerTest extends TestCase {
	private WebTester tester = new WebTester();
	private static final String BASE_URL = "http://localhost:8080/lotproject/";
	 
	@Override
	protected void setUp() throws Exception {
		tester.getTestContext().setBaseUrl(BASE_URL);
	}
	@Test
	public void testGetProductName() {
		tester.beginAt("productsearch.jsp");
		
		tester.assertFormPresent();
		tester.setFormElement("productName", "Shirt");
		//tester.submit();
		
	}

}
