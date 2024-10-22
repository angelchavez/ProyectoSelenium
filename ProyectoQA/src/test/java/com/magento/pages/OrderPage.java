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
	By Tops = By.xpath("//*[@id='narrow-by-list2']/dd/ol/li[1]/a");
    By SelectAddToCart = By.xpath("(//img[@alt='Cassius Sparring Tank'])[1]");
    By SelectTalla = By.xpath("(//div[@id='option-label-size-143-item-168'])[1]");
    By SelectColor = By.xpath("(//div[@id='option-label-color-93-item-50'])[1]");
    By AddToCart = By.xpath("(//span[normalize-space()='Add to Cart'])[1]");
    By SelectImagen = By.xpath("//span[@class='counter-number']");
    By removeItem = By.xpath("//a[@title='Remove item']");
    By SelectOK = By.xpath("(//span[normalize-space()='OK'])[1]");
	
	  

	
	
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
	       driver.findElement(SelectAddToCart).click();
	       driver.findElement(SelectTalla).click();
	       driver.findElement(SelectColor).click();
	       driver.findElement(AddToCart).click();
	              
	}
	
	public void deleteProduct() {
		
		   driver.findElement(signInLink).click();
	       driver.findElement(email1).sendKeys("angel46_318@hotmail.com");
	       driver.findElement(password).sendKeys("Elpeleador90@");
	       driver.findElement(btnIngLogin).click();          
	       //driver.findElement(dropdown).click();
	       //driver.findElement(Tops).click();
	       //driver.findElement(SelectAddToCart).click();
	       //driver.findElement(SelectTalla).click();
	       //driver.findElement(SelectColor).click();
	       //driver.findElement(AddToCart).click();
	       driver.findElement(SelectImagen).click();
	       driver.findElement(removeItem).click();
	       driver.findElement(SelectOK).click();
	       
	}
	
	
		
}
