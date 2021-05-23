package Innovation_challenge.Steps_Definitions;

import Innovation_challenge.Pages.LoginPage;
import Innovation_challenge.Utilities.ConfigurationReader;
import Innovation_challenge.Utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class Login {
    LoginPage loginPage =new LoginPage();

    /**
     * method to open specified url
     * @param "url" to open
     */
    //Step to navigate to specified URL
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @Given("the user enters a valid email credential")
    public void the_user_enters_a_valid_email_credential() {
        String userName = ConfigurationReader.get("user_email");
        loginPage.loginEmailCredential(userName);
    }

    @Given("the user should be able to see password screen")
    public void the_user_should_be_able_to_see_password_screen() {
        System.out.println("The user is on the password step");
        Assert.assertTrue(new LoginPage().checkPasswordScreen());

    }
    @Given("the user enters a valid required password")
    public void the_user_enters_a_valid_required_password() {
        // method to retrieve password from Configuration reader
        String userPassword = ConfigurationReader.get("user_password");
        loginPage.loginPasswordCredential(userPassword);
    }
}
