package rozklad_pkp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rozklad_pkp.utilities.Driver;

import java.util.List;

public class TimetablePage {

    // Web elements

    @FindBy(xpath = "//button[text()='ZGADZAM SIĘ']")
    public WebElement acceptButton;

    @FindBy(xpath = "//input[@id='from-station']")
    public WebElement fromInputbox;

    @FindBy(xpath = "//input[@id='to-station']")
    public WebElement toInputbox;

    @FindBy(xpath = "//div[@class='data-filed']")
    public WebElement selectDateTable;

    @FindBy(xpath = "//td[@data-handler='selectDay']")
    public List<WebElement> expectedDay;

    @FindBy(xpath = "//span[@class='ui-datepicker-month']")
    public WebElement expectedMonth;

    @FindBy(xpath = "//span[@class='ui-datepicker-year']")
    public WebElement expectedYear;

    @FindBy(xpath = "//span[@class='ui-datepicker-month']")
    public WebElement actualMonth;

    @FindBy(xpath = "//span[@class='ui-datepicker-year']")
    public WebElement actualYear;

    @FindBy(xpath = "//a[.='Prev']")
    public WebElement previous;

    @FindBy(xpath = "//a[.='Next']")
    public WebElement next;

    @FindBy(xpath = "//button[@class='btn btn-default pick-date']")
    public WebElement selectDateButton;

    @FindBy(id = "singlebutton")
    public WebElement searchButton;







    public TimetablePage() {
        PageFactory.initElements(Driver.get(),this);
    }


}
