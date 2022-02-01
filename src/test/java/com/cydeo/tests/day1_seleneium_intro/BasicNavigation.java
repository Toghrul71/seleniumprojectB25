package com.cydeo.tests.day1_seleneium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) {
        //1- Set up the "browser driver"
        WebDriverManager.chromedriver().setup();

        //2-Create instance of the Selenium Webdriver
        // this is the line opening empty browser
        WebDriver driver=new ChromeDriver();

        //3-Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        //Stop code execution for 3 seconds
            try {
                Thread.sleep(3000);
            }catch (Exception e){

            }



        //4-use selenium to navigate back
        driver.navigate().back();

        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }

        driver.navigate().forward();

        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }
        driver.navigate().refresh();

        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }
        // Navigates browser to given websiteh
        driver.navigate().to("https://positive.news");

        String title=driver.getTitle();
        System.out.println(title);

        //String currentURL=driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());//
    }
}
