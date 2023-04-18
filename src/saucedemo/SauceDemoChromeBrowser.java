package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoChromeBrowser {
    //Main Method
    public static void main(String[] args) {
        //Declaring variable String
        String sURL = "https://www.saucedemo.com/";
        //Chrome Browser launch in the instance of class
        WebDriver driver = new ChromeDriver();
        //Opening URL method
        driver.get(sURL);
        //After opening browser to fit the screen
        driver.manage().window().maximize();
        //Acquiring Title of the page
        //String title = driver.getTitle();
        //Print Title by directly by making above two steps redundant
        System.out.println("Print Title of Page:" + driver.getTitle());
        //Print Current URL
        System.out.println("Current URL:" + driver.getCurrentUrl());
        //Print Page Source
        System.out.println("Page Source:" + driver.getPageSource());
        //Username clicking in the field and inputting email in the field
        driver.findElement(By.name("user-name")).sendKeys("Abc@Gmail.com");
        //Username clicking in the field and inputting email in the field
        driver.findElement(By.name("password")).sendKeys("A1B2c3");
        //closing driver
        driver.close();
    }
}
