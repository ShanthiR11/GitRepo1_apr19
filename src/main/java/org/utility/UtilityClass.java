package org.utility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityClass {

	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		

	}
}
