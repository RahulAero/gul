package org.pojo;

import org.openqa.selenium.WebElement;
import org.pom.Refresh;

public class BrowserLaunch extends Refresh {

	public static void main(String[] args) {
		
  Refresh r = new Refresh();
  r.browserlaunch("https://adactinhotelapp.com/");
  FacebookLogin ff = new FacebookLogin();
  WebElement username = ff.getUsername();
  r.tk(username, "ragul");
  WebElement password = ff.getPassword();
  r.tk(password, "1234");
	 WebElement location = ff.getLocation();
	 r.dropDownSelectOption(location, "Melbourne");
	 WebElement hotel = ff.getHotel();
	 r.dropDownSelectOption(hotel, null);
	 WebElement noofrooms = ff.getNoofrooms();
	 
	 
	 
	 
	
	
	
  
  
  
		
	
		
		

	
	
	}
}
