package com.maven.Homework_Maven;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AdvanceDropDown {

	@Test
	public void AdvanceDropDownTest () throws InterruptedException {
		// TODO Auto-generated method stub
		
	WebDriver driver = new ChromeDriver(); //run rime polymorphism
		
	driver.get("https://www.Amazon.co.uk");
		
	driver.manage().window().maximize(); 
		
	Thread.sleep(15000);
		
	System.out.println(driver.getTitle());
		
	WebElement dropdown = 	driver.findElement(By.id("searchDropdownBox"));
	
	Select sel = new Select(dropdown);
	
	List<WebElement> li = sel.getOptions();
	
	System.out.println(li.size());
	
	for(int i = 0 ;i<=li.size() ; i++)
	{
		li.get(i).click();
		System.out.println(li.get(i).getText());
	}
	
	driver.quit();

	}

}
