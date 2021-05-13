package ru.training.at.hw3.pages;

import org.openqa.selenium.By;
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

    @FindBy(id = "frame")
    private WebElement frameElement;

    @FindBy(css = "ul.sidebar-menu.left>li")
    private List<WebElement> leftSectionElements;

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

    public WebElement getFrameElement() {
        return frameElement;
    }

    public WebElement getFrameButton() {
        driver.switchTo().frame(frameElement);
        return driver.findElement(By.id("frame-button"));
    }

    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

    public List<WebElement> getLeftSectionElements() {
        return leftSectionElements;
    }
}
