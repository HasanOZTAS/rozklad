package rozklad_pkp.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import rozklad_pkp.pages.TimetablePage;
import rozklad_pkp.utilities.BrowserUtils;
import rozklad_pkp.utilities.ConfigurationReader;
import rozklad_pkp.utilities.Driver;


public class Timetable {


    @Given("the user on the search timetable page")
    public void the_user_on_the_search_timetable_page() {

        Driver.get().get(ConfigurationReader.get("url"));

        new TimetablePage().acceptButton.click();

    }

    @When("the user enters the stations {string} {string}")
    public void the_user_enters_the_stations(String from, String to) {

        new TimetablePage().fromInputbox.sendKeys(from);
        BrowserUtils.waitFor(1);

        new TimetablePage().toInputbox.sendKeys(to);
        BrowserUtils.waitFor(1);
    }


    @When("the user enters {string} {string} {string}")
    public void the_user_enters(String expectedDay, String expectedMonth, String expectedYear) throws InterruptedException {

        new TimetablePage().selectDateTable.click();

        String actualMonth = new TimetablePage().actualMonth.getText();
        String actualYear = new TimetablePage().actualYear.getText();

        while ((!actualMonth.equals(expectedMonth)) || (!actualYear.equals(expectedYear))) {
            new TimetablePage().previous.click();

            Thread.sleep(200);

            actualMonth = new TimetablePage().actualMonth.getText();
            actualYear = new TimetablePage().actualYear.getText();

        }
        new TimetablePage().selectDateButton.click();

    }

    @Then("the user clicks on SEARCH CONNECTION")
    public void the_user_clicks_on_SEARCH_CONNECTION() {

        BrowserUtils.scrollToElement(new TimetablePage().searchButton);

        new TimetablePage().searchButton.click();

    }



}
