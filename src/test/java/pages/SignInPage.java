package pages;

import org.openqa.selenium.By;

public class SignInPage extends BasePage{
    public String signin_url = "https://career.techforing.com/auth";
    public String user_email = "naviyab677@7tul.com";
    public String user_password = "Naviyab677";
    public By email_locator = By.xpath("//input[@id='email']");
    public By password_locator = By.xpath("//input[@id='password']");
    public By signInBtn_locator = By.xpath("//button[normalize-space()='Sign In']");
    public By userName_locator = By.xpath("//div[@id='primary-search-account-menu']//h4[@class='MuiTypography-root MuiTypography-body1 css-1ksxsqr'][normalize-space()='Navi Yakub']");
    public String userName = "Navi Yakub";
    public By profile_locator = By.xpath("//button[@aria-label='account of current user']//*[name()='svg']");

    public void navigateToSignInPage(){
      LoadAnWebPage(signin_url);
    }


}
