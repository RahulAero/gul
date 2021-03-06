package org.Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomfile extends BaseC {

	public Pomfile() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement passWord;

	@FindBy(id = "login")
	private WebElement login;
	
	@FindBy(xpath ="//input[@class='input_show']")
	private WebElement afterlogin;
	
	@FindBy(xpath="//b[contains(text(),'Invalid Login')]")
	private WebElement invalidlogin;
	
	@FindBy(id="username_span")
	private WebElement Enterusername;
	
	@FindBy(css="td[class='login_title']")
	private WebElement SelectHotel;
	
	
	public WebElement getSelectHotel() {
		return SelectHotel;
	}

	public WebElement getEnterusername() {
		return Enterusername;
	}

	public WebElement getInvalidlogin() {
		return invalidlogin;
	}

	public WebElement getAfterlogin() {
		return afterlogin;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getDatepick() {
		return datepick;
	}

	public WebElement getDatepickout() {
		return datepickout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getOrderno() {
		return orderno;
	}

	public WebElement getMyitinerary() {
		return myitinerary;
	}

	public WebElement getOrderidtext() {
		return orderidtext;
	}
	

	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement roomnos;
	
	@FindBy(id="datepick_in")
    private WebElement datepick;
	
	@FindBy(id="datepick_out")
	private WebElement datepickout;
	
	@FindBy(id="adult_room")
	private WebElement adultroom;
	
	@FindBy(id="child_room")
	private WebElement childroom;
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement ccnum;
	
	@FindBy(id="book_now")
	private WebElement booknow;
	
	@FindBy(id="order_no")
	private WebElement orderno;
	
	@FindBy(id="my_itinerary")
	private WebElement myitinerary;
	
	@FindBy(id="order_id_text")
	private WebElement orderidtext;
	
	
	
	
	
	
	
	public WebElement getLocation() {
		return location;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLogin() {
		return login;
	}

}
