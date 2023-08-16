package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiscoverHomePage {

    public DiscoverHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "li[data-target='1']")
    public WebElement creditCardsIcon;

    @FindBy(className = "cash-rate")
    public WebElement aprRate;

    @FindBy(xpath = "(//span[@class='cmp-button__text'])[18]")
    public WebElement applyNow;

    @FindBy(id = "adaptive-skip-this-step")
    public WebElement skipThisTestLink;

}
