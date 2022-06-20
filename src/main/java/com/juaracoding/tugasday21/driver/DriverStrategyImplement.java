package com.juaracoding.tugasday21.driver;

public class DriverStrategyImplement {
	public static DriverStrategy chooseStrategy (String strategy) {
		switch (strategy) {
		case "chrome":
			return new Chrome();
		case "firefox":
			return new Firefox();
		default:
			return null;
		}
		
		
	}

}
