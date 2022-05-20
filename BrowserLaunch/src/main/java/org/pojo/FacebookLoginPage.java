package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.pom.Refresh;



public class FacebookLoginPage extends Refresh {
	
	@FindBy (id = "email")
	private WebElement username;
	@FindBys({ @FindBy (id = "pass"),@FindBy(xpath="//input[@type = password")})
	private WebElement password;
	@FindAll({@FindBy(name = "login"),@FindBy(tagname = "login")})
	private WebElement login;
	
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	

}

