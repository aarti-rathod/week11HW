import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by JANVI on 13/10/2019.
 */
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class sliderAct {
    private static WebDriver driver;
    private static String baseUrl;
    public static void main(String[] args) throws InterruptedException {
       // public void setUp() throws Exception {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\JANVI\\IdeaProjects\\week11HW\\Driver\\chromedriver.exe");
            driver = new ChromeDriver();
            baseUrl = "https://jqueryui.com/slider/";

            // Maximize the browser's window
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.get(baseUrl);
            driver.switchTo().frame(0);
            Thread.sleep(3000);

            // Using the actions class
            WebElement element = driver.findElement(By.xpath("//div[@id='slider']/span"));
            Actions action = new Actions(driver);
            action.dragAndDropBy(element, 100, 0).perform();
        }

    }

