package com.juaracoding.tugasday21.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.tugasday21.driver.DriverSingelton;

public class Registrations {
	private WebDriver driver;
	public Registrations() {
		this.driver = DriverSingelton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//locator registrationsForm
	@FindBy(id="email_create")
	private WebElement emailAddress;
	
	@FindBy(id = "SubmitCreate")
	private WebElement btnCreate;
	
	
	public void registrationsForm(String email) {
		emailAddress.sendKeys(email);
		btnCreate.click();
	}
	
	//locator authentication
	@FindBy(id = "uniform-id_gender2")
	private WebElement title;
	@FindBy(id = "customer_firstname")
	private WebElement firstNameAuth;
	@FindBy (id = "customer_lastname")
	private WebElement lastNameAuth;
	@FindBy (id = "passwd")
	private WebElement passwd;
	@FindBy (id="days")
	private WebElement tgl;
	@FindBy (id="months")
	private WebElement bln;
	@FindBy (id="years")
	private WebElement tahun;
	@FindBy(id="newsletter")
	private WebElement check1;
	@FindBy(id="optin")
	private WebElement check2;
	@FindBy(id="firstname")
	private WebElement company;
	@FindBy (id="address1")
	private WebElement addressComp;
	@FindBy (id="address2")
	private WebElement address2;
	@FindBy (id="city")
	private WebElement kota;
	@FindBy (id="id_state")
	private WebElement state; 
	@FindBy (id="postcode")
	private WebElement zipcode;
	@FindBy (id="other")
	private WebElement addInformation;
	@FindBy (id="phone")
	private WebElement phoneNumber;
	@FindBy (id="phone_mobile")
	private WebElement phoneMobile;
	@FindBy (id="alias")
	private WebElement alias;
	@FindBy (id="submitAccount")
	private WebElement btnSbmt;
	
	public static Select select(WebElement param) {
		Select var = new Select(param);
		return var;
	}
	
	public void Authentication(String fr, String ln, String pw, String cmpy, String addCmpy, String Add2, String cty, String kode, String addIn, String ph, String pm, String al) {
		title.click();
		firstNameAuth.sendKeys(fr);
		lastNameAuth.sendKeys(ln);
		passwd.sendKeys(pw);
		select(tgl).selectByValue("28");
		select(bln).selectByValue("7");
		select(tahun).selectByValue("2000");
		check1.click();
		check2.click();
		company.sendKeys(cmpy);
		addressComp.sendKeys(addCmpy);
		address2.sendKeys(Add2);
		kota.sendKeys(cty);
		select(state).selectByValue("32");
		zipcode.sendKeys(kode);
		addInformation.sendKeys(addIn);
		phoneNumber.sendKeys(ph);
		phoneMobile.sendKeys(pm);
		alias.sendKeys(al);
		btnSbmt.click();
	}

//	private void scroll (WebDriver driver) {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("scrollBy(0, 2000)");
//	}
	
}
