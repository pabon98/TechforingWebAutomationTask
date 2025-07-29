package pages;

import org.openqa.selenium.By;

public class SignUpPage extends BasePage{
    public String signup_url = "https://career.techforing.com/auth/register";
    public By fullname_locator = By.xpath("//input[@id='fullName']");
    public By phoneNumber_locator = By.xpath("//input[@name='phone_number']");
    public By dob_locator = By.xpath("//input[@type='date']");
    public By gender_locator = By.xpath("//div[@id='gender']");
    public By gender_male_locator = By.xpath("//li[normalize-space()='Male']");
    public By email_locator = By.xpath("//input[@id='email']");
    public By password_locator = By.xpath("//input[@id='password']");
    public By confirm_password_locator = By.xpath("//input[@name='confirm_password']");
    public By captcha_input_box = By.xpath("//input[@placeholder='Enter the characters you see above']");
    public By captcha_verify_btn_locator = By.xpath("//button[normalize-space()='Verify Captcha']");
    public By signup_locator = By.xpath("//button[normalize-space()='Sign Up']");

    public void navigateToSignUpPage(){
        LoadAnWebPage(signup_url);
    }
}
