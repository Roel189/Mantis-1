package com.automatedtest.sample.mantis;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automatedtest.sample.pages.BugProfilePage;
import com.automatedtest.sample.pages.HomePage;
import com.automatedtest.sample.pages.LoginPage;
import com.automatedtest.sample.pages.ReportIssuePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReportIssueSteps {
	
	private ReportIssuePage reportIssue;
	private LoginPage loginPage = new LoginPage();
    private HomePage homePage;
    private WebDriver driver;
    private WebElement msg;
    
	@Given("The user wants to report any issue")
	public void theUserWantsToSeeAnyIssue() {
	    loginPage.navigateToHomePage();
	}

	@When("The user clicks on Report Issue button")
	public void TheUserClicksOnReportIssueButton() 
	{
         this.homePage = new HomePage();
         homePage.ClickOnReportIssue();
    }

	@When("fills the Report Issue")
	public void FillsTheReportIssue(DataTable table) {
		this.reportIssue = new ReportIssuePage(driver);
		reportIssue.SelectProject(table);
		reportIssue.FillReportIssue(table);
	}
	@When("fills the Report Issue without mandatory fields")
	public void FillsTheReportIssueWithoutMandatory(DataTable table) {
		this.reportIssue = new ReportIssuePage(driver);
		reportIssue.SelectProject(table);
		reportIssue.FillReportIssue(table);
	}
	
	@When("clicks to submit report")
	public void ClicksToSubmitReport() {
        reportIssue.ClickSubmitReport();
	}
	@Then("The system saves the report$")
	public void theSystemShowsTheSearchedIssue() {
		Assert.assertTrue(reportIssue.CheckSuccessfulMessage());
	}
	@Then("The system notifies that the message")
	public void theSystemShowsTheSearchedIssue(DataTable message) {
	

        Assert.assertEquals(message.cell(0,0).toString(),reportIssue.ReturnMessageError());
        
	}
}
