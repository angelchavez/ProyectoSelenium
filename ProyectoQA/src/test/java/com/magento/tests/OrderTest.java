package com.magento.tests;

import org.testng.annotations.Test;

public class OrderTest extends BaseTest{
	
	
	   @Test
		public void AddProducto() {

			orderPage.AddProduct();
		}

}
