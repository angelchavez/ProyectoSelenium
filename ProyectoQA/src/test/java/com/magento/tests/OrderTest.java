package com.magento.tests;

import org.testng.annotations.Test;

public class OrderTest extends BaseTest{
	
	/*
	   @Test
		public void AddProducto()  { 

			orderPage.AddProduct();
		}
	

	   @Test
		public void EliminarProducto()  { 

		  orderPage.deleteProduct();
		}*/
	
	  @Test
	  public void MoficarProducto() {
		  
		  orderPage.ModifyProduct();
	  }
	

}
