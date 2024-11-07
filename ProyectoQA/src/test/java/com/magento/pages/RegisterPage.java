package com.magento.pages;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




//El objetivo yo pueda tener todo los locatores ,
//para que y cual es el objetivo pueda organizarme y tener mi test mas limpio y sin ningun locator dentro de mi test
//todo debe estar en el registor page

public class RegisterPage extends BasePage{


	protected WebDriver driver;
	//by es una clase
	/**
	 * Web Elements
	 *
	 **/

	By registerLinkLocator = By.linkText("Create an Account");
	By signInLink = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");
	By firstname =By.id("firstname") ;
	By lastname =By.id("lastname") ;
	By email =By.id("email_address") ;
	By email1 = By.id("email");
	By password1 = By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']");
	By password =By.id("password") ;
	By repassword =By.id("password-confirmation") ;
	By btnregister = By.xpath("//*[@class='action submit primary']");
	By btnrIngresoLogin = By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]");
	By errorMessage = By.xpath("//div[@class='messages']//div//div");
	

	public RegisterPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	    public void registroexitoso() {
			driver.findElement(registerLinkLocator).click();
			driver.findElement(firstname).sendKeys("angel24");
			driver.findElement(lastname).sendKeys("chavez");
			driver.findElement(email).sendKeys("angel46_318@hotmail.com");
			driver.findElement(password).sendKeys("Elpeleador90@");
			driver.findElement(repassword).sendKeys("Elpeleador90@");
			driver.findElement(btnregister).click();
			boolean UserRegister = driver.findElement(By.xpath("(//li[@class='greet welcome'])[1]")).isDisplayed();
			assertTrue(UserRegister);
			System.out.println("El assert es:"+UserRegister);
	    }
	    public void registroCampos() {
	    	
	    	// Verificación de mensajes de error para campos obligatorios faltantes
	    	
	    	driver.findElement(registerLinkLocator).click();
	    	driver.findElement(btnregister).click();
	    	boolean first_error = driver.findElement(By.id("firstname-error")).isDisplayed();
			assertTrue(first_error);
			boolean last_error = driver.findElement(By.id("lastname-error")).isDisplayed();
			assertTrue(last_error);
			boolean ema_error = driver.findElement(By.id("email_address-error")).isDisplayed();
			assertTrue(ema_error);
			boolean pass_error = driver.findElement(By.xpath("(//div[@id='password-error'])[1]")).isDisplayed();
			assertTrue(pass_error);
			boolean repass_error = driver.findElement(By.xpath("(//div[@id='password-confirmation-error'])[1]")).isDisplayed();
			assertTrue(repass_error);
	    	
	    }

	    @Test (dataProvider = "dataLogin")
		public void doLoginCorreoValidoWithDataProvider(String email, String pass) {
			
			driver.findElement(signInLink).click();
			driver.findElement(email1).sendKeys(email);
			driver.findElement(password).sendKeys(pass);
			
			
		
		}
	
		@DataProvider
		//clase padre
		public Object[][] dataLogin()
	        {
			return new Object[][] 
	               {
				new Object[] {"angel46_318@hotmail.com","Elpeleador90@"}, // credenciales validas
				new Object[] {"angel46_318hotmail.com","Elpeleador90@"}, // password invalido
				new Object[] {"angel46_318@","Elpeleador90@"},// user invalido
				new Object[] {"angel46_318@hotmail","Elpeleador90@"},
			};
		}
	    
	       
	    
		public void ContrasenaSegura() {
			 driver.findElement(signInLink).click();
			 driver.findElement(email1).clear();
		     driver.findElement(email1).sendKeys("angel46_318@hotmail");
		     driver.findElement(password1).sendKeys("Elpeleador90@");
		     driver.findElement(btnrIngresoLogin).click();
	    }

	    public void ContrasenaCorta() {
		     // Contraseña demasiado corta (menos de 8 caracteres)
	    	 driver.findElement(signInLink).click();
			 driver.findElement(email1).clear();
		     driver.findElement(email1).sendKeys("angel46_318@hotmail");
		     driver.findElement(password1).sendKeys("12345");
		     driver.findElement(btnrIngresoLogin).click();
		}
	     public void ContrasenaSinNumeros() {
		        // Contraseña sin números
	    	 driver.findElement(signInLink).click();
			 driver.findElement(email1).clear();
		     driver.findElement(email1).sendKeys("angel46_318@hotmail");
		     driver.findElement(password1).sendKeys("elpeleador");
		     driver.findElement(btnrIngresoLogin).click();
		 }
		public void ContrasenaSinCaracterEspecial() {
		        // Contraseña sin caracteres especiales
			driver.findElement(signInLink).click();
			 driver.findElement(email1).clear();
		     driver.findElement(email1).sendKeys("angel46_318@hotmail");
		     driver.findElement(password1).sendKeys("Elpeleador90");
		     driver.findElement(btnrIngresoLogin).click();
		}

		public void ConfirmarContraseñaCoinciden() {
			  driver.findElement(registerLinkLocator).click();
			  driver.findElement(firstname).sendKeys("juan");
			  driver.findElement(lastname).sendKeys("perez");
			  driver.findElement(email).sendKeys("angel46_678@hotmail.com");
			  driver.findElement(password).sendKeys("Elpeleador90@@");
			  driver.findElement(repassword).sendKeys("Elpeleador90@@");
			  driver.findElement(btnregister).click();
		}
		public void ConfirmarContraseñaNoCoinciden() {
			  driver.findElement(registerLinkLocator).click();
			  driver.findElement(firstname).sendKeys("juan");
			  driver.findElement(lastname).sendKeys("perez");
			  driver.findElement(email).sendKeys("angel46_678@hotmail.com");
			  driver.findElement(password).sendKeys("Elpeleador90@@");
			  driver.findElement(repassword).sendKeys("Elpeleador90@@");
			  driver.findElement(btnregister).click();
		}
		public void CorreoUnico() {
			  driver.findElement(registerLinkLocator).click();
			  driver.findElement(firstname).sendKeys("rebosioo");
			  driver.findElement(lastname).sendKeys("perez");
			  driver.findElement(email).sendKeys("repere46_6789999@hotmail.com");
			  driver.findElement(password).sendKeys("Elpeleador90@@@");
			  driver.findElement(repassword).sendKeys("Elpeleador90@@@");
			  driver.findElement(btnregister).click();
			  String expected_title = "Mi cuenta";
			  String actual_title= driver.getTitle();
			  Assert.assertEquals(actual_title,expected_title);
		}
		public void CorreoDuplicado() {
			  driver.findElement(registerLinkLocator).click();
			  driver.findElement(firstname).sendKeys("rebosioo");
			  driver.findElement(lastname).sendKeys("perez");
			  driver.findElement(email).sendKeys("repere46_6789999@hotmail.com");
			  driver.findElement(password).sendKeys("Elpeleador90@@@");
			  driver.findElement(repassword).sendKeys("Elpeleador90@@@");
			  driver.findElement(btnregister).click();
			  WebElement element = driver.findElement(errorMessage); // Use the appropriate locator strategy
		      String actualText = element.getText();
		      String expectedText = "There is already an account with this email address. If you are sure that it is your email address, ";
		      Assert.assertEquals(actualText, expectedText, "Text does not match!");
		}


}

