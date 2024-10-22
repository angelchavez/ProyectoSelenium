package com.magento.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.magento.tests.BaseTest;
import com.magento.utils.variables;

public class BasePage extends BaseTest {

   WebDriver driver;
   WebDriverWait wait;
 

	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(variables.TIME_OUT));// creo en memoria
		
	}

	public void visit() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(variables.TIME_OUT));
		driver.get(variables.BASE_URL);
	}

	public WebElement find(By locator) {
		return driver.findElement(locator);
	}

	public void type(By locator, String text) {
		find(locator).sendKeys(text);
	}

	public void click(By locator) {
		find(locator).click();
	}

	public void submit(By locator) {
		find(locator).submit();
	}

	public boolean isDisplay(By locator) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void type(String inputText, By locator) {
	     driver.findElement(locator).sendKeys(inputText);
	}
	



}
