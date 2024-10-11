package com.magento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;



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
	//public String expected_header = "Account Information"; //algunos errores es por el tipo protected


	/**
	 *
	 * Contructor
	 **/
	public RegisterPage(WebDriver driver) {
		super(driver);
		this.driver = driver; // el driver que va llegar a traves del constructor y donde llega en registerPage = new RegisterPage(driver)

	}

	/**
	 * Methods functions
	 *
	 **/

	public void registroUser() {

      driver.findElement(registerLinkLocator).click();
      if(isDisplay(registerLinkLocator)) {
    	  type("angel",firstname);
    	  type("chavez",lastname);
    	  type("angel46_318@hotmail.com",email);
    	  type("Elpeleador90@",password);
    	  type("Elpeleador90@",repassword);
    	  click(btnregister);
      }
      else {
    	  System.out.println("Register pages was not found");
      }
        String expected_title = "My Account";
		String actual_title= driver.getTitle();
		Assert.assertEquals(actual_title,expected_title);
		System.out.println(driver.getTitle());
	 }

	 public void registroCampos() {

	      driver.findElement(registerLinkLocator).click();
	      if(isDisplay(registerLinkLocator)) {
	    	  type("",firstname);
	    	  type("perez",lastname);
	    	  type("",email);
	    	  type("TingoMaria2025@",password);
	    	  type("",repassword);
	    	  click(btnregister);
	      }
	      else {
	    	  System.out.println("Register pages was not found");
	      }

	        String expected_title = "* Required Fields";
			String actual_title= driver.getTitle();
			Assert.assertEquals(actual_title,expected_title);
			System.out.println(driver.getTitle());
		 }


	 //driver.findElement(firstname).sendKeys(faker.address().firstName());

	    public void ingresarCorreovalido() {

		   driver.findElement(signInLink).click();
		   driver.findElement(email1).clear();
	       driver.findElement(email1).sendKeys("angel46_318@hotmail.com");
	       driver.findElement(password1).sendKeys("Elpeleador90@");
	       driver.findElement(btnrIngresoLogin).click();
	     /*
	       String expected_title = "My Account";
			String actual_title= driver.getTitle();
			Assert.assertEquals(actual_title,expected_title);
			System.out.println(driver.getTitle());*/
	    }

		public void correoSinArroba() {
			driver.findElement(signInLink).click();
			driver.findElement(email1).clear();
		    driver.findElement(email1).sendKeys("angel46_318hotmail.com");
		    driver.findElement(password1).sendKeys("Elpeleador90@");
		    driver.findElement(btnrIngresoLogin).click();

		}

		public void correoSinDominio() {
			driver.findElement(signInLink).click();
			driver.findElement(email1).clear();
		    driver.findElement(email1).sendKeys("angel46_318@");
		    driver.findElement(password1).sendKeys("Elpeleador90@");
		    driver.findElement(btnrIngresoLogin).click();
		}

		public void correoDominioIncompleto() {
			driver.findElement(signInLink).click();
			driver.findElement(email1).clear();
		    driver.findElement(email1).sendKeys("angel46_318@hotmail");
		    driver.findElement(password1).sendKeys("Elpeleador90@");
		    driver.findElement(btnrIngresoLogin).click();

		}
		public void ContrasenaSegura() {
			 driver.findElement(signInLink).click();
			 driver.findElement(email1).clear();
		     driver.findElement(email1).sendKeys("angel46_318@hotmail");
		     driver.findElement(password1).sendKeys("Elpeleador90@");
		     driver.findElement(btnrIngresoLogin).click();



	        // Contraseña que cumple con los criterios (mínimo 8 caracteres, alfanumérica, con un carácter especial)
	       //    registroPage.ingresarContrasena("Contra$123");
	         // registroPage.enviarFormulario();
	       // Assert.assertFalse(registroPage.verificarContrasenaInvalida(), "El sistema marcó incorrectamente una contraseña válida como débil.");
	    }

	    public void ContrasenaCorta() {
		        // Contraseña demasiado corta (menos de 8 caracteres)
	    	 driver.findElement(signInLink).click();
			 driver.findElement(email1).clear();
		     driver.findElement(email1).sendKeys("angel46_318@hotmail");
		     driver.findElement(password1).sendKeys("12345");
		     driver.findElement(btnrIngresoLogin).click();
		       // registroPage.ingresarContrasena("12345");
		       // registroPage.enviarFormulario();
		       // Assert.assertTrue(registroPage.verificarContrasenaInvalida(), "El sistema no detectó que la contraseña es demasiado corta.");
		}
	     public void ContrasenaSinNumeros() {
		        // Contraseña sin números
	    	 driver.findElement(signInLink).click();
			 driver.findElement(email1).clear();
		     driver.findElement(email1).sendKeys("angel46_318@hotmail");
		     driver.findElement(password1).sendKeys("elpeleador");
		     driver.findElement(btnrIngresoLogin).click();


		       // registroPage.ingresarContrasena("Contrasena!");
		        //registroPage.enviarFormulario();
		        //Assert.assertTrue(registroPage.verificarContrasenaInvalida(), "El sistema no detectó que faltan números en la contraseña.");
		 }
		public void ContrasenaSinCaracterEspecial() {
		        // Contraseña sin caracteres especiales
			driver.findElement(signInLink).click();
			 driver.findElement(email1).clear();
		     driver.findElement(email1).sendKeys("angel46_318@hotmail");
		     driver.findElement(password1).sendKeys("Elpeleador90");
		     driver.findElement(btnrIngresoLogin).click();
		       // registroPage.ingresarContrasena("Contrasena123");
		        //registroPage.enviarFormulario();
		        //Assert.assertTrue(registroPage.verificarContrasenaInvalida(), "El sistema no detectó que faltan caracteres especiales en la contraseña.");
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

		        // Assert the text is as expected
		        String expectedText = "There is already an account with this email address. If you are sure that it is your email address, ";
		        Assert.assertEquals(actualText, expectedText, "Text does not match!");


		}


}

