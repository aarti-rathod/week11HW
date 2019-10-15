import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import utilityClass.utilityClass;

import java.lang.String;

import java.util.concurrent.TimeUnit;

/**
 * Created by JANVI on 13/10/2019.
 */

//Nopcommerce Registration

    public class RegistrationPage {

    private WebDriver driver;                      //Local variables
    private JavascriptExecutor js;
    private utilityClass utility;
    private randomEmailGenerator  uniqueEmail;

    //Private utilityClass.utilityClass util;


   //utilityClass.utilityClass util = new utilityClass.utilityClass();


    @Before
    public void setUp() {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\JANVI\\IdeaProjects\\week11HW\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        utility = new utilityClass(driver);


    }

    //Navigate to Registration Page
    @Test
    //Test 1 : Open Nop , Click Register , Verify The Page Navigate

    public void naviGatetoRegisterPage() {


        utility.clickOnElement(By.linkText("Register"));

        String expectedTitle  = "nopCommerce demo store. Register";


        utility.AssertEqul(expectedTitle);


    }

    @Test
    //Test 2
    public void fillTheDetailsForReg() throws InterruptedException {


        //1St Click On Register Button
        utility.clickOnElement(By.linkText("Register"));
       //        WebElement firstNm=driver.findElement(By.id("FirstName"));
      //        firstNm.sendKeys("pooja");

        utility.sendKeys(By.id("FirstName"),"pooja");


//        WebElement lastNm=driver.findElement(By.id("LastName"));
//        lastNm.sendKeys("Vaja");

        utility.sendKeys(By.id("LastName"),"Vaja");
        //---------------------Date Of Birth Selections----------------//

//        WebElement dayDOB = driver.findElement(By.name("DateOfBirthDay")); // step 1 : find location
//
//        Select day = new Select(dayDOB); //select class object like scanner
//
//        day.selectByValue("8");

        //-----
        utility.selectAndClick(By.name("DateOfBirthDay"),"8");
        //--------------------

////-----------Mpnth selection------------//
//        WebElement monDOB = driver.findElement(By.name("DateOfBirthMonth")); // step 1 : find location
//
//        Select mon = new Select(monDOB); //select class object like scanner //(
//
//        mon.selectByValue("8");

        utility.selectAndClick(By.name("DateOfBirthMonth"),"8");
// --------------------------------------

        //-------Year Selection-------------//
//        WebElement yrDOB = driver.findElement(By.name("DateOfBirthYear")); // step 1 : find location
//
//        Select yer = new Select(yrDOB); //select class object like scanner //(
//
//        yer.selectByValue("1991");


        utility.selectAndClick(By.name("DateOfBirthYear"),"1991");
      //--------------------------------------------------------------------//

        //System.out.println("Random Email Return String"+uniqueEmail.randomString());

        String myEmail = utility.randomString()+"@gmail.com";
   //     System.out.println(myEmail);
        utility.sendKeys(By.id("Email"),myEmail);

//        WebElement emailN=driver.findElement(By.id("Email"));
//        String abc = uniqueEmail.randomString();
//        emailN.sendKeys(uniqueEmail.randomString());




//
//        //News Letter Box Click
//        //id  = Newsletter
//        utility.clickOnElement(By.id("Newsletter"));
//
////        WebElement pwd=driver.findElement(By.id("Password"));
////        pwd.sendKeys("tulip300");
//
        utility.sendKeys(By.id("Password"),"tulip300");
//
//
////        WebElement cpwd=driver.findElement(By.id("ConfirmPassword"));
////        cpwd.sendKeys("tulip300");
        utility.sendKeys(By.id("ConfirmPassword"),"tulip300");
//
//        //register-button
//
////        WebElement reg=driver.findElement(By.id("register-button"));
////        reg.click();
//
        utility.clickOnElement(By.id("register-button"));


        utility.threadSleep();
//
//
        //Verify Text
        String ExpPopupTxt = "Your registration completed";
     //   WebElement verT = driver.findElement(By.className("result"));
        utility.verifyMessage(By.className("result"),ExpPopupTxt);

        //------

    }

    @After
    public void pullDown(){

       driver.close();

    }

    //Random Email generator
//    public String randomString(){
//        String characters="abcdefghijklmnopqrstuvwxyz";
//        String randomString = "";
//        int length = 5;
//        Random rand = new Random();
//        char[] text = new char[length];
//        for (int i = 0; i < length; i++) {
//            text[i] = characters.charAt(rand.nextInt(characters.length()));
//        }
//        for (int i = 0; i < text.length; i++) {
//            randomString += text[i];
//        }
//     //   System.out.println(randomString);
//        return randomString;
//    }



}