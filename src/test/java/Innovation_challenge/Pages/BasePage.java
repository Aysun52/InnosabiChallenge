package Innovation_challenge.Pages;


import Innovation_challenge.Utilities.Driver;
import org.openqa.selenium.support.PageFactory;
public abstract class BasePage {
    public BasePage() {

        PageFactory.initElements(Driver.get(), this);
    }

}
