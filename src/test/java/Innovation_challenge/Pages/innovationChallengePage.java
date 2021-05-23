package Innovation_challenge.Pages;

import Innovation_challenge.Utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class innovationChallengePage extends BasePage {

    @FindBy(xpath = "//button[.='Submit idea']")
    public WebElement SubmitIdeaButton;

    @FindBy(xpath = "//div[@class='action-btns']")
    public List<WebElement> submitCommentList;

    @FindBy(xpath = "//textarea")
    public List<WebElement> commentList;

    /**
     * method to get
     * @param comment to be added
     */
    public void addComment(String comment) {
        commentList.get(commentList.size() - 1).sendKeys(comment);
        BrowserUtils.waitForClickability(submitCommentList.get(submitCommentList.size() - 1), 5);
        submitCommentList.get(submitCommentList.size() - 1).click();

    }}
