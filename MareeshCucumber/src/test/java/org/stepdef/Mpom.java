package org.stepdef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mpom extends MareeshBase  {
	public void Mpom()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement click;
	
	
	public WebElement getUsername() {
		return username;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getClick() {
		return click;
	}
	
	
	
	
	
	
	
	
	
	

}
