package com.juaracoding.tugasday21.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;


public class DriverSingelton {
	private static DriverSingelton instance = null;
	private static WebDriver driver;
	
	//constructor
	//kita set dimana kitaa akan pakai apakah di chrome atau firefox
	public DriverSingelton() {
		instantiate("chrome");
	}
	public WebDriver instantiate(String strategy) {
		DriverStrategy driverStrategy = DriverStrategyImplement.chooseStrategy(strategy);
		driver = driverStrategy.setStrategy();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
		
	}
	//memanggil driver singleton ketika belum di jalankan (manggil constructor)
	public static DriverSingelton getInstance() {
		if(instance == null) {
			instance = new DriverSingelton();
		}
		return instance;
	}
	//manggil si driver
	public static WebDriver getDriver() {
		return driver;
	}
}
