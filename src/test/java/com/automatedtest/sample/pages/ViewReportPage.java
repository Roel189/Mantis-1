package com.automatedtest.sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automatedtest.sample.basepage.AbstractPage;

public class ViewReportPage extends AbstractPage{
	public ViewReportPage(WebDriver driver) {
		super(driver);
	}

	private WebElement searchIssueViewRepBar = getDriver().findElement(By.xpath("//*[@id='filters_form_open']/table/tbody/tr[11]/td[1]/input[1]"));
	private WebElement idIssue = getDriver().findElement(By.xpath("//*[@id='buglist']/tbody/tr[4]/td[4]/a"));
	
	
    //public String TagsText()
    //{
	  // return tags.getText() ;
    //}
	public String IdIssueText()
	{
		return idIssue.getText();
	}
	public void ClicksOnFilterButton()
	{
		WebElement filterBtn = getDriver().findElement(By.xpath("//*[@id='filters_form_open']/table/tbody/tr[11]/td[1]/input[2]"));
		filterBtn.click();
	}
	public void ClickAddNoteBtn()
	{
		//addNote.click();
	}
	public void AddNote(String note)
	{
		//bugNoteField.sendKeys(note);
		ClickAddNoteBtn();
	}
	public void FilterBar(String id)
	{
		WebElement searchIssueViewRepBar = getDriver().findElement(By.xpath("//*[@id='filters_form_open']/table/tbody/tr[11]/td[1]/input[1]"));
		searchIssueViewRepBar.sendKeys(id);
		
	}
	public void AddTags(String tag)
	{
		//attachTagField.sendKeys("tag");
	}
	public String CaptureIdIssueText()
	{
		WebElement issueId = getDriver().findElement(By.xpath("//*[@id='buglist']/tbody/tr[4]/td"));
		return issueId.getText();
	}
}
