package Innovation_challenge.Pages;

import Innovation_challenge.Utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(id="email")
    public WebElement emailTextBox;

    @FindBy(xpath="//button[@type='button']")
    public WebElement nextButton;

    @FindBy(xpath="//input[@id='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath="//button[@type='button']")
    public WebElement loginButton;

    @FindBy(xpath = "//h1")
    public WebElement title;

    public void loginEmailCredential(String user_email) {
        emailTextBox.sendKeys(user_email);
        nextButton.click();

    }

    public void loginPasswordCredential(String user_password) {
        passwordTextBox.sendKeys(user_password);
        loginButton.click();

    }

    public Boolean checkPasswordScreen(){
        BrowserUtils.waitFor(2);
        return title.getText().equals("Enter password");

    }

}

