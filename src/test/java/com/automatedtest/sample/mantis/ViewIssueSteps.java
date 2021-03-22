package com.automatedtest.sample.mantis;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.automatedtest.sample.pages.BugProfilePage;
import com.automatedtest.sample.pages.HomePage;
import com.automatedtest.sample.pages.LoginPage;
import com.automatedtest.sample.pages.ViewReportPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewIssueSteps {
	private WebDriver driver;
	private HomePage homePage;
	private LoginPage loginPage;
	private ViewReportPage viewReportPage;
	private BugProfilePage bugProfilePage;
	private ViewReportPage viewPage;
	
	
	public ViewIssueSteps() {
        this.loginPage = new LoginPage();

    }
	@Given("The user wants to see any issue")
	public void theUserWantsToSeeAnyIssue() {
		loginPage.navigateToHomePage();
		homePage = new HomePage();
	}

	@When("clicks on View Issues")
	public void ClicksOnViewIssues() {

		homePage.ClickOnViewIssue();
		viewPage = new ViewReportPage(driver);
	}
	@When("The user selects a project \"([^\"]*)\"$")
	public void TheUserSelectsAProject(String project) {
		homePage.SelectProject(project);
	}
	
	@When("fills the filter bar with \"([^\"]*)\"$")
	public void FillsTheFilterBarWith(String id) {
	  viewPage.FilterBar(id);
	}
	@When("clicks on Filter button")
	public void ClicksOnFilterButton() {
	    viewPage.ClicksOnFilterButton();
	}
	@Then("The system does not show the searched \"([^\"]*)\"$")
	public void TheSystemDoesNotShowTheSearchedIssue(String id) {
		Assert.assertNotEquals(id, viewPage.CaptureIdIssueText());	
	}
	@Then("The system shows the filtered \"([^\"]*)\"$")
	public void TheSystemShowsTheSearchedIssue(String id) {
		this.bugProfilePage = new BugProfilePage(driver);
		Assert.assertEquals(id, viewPage.CaptureIdIssueText());	
	}

	

}
