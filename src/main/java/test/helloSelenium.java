package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class helloSelenium {
    public static void main(String[] args) {
        WebDriver driver =  new ChromeDriver();

        driver.get("https://admin-demo.nopcommerce.com/login");
        String title = driver.getTitle();

        System.out.println("Title is " +title);
        WebElement emailbox = driver.findElement(By.name("Email"));
        emailbox.clear();
        emailbox.sendKeys("admin@yourstore.com");
        WebElement passwordBox = driver.findElement(By.id("Password"));
        passwordBox.clear();
        passwordBox.sendKeys("admin");

        driver.findElement(By.cssSelector("#main > div > div > div > div.page-body > div.customer-blocks > div > form > div.buttons > button")).click();
        driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul/li[3]/a")).click();

//        driver.quit();
    }
}
