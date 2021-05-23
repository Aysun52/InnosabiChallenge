package Innovation_challenge.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {
    @FindBy(css= ".card-topic")
    public WebElement InnovationChallengeCard;

}
