package com.magento.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

	//WebDriver driver; //conflicto no trabajar con dos o mas webdriver
	 	
	
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
			*/
	    @Test (dataProvider = "dataConfirmPasswordSecurity")
		public void doConfirPasswordSecurity(String name,String lastname,String email, String pass,String pass1, boolean expectMismatch) 
	    {    
			driver.findElement(registerPage.registerLinkLocator).click();		
			driver.findElement(registerPage.firstname).sendKeys(name);
			driver.findElement(registerPage.lastname).sendKeys(lastname);
			driver.findElement(registerPage.email).sendKeys(email);
			driver.findElement(registerPage.password).sendKeys(pass);
			driver.findElement(registerPage.repassword).sendKeys(pass1);
			driver.findElement(registerPage.btnregister).click();	
			if (expectMismatch) {
	            Assert.assertTrue(registerPage.isPasswordDisplayed(), "Error de confirmación no mostrado");
	        } else {
	            Assert.assertFalse(registerPage.isPasswordDisplayed(), "Error de confirmación mostrado cuando no debería");
	        }
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
	    }
	    	
	/*
	    @Test (dataProvider = "dataEmail")
		public void CorreoEmailUnico(String name,String lastname,String email, String pass,String pass1) 
	    {    
	    	
			driver.findElement(registerPage.registerLinkLocator).click();		
			driver.findElement(registerPage.firstname).sendKeys(name);
			driver.findElement(registerPage.lastname).sendKeys(lastname);
			driver.findElement(registerPage.email).sendKeys(email);
			driver.findElement(registerPage.password).sendKeys(pass);
			driver.findElement(registerPage.repassword).sendKeys(pass1);
			driver.findElement(registerPage.btnregister).click();	
		
			if(email.equals("angel46_31889@hotmail.com")){
				Assert.assertTrue(registerPage.isErrorMessageDisplayed(), "Error message should be displayed");
	            Assert.assertTrue(registerPage.getErrorMessage().contains("There is already an account with this email address"), "Error message should indicate duplicate email");
			    
	            System.out.println("Registro de correo ya existe.");
			
			}else {
				 System.out.println("Registro exitoso para correo único.");
			}
		}
		@DataProvider
		//clase padre
		public Object[][] dataEmail()
	        {
			return new Object[][] 
	               {
				new Object[] {"angel","chavez","angel46_31889@hotmail.com","TingoMaria90@","TingoMaria90@"}, //correo que ya existe
			    new Object[] {"robert","saldana","angel46_9999@hotmail.com","TingoMaria90@","TingoMaria90@"}, // correo nuevo
			};
	    }	*/
}
