import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QA1 {

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testintertop() {
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.get("https://intertop.ua/ua/");
       driver.manage().window().maximize();
       sleep(1);
       driver.findElements(By.xpath("//span[@class='menu-item__name']")).get(3).click();
       driver.findElement(By.xpath("//a[@href='/odezhda/zhenskaya/armani-exchange/']")). click();
       driver.findElements(By.xpath("//div[@class='one-product vue-one-product']")).get(23).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("pants-armani-exchange-5749081"));
        driver.quit();
    }



    @Test
    public void testintertop2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://intertop.ua/ua/");
        driver.manage().window().maximize();
        sleep(2);
        driver.findElements(By.xpath("//span[@class='menu-item__name']")).get(7).click();
        sleep(1);
        driver.findElement(By.xpath("//span[contains(text(), 'Adidas')]")). click();
        driver.findElement(By.xpath("//div[@class='Button']")).click();
        sleep(1);
        driver.findElement(By.xpath("//span[contains(text(), 'Жіночий одяг')]")).click();
//        driver.quit();
        driver.findElement(By.xpath("//div[@class='auth-ico']")).click();
        sleep(2);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Vlad");
        sleep(1);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Kim-kim");
        sleep(1);
        driver.findElement(By.xpath("//span[@role='button']")).click();
        sleep(1);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("i.pushkarchuk@lntu.edu.ua");
        sleep(1);
        driver.findElement(By.xpath("//input[@type='phone']")).sendKeys("0501122333");
        sleep(1);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Kim-kim12345");
        sleep(1);
        driver.findElements(By.xpath("//i[@class='styled_input']")).get(2).click();
        sleep(1);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }



}

