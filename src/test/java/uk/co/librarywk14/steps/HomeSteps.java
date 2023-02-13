package uk.co.librarywk14.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import uk.co.librarywk14.pages.HomePage;

public class HomeSteps {
    @Given("^user on HomePage$")
    public void user_on_HomePage()  {

    }

    @When("^User accept cookies$")
    public void user_accept_cookies() throws InterruptedException {
        new HomePage().acceptCookiesandSwitchToIframe();
    }

    @And("^User enter job title \"([^\"]*)\"$")
    public void user_enter_job_title(String JobT)  {
       new  HomePage().enterJobTitle(JobT);
    }

    @And("^User enter Location \"([^\"]*)\"$")
    public void user_enter_Location(String locate)  {
        new HomePage().enterLocation(locate);
    }

    @And("^User select distance \"([^\"]*)\"$")
    public void user_select_distance(String dis)  {
        new HomePage().selectDistanceFromDropDown(dis);
    }

    @And("^User click on moreSearchOptionsLink$")
    public void user_click_on_moreSearchOptionsLink()   {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("^User enter salaryMin \"([^\"]*)\"$")
    public void user_enter_salaryMin(String min)   {
        new HomePage().enterMinSalary(min);
    }

    @And("^User enter salaryMax \"([^\"]*)\"$")
    public void user_enter_salaryMax(String max)  {
        new HomePage().enterMaxSalary(max);

    }

    @And("^User select salaryType \"([^\"]*)\"$")
    public void user_select_salaryType(String type)   {
        new HomePage().selectSalaryTypeDropDown(type);
    }

    @And("^User select jobType \"([^\"]*)\"$")
    public void user_select_jobType(String Jtype)   {
        new HomePage().selectJobTypeDropDown(Jtype);
    }

    @And("^User click on Find Jobs button$")
    public void user_click_on_Find_Jobs_button()   {
        new HomePage().clickOnFindJobs();
    }

    @Then("^User verify the result \"([^\"]*)\"$")
    public void user_verify_the_result(String mess)  {
        Assert.assertEquals(mess,new HomePage().verifyResultText(mess));


    }
}
