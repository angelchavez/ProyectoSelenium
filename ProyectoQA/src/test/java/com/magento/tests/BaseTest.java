package com.magento.tests;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.magento.pages.HomePage;
import com.magento.pages.LoginPage;
import com.magento.pages.OrderPage;
import com.magento.pages.RegisterPage;


public class BaseTest {

	protected WebDriver driver;
	protected RegisterPage registerPage;
	protected HomePage homePage;
	protected LoginPage loginPage;
    protected OrderPage orderPage;

	@BeforeMethod
	public void setup() {
		

		driver = new EdgeDriver();
		registerPage = new RegisterPage(driver); //porque se lo pasa el driver porque sino el extendes que tengo no va funcionar
		//el objeto solamente esta aqui y no esta al otro lado
		homePage= new HomePage(driver);
		loginPage = new LoginPage(driver);
		orderPage = new OrderPage(driver);
		

	}

	@AfterMethod
	public void tearDown() {
		if(driver!=null) {
			//driver.quit();




		}
	}

}
