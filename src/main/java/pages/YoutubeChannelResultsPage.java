package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class YoutubeChannelResultsPage {
	WebDriver driver;

	public YoutubeChannelResultsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//span[@title='Top Tracks – Dua Lipa']")
	public WebElement SearchLink;

	public void navigateToSongs() {
		SearchLink.click();
	}

}
