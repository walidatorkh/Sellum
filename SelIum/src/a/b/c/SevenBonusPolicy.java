package a.b.c;

import org.openqa.selenium.WebDriver;

public class SevenBonusPolicy {
	
	private WebDriver driver;
	
	public SevenBonusPolicy(WebDriver driver) {
		this.setDriver(driver);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
}

