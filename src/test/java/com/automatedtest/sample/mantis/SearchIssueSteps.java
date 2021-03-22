package com.automatedtest.sample.mantis;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.automatedtest.sample.pages.BugProfilePage;
import com.automatedtest.sample.pages.HomePage;
import com.automatedtest.sample.pages.LoginPage;
import com.automatedtest.sample.pages.ViewReportPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchIssueSteps {

    private WebDriver driver;
	private HomePage homePage;
	private LoginPage loginPage;
	private ViewReportPage viewReportPage;
	private BugProfilePage bugProfilePage;


	public SearchIssueSteps() {
        this.loginPage = new LoginPage();

    }
	
	@Given("^The user wants to search any issue$")
	public void theUserWantsToSearchAnyIssue() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.navigateToHomePage();

	}

	@When("^The user fills the search bar with \"([^\"]*)\"$")
	public void theUserFillsTheSearchBarWithIssuesId(String id) {
	    // Write code here that turns the phrase above into concrete actions
		this.homePage = new HomePage();

	    this.homePage.FillIssueField(id);
	    

	  //  this.homePage.FillIssueBar(id);
	//	this.vehiclePage.FillAllFields(table);
	}

	@When("clicks on Jump button")
	public void clicksOnJump() {
      this.homePage.ClickJumpBtn();
	}
	
	@When("The user clicks to access View Issues Page")
	public void theUserClicksToAccessViewIssuesPage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("verify if the issue is in the page")
	public void verifyIfTheIssueIsInThePage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The system shows the searched \"([^\"]*)\"$")
	public void theSystemShowsTheSearchedIssue(String id) {
		this.bugProfilePage = new BugProfilePage(driver);
		Assert.assertEquals(id, bugProfilePage.BugIdIssueText());	
	}
	
	@Then("The system return the message \"([^\"]*)\"$")
	public void theSystemReturnTheMessage(String message) {
		this.bugProfilePage = new BugProfilePage(driver);
		Assert.assertEquals(message, bugProfilePage.MessageErrorText());	
	}
	//messageError

}
