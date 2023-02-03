package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class General extends Global{
//To provide all re-usable fun:/methods related to whole application
	public void   openApplication() 
	{
	System.setProperty("webdriver.gecko.driver","E:\\chrome driver\\firefoxdriver\\geckodriver.exe");
	driver=new FirefoxDriver(); 
	driver.navigate().to(Url);
	System.out.println("Application Opened");
	
	}
	public void closeApplication()
	{
		driver.close();
		System.out.println("application Closed");
	}
	public void login()
	{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
	    driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login ");
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logoutcompleted");
	}
	public void enterFrame() {
		 driver.switchTo().frame(frame_empinfo);
		 System.out.println("Entered Frame");
	}
	public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("exit from frame");
	}
	public void addNewEmp() {
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_EFN)).sendKeys(EFN);
		driver.findElement(By.name(txt_ELN)).sendKeys(ELN);
		driver.findElement(By.id(btn_Save)).click();
		System.out.println("NewEmpAdded");
	}   
	 
	 }
	

		
	
	

