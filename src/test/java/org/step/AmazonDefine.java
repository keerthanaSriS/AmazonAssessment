package org.step;

import java.io.IOException;

import org.lib.BaseClass;
import org.loginpom.LoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonDefine extends BaseClass {

	LoginPojo l;

	@Given("Open Amazon Link")
	public void open_Amazon_Link() {
		browserLaunch();
		launchUrl("https://www.amazon.in/");
		maxWin();
	}

	@When("Very Successful Login")
	public void very_Successful_Login() throws InterruptedException {
		l = new LoginPojo();
		btnClick(l.getSignIn());
		fill(l.getPhNum(), "916374992974");
		btnClick(l.getPhNumClick());
		Thread.sleep(2000);

		fill(l.getPassword(), "srisk@1311");
		btnClick(l.getPassClick());

		Thread.sleep(10000);

	}

	@When("Select the Mobile Accessories")
	public void select_the_Mobile_Accessories() {

		l = new LoginPojo();
		fill(l.getMobile(), "Mobile and Accessories");
		btnClick(l.getSearchBtn());
		btnClick(l.getElectronics());
		mouseHoverAction(l.getMouseHover());

	}

	@When("Select the Screen Guard")
	public void select_the_Screen_Guard() throws InterruptedException {
		Thread.sleep(5000);
	}

	@When("Select the second product in the website and add them to cart")
	public void select_the_second_product_in_the_website_and_add_them_to_cart() {
		l = new LoginPojo();
		btnClick(l.getProduct());
		btnClick(l.getAadToCart());
	}

	@When("Take the screenshot")
	public void take_the_screenshot() throws IOException {

		ScreenCatch();
	}

	@Then("Publ;ish the result as a report")
	public void publ_ish_the_result_as_a_report() {
		System.out.println("done");
	}

}
