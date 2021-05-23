package Innovation_challenge.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ideaSubmissionpage extends BasePage {

        @FindBy(xpath = "//button[.='Submit idea']")
        public WebElement SubmitIdeaButton;

        @FindBy(xpath = "//input[@type='text']")
        public WebElement IdeaTitleTextBox;

        @FindBy(xpath = "//textarea[contains(@rows,'2')]")
        public WebElement DescribeYourIdeaBox;

        @FindBy(xpath = "//button[@class='btn-send ng-star-inserted']")
        public WebElement commentButton;
}