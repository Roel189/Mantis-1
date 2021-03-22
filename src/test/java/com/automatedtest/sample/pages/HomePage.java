package com.automatedtest.sample.pages;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.automatedtest.sample.basepage.AbstractPage;
import com.automatedtest.sample.basepage.BasePage;
import io.cucumber.datatable.DataTable;

public class HomePage extends BasePage {
	
	//private WebElement issueField = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[1]"));
	//private WebElement viewIssue = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/a[2]"));
	//private WebElement reportIssue = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/a[3]"));
    private WebElement jumpBtn = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[2]"));

	public HomePage(WebDriver driver) {
        //super(driver);
    }
	public HomePage() {
        PageFactory.initElements(driver, this);
    }
	
	public void FillIssueField(String id)
	{
		WebElement issueField = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[1]"));
		issueField.sendKeys(id);
	}
	public void ClickJumpBtn()
	{
		WebElement jumpBtn = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[2]"));
		jumpBtn.click();
	}
	public void ClickOnReportIssue()
	{
		WebElement reportIssue = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/a[3]"));
		reportIssue.click();
	}
	public void ClickOnViewIssue()
	{
		WebElement viewIssue = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/a[2]"));
		viewIssue.click();
	}
	public void navigateToHomePage() {
    	//driver.navigate().to(PAGE_HOME_URL);
    }
	public void SelectProject(String project)
	{
      WebElement projectBox = driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td[3]/form/select"));
		projectBox.sendKeys(project);

	}
}
