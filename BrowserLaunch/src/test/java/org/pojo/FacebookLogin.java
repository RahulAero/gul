package org.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.pom.Refresh;

import com.github.dockerjava.api.model.Driver;

public class FacebookLogin extends Refresh {
	

	public FacebookLogin() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id = "login")
	private WebElement login;
	@FindBy ( id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement Hotel;
	@FindBy(id="room_type")
	private WebElement RoomType;
	@FindBy(id="room_nos")
	private WebElement Noofrooms;
	@FindBy(id="datepick_in")
	private WebElement Checkin;
	@FindBy(id="datepick_out")
	private WebElement checkout;
	@FindBy(id="adult_room")
	private WebElement Adults;
	@FindBy(id="child_room")
	private WebElement Childrens;
	
		
	
	
	

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return Hotel;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getNoofrooms() {
		return Noofrooms;
	}

	public WebElement getCheckin() {
		return Checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdults() {
		return Adults;
	}

	public WebElement getChildrens() {
		return Childrens;
	}

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
