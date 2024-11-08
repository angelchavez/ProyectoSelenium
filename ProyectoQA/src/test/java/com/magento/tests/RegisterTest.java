package com.magento.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class RegisterTest extends BaseTest {

	// WebDriver driver; conflicto no trabajar con dos o mas webdriver
	 	
	
/*
    @Test
	public void registerAccount() {

    	
		 registerPage.registroexitoso();
		 
	
    }*/
   /*
        @Test (dataProvider = "dataCorreoElectronicoValido")
		public void doLoginCorreoValidoWithDataProvider(String name,String lastname,String email, String pass) 
        {
 
            driver.findElement(registerPage.registerLinkLocator).click();
			
			driver.findElement(registerPage.firstname).sendKeys(name);
			driver.findElement(registerPage.lastname).sendKeys(lastname);
			driver.findElement(registerPage.email).sendKeys(email);
			driver.findElement(registerPage.password).sendKeys(pass);
			driver.findElement(registerPage.repassword).sendKeys(pass);
			driver.findElement(registerPage.btnregister).click();
        	
		}
		@DataProvider
		//clase padre
		public Object[][] dataCorreoElectronicoValido()
	        {
			return new Object[][] 
	               {
			    
			    new Object[] {"angel","chavez","angel46_3188@hotmail.com","Elpeleador90@"}, // credenciales validas
			    new Object[] {"angel","chavez","angel46_3188hotmail.com","Elpeleador90@"}, // password invalido
			    new Object[] {"angel","chavez","angel46_3188@","Elpeleador90@"},// user invalido
			    new Object[] {"angel","chavez","angel46_3188@hotmail","Elpeleador90@"},
			    
			};
		}

        @Test (dataProvider = "dataPasswordSecurity")
		public void doPasswordSecurity(String name,String lastname,String email, String pass) 
        {
    	    
    	    
			driver.findElement(registerPage.registerLinkLocator).click();
			
			driver.findElement(registerPage.firstname).sendKeys(name);
			driver.findElement(registerPage.lastname).sendKeys(lastname);
			driver.findElement(registerPage.email).sendKeys(email);
			driver.findElement(registerPage.password).sendKeys(pass);
			driver.findElement(registerPage.repassword).sendKeys(pass);
			driver.findElement(registerPage.btnregister).click();
				
		}
		@DataProvider
		//clase padre
		public Object[][] dataPasswordSecurity()
	        {
			return new Object[][] 
	               {
				new Object[] {"angel","chavez","angel46_3188@hotmail.com","Elpeleador90@"}, 
			    new Object[] {"angel","chavez","angel46_3188@hotmail.com","elpeleador"}, 
			    new Object[] {"angel","chavez","angel46_3188@hotmail.com","Elpeleador90"},
			    new Object[] {"angel","chavez","angel46_3188@hotmail.com","123456"},
			};
		}
			
	    @Test (dataProvider = "dataConfirmPasswordSecurity")
		public void doConfirPasswordSecurity(String name,String lastname,String email, String pass,String pass1) 
	    {    
			driver.findElement(registerPage.registerLinkLocator).click();		
			driver.findElement(registerPage.firstname).sendKeys(name);
			driver.findElement(registerPage.lastname).sendKeys(lastname);
			driver.findElement(registerPage.email).sendKeys(email);
			driver.findElement(registerPage.password).sendKeys(pass);
			driver.findElement(registerPage.repassword).sendKeys(pass1);
			driver.findElement(registerPage.btnregister).click();		
		}
		@DataProvider
		//clase padre
		public Object[][] dataConfirmPasswordSecurity()
	        {
			return new Object[][] 
	               {
				new Object[] {"angel","chavez","angel46_318@hotmail.com","TingoMaria90@","TingoMaria90@"}, //contraseñan coinciden 
			    new Object[] {"angel","chavez","angel46_3188@hotmail.com","TingoMaria90@","TingoMaria"}, //	 contraseñas no coinciden
			};
		}*/
	/*
	public void CorreoUnico() {
		  driver.findElement(registerLinkLocator).click();
		  driver.findElement(firstname).sendKeys("rebosioo");
		  driver.findElement(lastname).sendKeys("perez");
		  driver.findElement(email).sendKeys("repere46_6789@hotmail.com");
		  driver.findElement(password).sendKeys("TingoMaria@@@");
		  driver.findElement(repassword).sendKeys("TingoMaria@@@");
		  driver.findElement(btnregister).click();
		  String expected_title = "Mi cuenta";
		  String actual_title= driver.getTitle();
		  Assert.assertEquals(actual_title,expected_title);
	}
	public void CorreoDuplicado() {
		  driver.findElement(registerLinkLocator).click();
		  driver.findElement(firstname).sendKeys("rebosioo");
		  driver.findElement(lastname).sendKeys("perez");
		  driver.findElement(email).sendKeys("repere46_6789@hotmail.com");
		  driver.findElement(password).sendKeys("TingoMaria@@@");
		  driver.findElement(repassword).sendKeys("TingoMaria@@@");
		  driver.findElement(btnregister).click();
		  WebElement element = driver.findElement(errorMessage); // Use the appropriate locator strategy
	      String actualText = element.getText();
	      String expectedText = "There is already an account with this email address. If you are sure that it is your email address, ";
	      Assert.assertEquals(actualText, expectedText, "Text does not match!");
	}*/
/*
	@Test
	public void CorreoUn() {
		registerPage.CorreoUnico();
	}
	@Test
	public void CorreoDu() {

	   registerPage.CorreoDuplicado();
	}*/








}
