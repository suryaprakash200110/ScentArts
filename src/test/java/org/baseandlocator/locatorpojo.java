package org.baseandlocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class locatorpojo extends baseclass {
	
	public locatorpojo() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath = "//a[text()='About Us']")
	private WebElement au;
	
	@FindBy(xpath = "//h2[text()='AREAS OF SCENTING']")
	private WebElement scroll;
	
	@FindBy(xpath = "(//div[@role='button'])[2]")
	private WebElement Hotel;
	
	@FindBy(id = "elementor-tab-title-4431")
	private WebElement office;
	
	@FindBy(xpath = "(//a[@class='elementor-toggle-title'])[3]")
	private WebElement airport;

	public WebElement getAu() {
		return au;
	}

	public WebElement getScroll() {
		return scroll;
	}

	public WebElement getHotel() {
		return Hotel;
	}

	public WebElement getOffice() {
		return office;
	}

	public WebElement getAirport() {
		return airport;
	}
	
	@FindBy(xpath = "(//a[@class='elementor-item'])[4]")
	private WebElement os;
	
	@FindBy(xpath = "//span[text()='Contact Us']")
	private WebElement cu;

	public WebElement getOs() {
		return os;
	}

	public WebElement getCu() {
		return cu;
	}
	
	
	
	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement cub;
	
	@FindBy(xpath = "//h2[text()='Reach Us At']")
	private WebElement ra;
	
	@FindBy(id = "form-field-name")
	private WebElement fullname;
	
	@FindBy(name  = "form_fields[email]")
	private WebElement companyname;
	
	@FindBy(xpath = "//input[@type='tel']")
	private WebElement phonenumber;
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;
	
	@FindBy(id = "form-field-field_7094c9e")
	private WebElement message;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement send;

	public WebElement getCub() {
		return cub;
	}

	public WebElement getRa() {
		return ra;
	}

	public WebElement getFullname() {
		return fullname;
	}

	public WebElement getCompanyname() {
		return companyname;
	}

	public WebElement getPhonenumber() {
		return phonenumber;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getMessage() {
		return message;
	}

	public WebElement getSend() {
		return send;
	}
	
	
	
	

}
