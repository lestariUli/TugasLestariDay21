package com.juaracoding.tugasday21.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.tugasday21.driver.DriverSingelton;

public class Login {
	private WebDriver driver;
	public Login() {
		this.driver = DriverSingelton.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement emailLogin;
	
	@FindBy(id="passwd")
	private WebElement pwdLogin;
	
	@FindBy(id="SubmitLogin")
	private WebElement sbmtLogin;
	
	public void LoginForm(String email, String pwLogin) {
		emailLogin.sendKeys(email);
		pwdLogin.sendKeys(pwLogin);
		sbmtLogin.click();
	}

}
