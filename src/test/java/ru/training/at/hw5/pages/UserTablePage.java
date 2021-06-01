package ru.training.at.hw5.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class UserTablePage extends BasePage {

    @FindBy(xpath = "//a[contains(text(), 'Service')]")
    private WebElement serviceElement;

    @FindBy(xpath = "//a[contains(text(), 'User Table')]")
    private WebElement userTablePageElement;

    @FindBy(css = "table[id='user-table'] select")
    private List<WebElement> dropdowns;

    @FindBy(css = "td>a")
    private List<WebElement> userNames;

    @FindBy(css = ".user-descr > span")
    private List<WebElement> descriptions;

    @FindBy(css = "input[type='checkbox']")
    private List<WebElement> checkboxes;

    @FindBy(css = "tr>td:nth-child(1)")
    private List<WebElement> numbers;

    @FindBy(css = "select > option")
    private List<WebElement> dropdownOptions;

    @FindBy(id = "ivan")
    private WebElement vipCheckboxSergeyIvan;

    @FindBy(css = "ul.panel-body-list.logs")
    private WebElement logRow;

    public UserTablePage(WebDriver driver) {
        super(driver);
    }

    public String getNumbersText(int i) {
        return numbers.get(i).getText();
    }

    public String getUserNameText(int i) {
        return userNames.get(i).getText();
    }

    public String getDescriptionsText(int i) {
        return descriptions.get(i).getText().replace("\n", " ");
    }

    public String getDropdownOptionText(int i) {
        return dropdownOptions.get(i).getText();
    }

}
