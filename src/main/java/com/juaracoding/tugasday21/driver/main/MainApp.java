package com.juaracoding.tugasday21.driver.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.tugasday21.driver.DriverSingelton;
import com.juaracoding.tugasday21.pages.Login;
import com.juaracoding.tugasday21.pages.Registrations;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = DriverSingelton.getInstance().getDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		Login login = new Login();
		login.LoginForm("lestari@gmail.com", "taricantik21");
		Registrations regis = new Registrations();
		regis.registrationsForm("tariUli20@gmail.com");
		regis.Authentication("TARI ULI", "CUTE", "taricute", "BVT", "Jln.BSD", "Foresta 3", "Tangerang", "78002","APA SIH YA BGUNG", "0822667947", "082356789900", "GATAU SUER");

	}
	

}
