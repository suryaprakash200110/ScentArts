package org.run;

import java.util.List;
import java.util.Map;

import org.baseandlocator.baseclass;
import org.baseandlocator.locatorpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class code extends baseclass {
	
	locatorpojo l;
	
	@Given("To launch the browser and maximise the window")
	public void to_launch_the_browser_and_maximise_the_window() {
		
		launchBrowser(); 
	}

	@When("To launch the url of scentarts application")
	public void to_launch_the_url_of_scentarts_application() {
	   geturl("https://scentarts.ae/contact-us/");
	}

	@When("To click the About us button")
	public void to_click_the_About_us_button() {
	   l = new locatorpojo();
	   l.click(l.getAu());
	}

	@When("To scroll down into “ AREAS OF SCENTING” section")
	public void to_scroll_down_into_AREAS_OF_SCENTING_section()  {
	    l = new locatorpojo();
	    l.scrolldown(l.getScroll());
	}

	@When("To click the Hotel button")
	public void to_click_the_Hotel_button()  {
		l = new locatorpojo();
		l.click(l.getHotel());
	   
	}

	@When("To click another offices button")
	public void to_click_another_offices_button(){
	   l = new locatorpojo();
	   l.click(l.getOffice());
	}

	@When("finally click the Airports button")
	public void finally_click_the_Airports_button() {
		l = new locatorpojo();
		l.click(l.getAirport());
	    
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
	   closebrowser();
	}
	
	
	
	
	
	
	
	
	@Given("To launch the firefox browser and maximise the window")
	public void to_launch_the_firefox_browser_and_maximise_the_window() {

		launchBrowserfirefox();
	 
	}

	@When("To launch url of scentarts application")
	public void to_launch_url_of_scentarts_application() {
		geturl("https://scentarts.ae/contact-us/");
	  
	}

	@When("To click the our services button")
	public void to_click_the_our_services_button() {
		
		l = new locatorpojo();
		l.click(l.getOs());
	   
	}

	@When("To scroll down into contect us section")
	public void to_scroll_down_into_contect_us_section() {
		l = new locatorpojo();
		l.scrolldown(l.getOs());
	   
	}

	@When("To click the  contect us button")
	public void to_click_the_contect_us_button() {
		l = new locatorpojo();
		l.click(l.getCu());
	   
	}

	@Then("To close the firefox browser")
	public void to_close_the_firefox_browser() {
		l.closebrowser();
	   
	}
	

	
	
	
	
	

	@Given("To launch the chrome browser and maximise the window")
	public void to_launch_the_chrome_browser_and_maximise_the_window() {
		launchBrowser();
	    
	}

	@When("To launch scentarts application url")
	public void to_launch_scentarts_application_url() {
		geturl("https://scentarts.ae/contact-us/");
	}
	
	@When("Want To click the  contect us button")
	public void want_To_click_the_contect_us_button() {
		l = new locatorpojo();
	   click(l.getCub());
	}

	@When("Scroll down to form filling section")
	public void scroll_down_to_form_filling_section() {
	 l = new locatorpojo();
	 l.scrolldown(l.getRa());
	}

	@When("To pass the name in full name text box")
	public void to_pass_the_name_in_full_name_text_box(io.cucumber.datatable.DataTable d) {
	 
	  List<String> al = d.asList();
	  l = new locatorpojo();
	  sendvalue(al.get(0), l.getFullname());
	}

	@When("To pass the company name company name")
	public void to_pass_the_company_name_company_name(io.cucumber.datatable.DataTable d) {
	  List<List<String>> al = d.asLists();
	   l = new locatorpojo();
	   sendvalue( al.get(0).get(1), l.getCompanyname());
	}

	@When("To pass the phone number in phone number text box")
	public void to_pass_the_phone_number_in_phone_number_text_box(io.cucumber.datatable.DataTable d) {
	 Map<String, String> am = d.asMap(String.class, String.class);
	   l = new locatorpojo();
	   sendvalue((String) am.get("no1"), l.getPhonenumber());
	}

	@When("To pass the valid email id in email text box")
	 public void to_pass_the_valid_email_id_in_email_text_box(io.cucumber.datatable.DataTable d) {
	 List<Map<String, String>> am = d.asMaps(String.class,String.class);
	 l= new locatorpojo();
	 sendvalue((String) am.get(0).get("email1"), l.getEmail());
	}

	@When("To pass the message in message text box")
	public void to_pass_the_message_in_message_text_box() {
		  l =new locatorpojo();
	  sendvalue("im surya", l.getMessage());
	}

	@When("To click the send button")
	public void to_click_the_send_button() {
	   l =new locatorpojo();
	   l.click(l.getSend());
	}

	@Then("To close the Chrome browser")
	public void to_close_the_Chrome_browser() {
	  l.closebrowser();
	}




	

}
