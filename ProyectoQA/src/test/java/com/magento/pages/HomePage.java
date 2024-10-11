package com.magento.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




//El objetivo yo pueda tener todo los locatores ,
//para que y cual es el objetivo pueda organizarme y tener mi test mas limpio y sin ningun locator dentro de mi test
//todo debe estar en el registor page

public class HomePage extends BasePage{


	protected WebDriver driver;
	//by es una clase
	/**
	 * Web Elements
	 *
	 **/


	By registerLink = By.linkText("Create an Account");
	By signInLink = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");

	/**
	 *
	 * Contructor
	 **/
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver; // el driver que va llegar a traves del constructor y donde llega en registerPage = new RegisterPage(driver)
		visit();
	}

	/**
	 * Methods functions
	 *
	 **/

	public void goToRegisterLink() {
		click(registerLink);
	}

	public void goToSignInLink() {
		click(signInLink);
	}


}
