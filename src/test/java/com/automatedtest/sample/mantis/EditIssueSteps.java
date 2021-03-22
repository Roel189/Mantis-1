package com.automatedtest.sample.mantis;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.automatedtest.sample.pages.BugProfilePage;
import com.automatedtest.sample.pages.HomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditIssueSteps {
	private HomePage homePage;
	private BugProfilePage bugProfile;
	private WebDriver driver;
	

	@When("clicks on to add notes \"([^\"]*)\"$")
	public void clicksOnToAddNotes(String note) 
	{
	  this.bugProfile = new BugProfilePage(driver);
	  bugProfile.AddNote(note);
	}
	@Then("The system shows the created notes \"([^\"]*)\"$")
	public void TheSystemShowsTheCreatedNotes(String note)
	{
		Assert.assertTrue(note, bugProfile.VerifyCreatedNote(note));	
	}
}
