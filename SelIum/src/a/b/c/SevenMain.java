package a.b.c;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SevenMain {

	private WebDriver driver;

	private By bankingButton = By.linkText("BANKING");
	private By searchButton = By.id("uh-search-button");

	public SevenMain(WebDriver driver) {
		this.driver = driver;

	}

	public SevenBanking navigateToBanking() {
		try {
			
			WebElement bankButton = driver.findElement(bankingButton);
			bankButton.click();
			System.out.println("bankingButton are clicked");
			return new SevenBanking(driver);
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
