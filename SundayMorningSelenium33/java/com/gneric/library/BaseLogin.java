package com.gneric.library;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.config.ObjectMap;
import com.master.pagefactory.MasterPagefactory;
import com.util.HighLighter;
import com.util.TakeScreenShot;

public class BaseLogin {
	
	
	@Test
	public void login() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	ObjectMap obj= new ObjectMap();
	driver.get(obj.getconfig("URL"));
	//driver.navigate().to("http://www.gcrit.com/build3");
	//driver.findElement(By.xpath("//*[@class='ui-button-text'])[3]")).click();
	//driver.navigate().refresh();//
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);//Gui
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//html
	
	MasterPagefactory pf =PageFactory.initElements(driver,MasterPagefactory.class);
	
	
	HighLighter.color(driver, pf.getMyaccount());
	
	
	pf.getMyaccount().click();
	
	
	
	HighLighter.color(driver, pf.getEmail());
	pf.getEmail().sendKeys(obj.getconfig("Name"));
		
	HighLighter.color(driver, pf.getPassword());
	pf.getPassword().sendKeys(obj.getconfig("Password"));
	
	
	pf.getPassword().submit();
	
	
	TakeScreenShot.captureScreenShot(driver, "GCRSHOP login page");
	driver.quit();
	//driver.close();
	
	
	

	
	
	}

	}


