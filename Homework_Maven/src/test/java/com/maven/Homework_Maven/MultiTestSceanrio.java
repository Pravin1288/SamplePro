package com.maven.Homework_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultiTestSceanrio {

	WebDriver driver;

	@BeforeClass
	public void Initialization() throws InterruptedException {
		driver = new ChromeDriver(); // run rime polymorphism
		driver.get("https://www.Amazon.co.uk");
		driver.manage().window().maximize();
		Thread.sleep(14000);
		System.out.println(driver.getTitle());
	}

	@Test(priority = 1)
	public void SelectDropDown() throws InterruptedException {

		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select sel = new Select(dropdown);
		sel.selectByIndex(3);
		sel.selectByValue("search-alias=electronics");
		sel.selectByVisibleText("Handmade");
	}

	@Test(priority = 2)
	public void MouseHoovering() throws InterruptedException {
		
		WebElement accountlist = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		Actions act = new Actions(driver);
		act.moveToElement(accountlist).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Your Account']")).click();
	}

	@AfterClass
	public void Cleanup() {
		driver.quit();
	}
}
