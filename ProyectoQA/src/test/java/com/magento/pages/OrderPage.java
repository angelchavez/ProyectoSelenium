package com.magento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class OrderPage extends BasePage{

	protected WebDriver driver;
	
    
	
	//Actions acciones = new Actions(driver);
	
	By signInLink = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");
	By email = By.id("email_address");
	By email1 = By.id("email");
	By password =By.id("pass") ;
	By btnIngLogin = By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]");
	By dropdown = By.xpath("//a[@id='ui-id-5']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']");
	By Tops = By.xpath("(//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[2]");
	By Jackets = By.xpath("(//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[5]");
	
	  

	
	
	public OrderPage(WebDriver driver) {
		super(driver);
		this.driver = driver; // el driver que va llegar a traves del constructor y donde llega en registerPage = new RegisterPage(driver)

	}
	
	public void AddProduct() {
		
		   driver.findElement(signInLink).click();
	       driver.findElement(email1).sendKeys("angel46_318@hotmail.com");
	       driver.findElement(password).sendKeys("Elpeleador90@");
	       driver.findElement(btnIngLogin).click();          
	       driver.findElement(dropdown).click();
	       driver.findElement(Tops).click();
	       driver.findElement(Jackets).click();

	      
	       
	       
	    
	}

	
	
}
