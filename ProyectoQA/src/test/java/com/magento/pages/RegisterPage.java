package com.magento.pages;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



//El objetivo yo pueda tener todo los locatores ,
//para que y cual es el objetivo pueda organizarme y tener mi test mas limpio y sin ningun locator dentro de mi test
//todo debe estar en el registor page

public class RegisterPage extends BasePage{


	 WebDriver driver;
	//by es una clase
	/**
	 * Web Elements
	 *
	 **/
	public    By registerLinkLocator = By.linkText("Create an Account");
	public    By signInLink = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");
	public    By firstname =By.id("firstname") ;
	public    By lastname =By.id("lastname") ;
	public    By email =By.id("email_address") ;
	public    By email1 = By.id("email");
	public    By email2 = By.xpath("//input[@id='email']");
	public    By password1 = By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']");
	public    By password =By.id("password") ;
	public    By repassword =By.id("password-confirmation") ;
	public    By btnregister = By.xpath("//*[@class='action submit primary']");
	public    By btnrIngresoLogin = By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]");
	public    By errorMessage = By.xpath("//div[@class='messages']//div//div");
	public    By errorMessage1 = By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]");   
	public    By passwordError = By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/form[1]/fieldset[2]/div[3]/div[1]/div[1]");
	

	public RegisterPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	    public void registroexitoso() {
			driver.findElement(registerLinkLocator).click();
			driver.findElement(firstname).sendKeys("Juan");
			driver.findElement(lastname).sendKeys("Pacheco");
			driver.findElement(email).sendKeys("JuanPache@hotmail.com");
			driver.findElement(password).sendKeys("Elpeleador90@@");
			driver.findElement(repassword).sendKeys("Elpeleador90@@");
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
			System.out.println("Error no ingreso el Nombre:"+first_error);
			boolean last_error = driver.findElement(By.id("lastname-error")).isDisplayed();
			assertTrue(last_error);
			System.out.println("Error no ingreso el Apellido:"+last_error);
			boolean ema_error = driver.findElement(By.id("email_address-error")).isDisplayed();
			assertTrue(ema_error);
			System.out.println("Error no ingreso el Email:"+ema_error);
			boolean pass_error = driver.findElement(By.xpath("(//div[@id='password-error'])[1]")).isDisplayed();
			assertTrue(pass_error);
			System.out.println("Error no ingreso el la contraseña:"+pass_error);
			boolean repass_error = driver.findElement(By.xpath("(//div[@id='password-confirmation-error'])[1]")).isDisplayed();
			assertTrue(repass_error);	
			System.out.println("Error no ingreso la confirmación de contraseña:"+repass_error);
	    }
	    
	    public String getErrorMessage() {
	        return driver.findElement(errorMessage1).getText();
	    }
        
	    public boolean isErrorMessageDisplayed() {
	        return driver.findElement(errorMessage1).isDisplayed();
	    }
	    
	    public String getErrorMessagePass() {
	    	return driver.findElement(passwordError).getText();
	    }
	    
	    public boolean isPasswordDisplayed() {
	    	return driver.findElement(passwordError).isDisplayed();
	    }
}

