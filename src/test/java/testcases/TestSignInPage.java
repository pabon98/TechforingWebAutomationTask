package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SignInPage;

import java.time.Duration;

public class TestSignInPage extends BasePage {
  SignInPage signInPage = new SignInPage();

  @Test
    public void setUpClass(){
    signInPage.navigateToSignInPage();
  }
    @Test
    public void signInWithValidCredentials() {
      signInPage.writeOneElement(signInPage.email_locator, signInPage.user_email);
      signInPage.writeOneElement(signInPage.password_locator, signInPage.user_password);
      signInPage.clickOneElement(signInPage.signInBtn_locator);
      signInPage.clickOneElement(signInPage.profile_locator);
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(signInPage.userName_locator));

    }
}
