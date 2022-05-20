package org.stepdef;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MareeshStepDef extends MareeshBase {
	MareeshBase bs = new MareeshBase();

	@Given("User should Launch the Browser and url")
	public void user_should_Launch_the_Browser_and_url() {
		
		geturl("chrome", "https://adactinhotelapp.com/");

	}

	@Given("User should give the Username and PassWord")
	public void user_should_give_the_Username_and_PassWord(io.cucumber.datatable.DataTable dataTable) {
		Mpom mp = new Mpom();
		List<String> asList = dataTable.asList();
		String string = asList.get(0);
		String string2 = asList.get(1);

		WebElement username = mp.getUsername();

		bs.typetext(username, string);
		bs.typetext(mp.getPassword(), string2);

	}

	@Then("Click on the Login")
	public void click_on_the_Login() {
		Mpom mp = new Mpom();
		mp.getClick()
		
		
		
		
	    }

	}

}
