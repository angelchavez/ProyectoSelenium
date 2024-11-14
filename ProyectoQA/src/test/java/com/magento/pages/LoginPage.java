package com.magento.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



//El objetivo yo pueda tener todo los locatores ,
//para que y cual es el objetivo pueda organizarme y tener mi test mas limpio y sin ningun locator dentro de mi test
//todo debe estar en el registor page

public class LoginPage extends BasePage{


	protected WebDriver driver;
	//by es una clase
	/**
	 * Web Elements
	 *
	 **/

	By signInLink = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");
	By email = By.id("email_address");
	By email1 = By.id("email");
	By password =By.id("pass") ;
	By btnIngLogin = By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]");
	By btnUser = By.xpath("(//button[@type='button'])[1]");
	By ScogeOpc = By.linkText("My Account");
	By IncioImage = By.xpath("//a[@aria-label='store logo']//img@");
	By olvidadopass = By.cssSelector(".action.remind");
	By btnreset = By.xpath("(//span[normalize-space()='Reset My Password'])[1]");
	By account = By.xpath("//span[@class='base']");
	By welcomeMessage = By.cssSelector("div[class='panel header'] span[class='logged-in']");
	//public String expected_header = "Account Information"; //algunos errores es por el tipo protected


	/**
	 *
	 * Contructor
	 **/
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver; // el driver que va llegar a traves del constructor y donde llega en registerPage = new RegisterPage(driver)

	}

	/**
	 * Methods functions
	 *
	 **/

     //Inicio de sesión exitoso:

	 public void InicioSesion() {

		   driver.findElement(signInLink).click();
		   driver.findElement(email1).clear();
	       driver.findElement(email1).sendKeys("angel46_319@hotmail.com");
	       driver.findElement(password).sendKeys("Elpeleador90@");
	       driver.findElement(btnIngLogin).click();
	       String login = "Welcome";
	       if(login.equals(welcomeMessage))
	       {
	    	   System.out.println("El usuario se registro correctamente");
	       }
	       else {
	    	   
	    	   Assert.assertTrue(isLoginSuccessful(), "Error: No se redirigió al usuario a su área personal.");
	       }    
	    }
	 public String getErrorMessage() {
	        return driver.findElement(welcomeMessage).getText();
	    }
	 
	 public boolean isLoginSuccessful() {
	        return driver.findElement(welcomeMessage).isDisplayed();
	 }
	 /*
     //Inicio de sesion con credenciales incorrectas
	 public void IncioSesionIncorrectos() {
		   driver.findElement(signInLink).click();
		   driver.findElement(email1).clear();
	       driver.findElement(email1).sendKeys("angel46_31877@hotmail.com");
	       driver.findElement(password).sendKeys("Elpeleador90@");
	       driver.findElement(btnIngLogin).click();
	       driver.findElement(btnUser).click();
	       driver.findElement(ScogeOpc).click();
	       driver.findElement(IncioImage).click();

	 }
     //Inicio de credenciales en blanco
	 public void CredencialVacio() {
		   driver.findElement(signInLink).click();
		   driver.findElement(email1).clear();
	       driver.findElement(email1).sendKeys("");
	       driver.findElement(password).sendKeys("");
	       driver.findElement(btnIngLogin).click();

	 }
	 //Correo Elctronico No registrado
	 public void CorreoNotRegister() {
		   driver.findElement(signInLink).click();
		   driver.findElement(email1).clear();
	       driver.findElement(email1).sendKeys("angel4631877@hotmail.com");
	       driver.findElement(password).sendKeys("Elpeleador90@");
	       driver.findElement(btnIngLogin).click();
	 }
	 //Contraseña Olvidada
	 public void ForgottenPassword()  {
		  //Thread.sleep(3000);
		   //driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
		   driver.findElement(signInLink).click();
	       driver.findElement(email1).sendKeys("angel46_318@hotmail.com");
	       driver.findElement(password).sendKeys("Elpeleador90");
	       driver.findElement(btnIngLogin).click();
	       driver.findElement(olvidadopass).click();
	       driver.findElement(email).sendKeys("angel46_318@hotmail.com");
	       driver.findElement(btnreset).click();
	 }*/

}

