package com.automatedtest.sample.pages;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automatedtest.sample.basepage.AbstractPage;

public class BugProfilePage  extends AbstractPage{
	
	//private WebElement bugNoteField = getDriver().findElement(By.xpath("//*[@id='bugnote_add_open']/form/table/tbody/tr[2]/td[2]/textarea"));
    //private WebElement noteText = getDriver().findElement(By.xpath("//*[@id='buglist']/tbody/tr[4]/td"));
    //private WebElement deleteNote = getDriver().findElement(By.xpath("//*[@id=\"c1024\"]/td[1]/div/form[2]/input[2]"));
    //private WebElement addNote = getDriver().findElement(By.xpath("//*[@id=\"bugnote_add_open\"]/form/table/tbody/tr[3]/td/input"));
    //private WebElement attachTagField = getDriver().findElement(By.xpath("//*[@id='tag_string']"));
    //private WebElement tags = getDriver().findElement(By.xpath("/html/body/table[3]/tbody/tr[13]/td[2]"));
    //private WebElement attachTagBtn = getDriver().findElement(By.xpath("/html/body/table[3]/tbody/tr[14]/td[2]/form/input[5]"));
	public BugProfilePage(WebDriver driver) {
		super(driver);
	}  
	    
    public String BugIdIssueText()
	{
		WebElement bugIdIssue = getDriver().findElement(By.xpath("/html/body/table[3]/tbody/tr[3]/td[1]"));
		return bugIdIssue.getText();
	}
    
    public String MessageErrorText()
	{
        WebElement messageError = getDriver().findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td/p"));
		return messageError.getText();
	}
    public void ClickAddNoteBtn()
	{
    	 WebElement addNote = getDriver().findElement(By.xpath("//*[@id='bugnote_add_open']/form/table/tbody/tr[3]/td/input"));
		 addNote.click();
	}
	public void AddNote(String note)
	{
		WebElement bugNoteField = getDriver().findElement(By.xpath("//*[@id='bugnote_add_open']/form/table/tbody/tr[2]/td[2]/textarea"));
		bugNoteField.sendKeys(note);
		ClickAddNoteBtn();
	}
	public boolean VerifyCreatedNote(String txtNote)
	{
		WebElement verifyCreatedNote = getDriver().findElement(By.xpath("//*[@id='bugnotes_open']/table/tbody"));
		//verifyCreatedNote.findElement(By.tagName("tr"));
		//List<Map<String, String>> data; 
		//List<i> itens = Arrays.asList( 11, 10, 16, 5, 85 );
       //var
		//for(verifyCreatedNote : itens){
		  //  if ( item == 16 )
		    //    System.out.println(item);
		return verifyCreatedNote.getText().contains(txtNote);

	}
	
	public void DeleteNote()
	{
		WebElement deleteNote = getDriver().findElement(By.xpath("//*[@id=\"c1024\"]/td[1]/div/form[2]/input[2]"));
		deleteNote.click();
	}
}
