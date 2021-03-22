package com.automatedtest.sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.automatedtest.sample.basepage.BasePage;

public class LoginPage extends BasePage {
	private static final String PAGE_HOME_URL = "https://mantis-prova.base2.com.br";
	//private WebElement login = driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[2]/td[2]/input"));
	//private WebElement password = driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[3]/td[2]/input"));
    //private WebElement loginBtn =  driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[6]/td/input"));
	///html/body/div[3]/form/table/tbody/tr[2]/td[2]/input
	///html/body/div[3]/form/table/tbody/tr[3]/td[2]/input
	
	public LoginPage(WebDriver driver) {}
	public LoginPage() {
        PageFactory.initElements(driver, this);
    }
	

	public void navigateToHomePage() {
    	driver.navigate().to(PAGE_HOME_URL);
    	driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("rodrigo.roel");
		driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("Tester175812");
	    driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[6]/td/input")).click();
    }
	
    
    	

}
