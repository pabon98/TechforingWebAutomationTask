package testcases;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SignUpPage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class TestSignUpPage extends BasePage {
    SignUpPage signUpPage = new SignUpPage();

    @Test
    public void loadSignUpPage(){
        signUpPage.navigateToSignUpPage();
    }
    @Test
    public void signUpWithValidCredentials() throws IOException, TesseractException, InterruptedException {
        signUpPage.writeOneElement(signUpPage.fullname_locator,"John Alex");
        signUpPage.writeOneElement(signUpPage.phoneNumber_locator, "1234567890");

        // Generate a random date between 1980 and 2005
        Random random = new Random();
        int startYear = 1980;
        int endYear = 2005;
        int year = random.nextInt(endYear - startYear + 1) + startYear;
        int month = random.nextInt(12) + 1;
        int day = random.nextInt(28) + 1;  // Safe for all months

        LocalDate randomDate = LocalDate.of(year, month, day);
        String formattedDate = randomDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Thread.sleep(2000);

        // Input the random date
        //dateInput.sendKeys(formattedDate);
        signUpPage.writeOneElement(signUpPage.dob_locator, formattedDate);

        // select Gender
        signUpPage.clickOneElement(signUpPage.gender_locator);

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement maleOption = wait.until(ExpectedConditions.visibilityOfElementLocated(signUpPage.gender_male_locator));
        maleOption.click();
        signUpPage.writeOneElement(signUpPage.email_locator, "naviyab@def.com");
        signUpPage.writeOneElement(signUpPage.password_locator, "Naviyab677");
        signUpPage.writeOneElement(signUpPage.confirm_password_locator, "Naviyab677");
        Thread.sleep(10000);
        signUpPage.clickOneElement(signUpPage.captcha_verify_btn_locator);
        Thread.sleep(3000);
        if (signUpPage.getElement(signUpPage.signup_locator).isEnabled()){
            signUpPage.clickOneElement(signUpPage.signup_locator);
        }
        Thread.sleep(3000);

    }
}
