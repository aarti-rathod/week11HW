package utilityClass;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

/**
 * Created by JANVI on 13/10/2019.
 */

public class utilityClass {

    WebDriver driver;
    int dob =0;

    //----------------Test 1 -------------------//
    public utilityClass(WebDriver driver) {

        this.driver = driver;
    }

    //util click method
    public void clickOnElement(By by){
        driver.findElement(by).click();

    }

    //Assert Equals Title
    public void AssertEqul(String expTitle){

        String actualTitle=driver.getTitle();
        Assert.assertEquals("Title Doesnt's Match",expTitle,actualTitle);

    }
    //--------------------------------------//

    //-------------Test 2---------------//

    //Sendkey with Names Method
    public void sendKeys(By by,String Name){

        driver.findElement(by).sendKeys(Name);

    }


    //------select and click-----//

    public void selectAndClick(By by, String dob){

    //    driver.findElement()
        Select day = new Select(driver.findElement(by));
        day.selectByValue(dob);
    }



//----------------------
public String randomString(){
    String characters="abcdefghijklmnopqrstuvwxyz";
    String randomString = "";
    int length = 5;
    Random rand = new Random();
    char[] text = new char[length];
    for (int i = 0; i < length; i++) {
        text[i] = characters.charAt(rand.nextInt(characters.length()));
    }
    for (int i = 0; i < text.length; i++) {
        randomString += text[i];
    }
    //   System.out.println(randomString);
    return randomString;
}
    //-----------------------AssertTrue For Verify The Popup Message --------//
    public void verifyMessage(By by,String ExpTxt){

        Assert.assertEquals("The Reg Is Not Successfull",driver.findElement(by).getText(),ExpTxt);

    }
    public void threadSleep() {

        try {
            Thread.sleep(5000);
        } catch (Exception exception) {

        }
    }

}

