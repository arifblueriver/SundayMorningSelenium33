
package com.master.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MasterPagefactory {

	
	
	@FindBy(xpath="(//*[@class='ui-button-text'])[3]")
	private WebElement myaccount;
	
	@FindBy(xpath="(//*[@name='email_address'])")
	private WebElement email;
	
	@FindBy(xpath="(//*[@name='password'])")
	private WebElement password;

	public WebElement getMyaccount() {
		return myaccount;
	}

	public void setMyaccount(WebElement myaccount) {
		this.myaccount = myaccount;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}
	
	
	
	
	
	
	
	

}
