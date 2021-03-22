package com.automatedtest.sample.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automatedtest.sample.basepage.AbstractPage;

import io.cucumber.datatable.DataTable;

public class ReportIssuePage extends AbstractPage{

	public ReportIssuePage(WebDriver driver) 
	{
       super(driver);  
	}
	

	public void SelectProject(DataTable table) {
		List<Map<String, String>> data = table.asMaps(String.class, String.class);

		WebElement project = getDriver().findElement(By.xpath("/html/body/div[2]/form/table/tbody/tr[2]/td[2]/select"));
	    WebElement selectBtn = getDriver().findElement(By.xpath("/html/body/div[2]/form/table/tbody/tr[4]/td/input"));
		project.sendKeys(data.get(0).get("Project"));
		selectBtn.click();
		
	}

	public void FillReportIssue(DataTable table) {
		List<Map<String, String>> data = table.asMaps(String.class, String.class);

		WebElement category = getDriver().findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[2]/td[2]/select"));
	    WebElement reproducibility = getDriver().findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[3]/td[2]/select"));
	    WebElement severity = getDriver().findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[4]/td[2]/select"));
	    WebElement priority = getDriver().findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[5]/td[2]/select"));
	    WebElement profile = getDriver().findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[6]/td[2]/select"));
	    WebElement summary = getDriver().findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[8]/td[2]/input"));
	    WebElement description = getDriver().findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[9]/td[2]/textarea"));
	    WebElement stepsToReproduce = getDriver().findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[10]/td[2]/textarea"));
	    WebElement additionalInfo = getDriver().findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[11]/td[2]/textarea"));
	    

	    if((data.get(0).get("Category"))!= null)
	    {
		    category.sendKeys(data.get(0).get("Category"));

	    }
	    reproducibility.sendKeys(data.get(0).get("Reproducibility"));
	    severity.sendKeys(data.get(0).get("Severity"));
	    priority.sendKeys(data.get(0).get("Priority"));
	    profile.sendKeys(data.get(0).get("Profile"));
	    if((data.get(0).get("Summary"))!= null)
	    {
	       summary.sendKeys(data.get(0).get("Summary"));
	    }
	    if((data.get(0).get("Description"))!= null)
	    {
	       description.sendKeys(data.get(0).get("Description"));
	    }
	    stepsToReproduce.sendKeys(data.get(0).get("Step To Reproduce"));
	    additionalInfo.sendKeys(data.get(0).get("Additional Info"));
	}

	public void Status(String status)
	{
		switch (status) {
        case "Public":
    	    WebElement publicStatus = getDriver().findElement(By.xpath("/html/body/div[2]/form/table/tbody/tr[4]/td/input"));
    	    publicStatus.click();
            break;
        case "Legal Defense Insurance":
    	    WebElement privateStatus = getDriver().findElement(By.xpath("/html/body/div[2]/form/table/tbody/tr[4]/td/input"));
    	    privateStatus.click();
        	break;
		}
	}
	public void ClickSubmitReport() {
		WebElement submitBtn = getDriver().findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[15]/td[2]/input"));		
	    submitBtn.click();
	}

	public boolean CheckSuccessfulMessage() {

		WebElement checkAddIssue = getDriver().findElement(By.xpath("/html/body/div[2]"));
		return checkAddIssue.getText().contains("View Submitted Issue");
	}

	public String ReturnMessageError() {
      WebElement errorMessage = getDriver().findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td/p"));
		return errorMessage.getText();
	}

}
