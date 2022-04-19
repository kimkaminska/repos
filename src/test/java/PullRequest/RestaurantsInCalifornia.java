package PullRequest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RestaurantsInCalifornia {

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void checkRestaurantsInCalifornia () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://eatstreet.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[text()= 'Got it']")).click();
        driver.findElement(By.xpath("//label[@for='home-checkbox-takeout']")).click();
        driver.findElement(By.xpath("//input[@id='input-food-search']")).sendKeys("California");
        sleep(3);
        driver.findElement(By.xpath("//li[@val='California, USA']")).click();
        sleep(3);
        Assert.assertTrue(driver.findElement(By.xpath("//p[text()= 'No available restaurants']")).isDisplayed());
        driver.quit();
    }

    @Test
    public void CheckTheCart () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://eatstreet.com/");
        driver.manage().window().maximize();
        driver.findElements(By.xpath("//div[@class='navbar__icon']")).get(1).click();
        Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Your Cart is Empty']")).isDisplayed());
        driver.quit();
    }

}
