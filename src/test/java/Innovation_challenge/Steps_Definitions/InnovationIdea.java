package Innovation_challenge.Steps_Definitions;

import Innovation_challenge.Pages.DashboardPage;
import Innovation_challenge.Pages.ideaSubmissionpage;
import Innovation_challenge.Pages.innovationChallengePage;
import Innovation_challenge.Utilities.BrowserUtils;
import Innovation_challenge.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class InnovationIdea {

    DashboardPage dashboardPage = new DashboardPage();
    Innovation_challenge.Pages.innovationChallengePage innovationChallengePage = new innovationChallengePage();
    ideaSubmissionpage ideaSubmissionPage = new ideaSubmissionpage();

    @When("the user clicks on Innovation Challenge card content under Running Innovation Challenges title")
    public void the_user_clicks_on_Innovation_Challenge_card_content_under_Running_Innovation_Challenges_title() {
        //wait for click ability of the element
        BrowserUtils.waitForClickability(
                dashboardPage.InnovationChallengeCard, 10);
        dashboardPage.InnovationChallengeCard.click();

    }

    @When("the user clicks on Submit idea button on the Innovation Challenge Page")
    public void the_user_clicks_on_Submit_idea_button_on_the_Innovation_Challenge_Page() {
        BrowserUtils.waitForClickability(innovationChallengePage.SubmitIdeaButton, 10);
        innovationChallengePage.SubmitIdeaButton.click();
        BrowserUtils.waitForPageToLoad(10);
    }

    @Then("the user fills the required field and submit the idea {string} and {string}")
    public void the_user_fills_the_required_field_and_submit_the_idea_and(String title, String description) {
        BrowserUtils.waitFor(5);
        ideaSubmissionPage.IdeaTitleTextBox.sendKeys(title);
        ideaSubmissionPage.DescribeYourIdeaBox.sendKeys(description);
        ideaSubmissionPage.SubmitIdeaButton.click();
        String expectedMessage = "Your idea was successfully sumbitted";
        Assert.assertEquals("Your idea was successfully sumbitted",expectedMessage);

    }

    /**
     * method to click on an element box using javascript
     * @param comment to be added
     */
    @Then("the user adds comment {string}")
    public void the_user_adds_comment(String comment) {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView();", BrowserUtils.ScrollToElement());
        //wait for page to be loaded with all comments
        BrowserUtils.waitFor(10);
        innovationChallengePage.addComment(comment);

    }

    @Then("the user clicks on comment button")
    public void the_user_clicks_on_comment_button() {
        ideaSubmissionPage.commentButton.click();

    }
}

