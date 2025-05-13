package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By usernameTextBox = By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div:nth-child(2) > div > div:nth-child(2) > input");
    private By passwordBox = By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div:nth-child(3) > div > div:nth-child(2) > input");
    private By loginBtn = By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsername(String username){
        driver.findElement(usernameTextBox).sendKeys(username);
    }

   public void enterPassword(String password){
        driver.findElement(passwordBox).sendKeys(password);
   }

   public void clickLogin(){
        driver.findElement(loginBtn).click();
   }


}
