package Andersen.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class SityPage {

    public SityPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;

    @FindBy(css = "[class='link geolink link_gray_yes link_geosuggest_yes']")
    private WebElement plase;

    public void clickLocationLink() {
        plase.click();
    }

    @FindBy(id = "city__front-input")
    private WebElement plaseField;

    public void clearCityField() {
        plaseField.clear();
    }

    public void input(String search) {
        plaseField.sendKeys(search);
    }

    @FindBy(css = ".popup__content li:first-child")
    private WebElement Link;

    public void clickCityLinkLondon() {
        Link.click();
    }


    @FindBy(css = ".popup__content li:first-child")
    private WebElement Link2;

    public void clickCityLinkParis() {
        Link2.click();
    }

    @FindBy(css = "[class='home-link home-link_blue_yes home-tabs__link home-tabs__more-switcher']")
    private WebElement twoLink;

    public void clickMoreLink() {
        twoLink.click();
    }

    @FindBy(css = "[class='home-tabs__more-item']")
    private List<WebElement> Top;


    @FindBy(css = "[class='home-tabs__more-item home-tabs__more-item_bottom']")
    private List<WebElement> Bottom;

    private  int quantity;

    public int numbersOfElementsLondon() {
        quantity = Bottom.size() + Top.size();
        return quantity;
    }

    public int numbersOfElementsParis() {
        quantity = Bottom.size() + Top.size();
        return quantity;
    }
}

