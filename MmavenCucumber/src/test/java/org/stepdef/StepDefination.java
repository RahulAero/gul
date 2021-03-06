package org.stepdef;

import org.Baseclass.BaseC;
import org.Baseclass.Pomfile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination extends BaseC {
	BaseC bs = new BaseC();
	Pomfile ps;
	WebDriver driver;

	@Given("user need to initiate chrome  and launch {string}")
	public void user_need_to_initiate_and_launch(String string) {
		bs.Initiate(string);

	}

	@Given("user needs to valid username {string} and valid password {string}")
	public void user_needs_to_valid_username_and_valid_password(String string, String string2) {
		ps = new Pomfile();
		bs.passText(ps.getUserName(), string);
		bs.passText(ps.getPassWord(), string2);
	}

	@Given("user need to click on login button")
	public void user_need_to_click_on_login_button() {
		ps = new Pomfile();
		bs.Click(ps.getLogin());
	}

	@Then("user validates the successful login")
	public void user_validates_the_successful_login() {
		String attrib = bs.attrib(ps.getAfterlogin(), "value");
		System.out.println(attrib);
	}

	@Given("user need to intiate chrome and launch {string}")
	public void user_need_to_intiate_and_launch(String string2) {
		bs.Initiate(string2);
	}

	@Given("user need to enter invalid username {string} and invalid password {string}")
	public void user_need_to_enter_invalid_username_and_invalid_password(String string, String string2) {
		ps = new Pomfile();
		bs.passText(ps.getUserName(), string);
		bs.passText(ps.getPassWord(), string2);
	}

	@Then("user needs to click login button")
	public void user_needs_to_click_login_button() {
		ps = new Pomfile();
		bs.Click(ps.getLogin());

	}

	@Then("user validates the error message")
	public void user_validates_the_error_message() {
		ps = new Pomfile();
		String text = ps.getInvalidlogin().getText();
		System.out.println(text);
	}

	@Given("user needs to initiate chrome and launch {string}")
	public void user_needs_to_initiate_and_launch(String string2) {
		bs.Initiate(string2);
	}

	@Given("user needs to click on login button")
	public void user_needs_to_click_on_login_button() {
		ps = new Pomfile();
		bs.Click(ps.getLogin());
	}

	@Then("user validates the warning message displayed")
	public void user_validates_the_warning_message_displayed() {
		ps = new Pomfile();
		WebElement enterusername = ps.getEnterusername();
		enterusername.getText();

	}

	@Given("user needs to enter valid username {string} and valid password {string}")
	public void user_needs_to_enter_valid_username_and_valid_password(String string, String string2) {
		ps = new Pomfile();
		bs.passText(ps.getUserName(), string);
		bs.passText(ps.getPassWord(), string2);
	}

	@Then("user validates the select Hotel pages displayed")
	public void user_validates_the_select_Hotel_pages_displayed() {
		ps = new Pomfile();
		waitFor();
		WebElement selectHotel = ps.getSelectHotel();
		selectHotel.getText();
	}

}
