package a.b.c;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SevenBanking {
	private WebDriver driver;

	private By searchButton = By.id("LeftMenuBouns");
	// By searchButon = By.id("uh-search-button");

	public SevenBanking(WebDriver driver) {
		this.driver = driver;
	}

	public SevenBonusPolicy navigateToBonusPolicy() {
		try {
			WebElement bonusPolicyLink = driver.findElement(searchButton);
			bonusPolicyLink.click();
			System.out.println("Done");
			return new SevenBonusPolicy(driver);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}