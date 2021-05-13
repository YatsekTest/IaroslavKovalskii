package ru.training.at.hw3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainJdiPage extends BasePage {

    @FindBy(css = "ul.nav > li")
    private List<WebElement> headerItems;

    @FindBy(css = "div.benefit-icon")
    private List<WebElement> imageItems;

    @FindBy(css = "span.benefit-txt")
    private List<WebElement> textItems;

    public MainJdiPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getHeaderItems() {
        return headerItems;
    }

    public List<WebElement> getImageItems() {
        return imageItems;
    }

    public List<WebElement> getTextItems() {
        return textItems;
    }
}
