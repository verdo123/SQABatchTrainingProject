package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
IntelliJ IDEA 2023.3.2 (Ultimate Edition)
Build #IU-233.13135.103, built on December 20, 2023
@Author User a.k.a. Benidiktus Verdo
Java Developer
Created on 06/02/2024 21:19
@Last Modified 06/02/2024 21:19
Version 1.0
*/

public class RadioButton {

    public static void main(String[] args) {

        String path = "C:\\Users\\User\\IdeaProjects\\vdsqabatch13\\chromedriver-win64\\chromedriver.exe";
        String url = "https://demoqa.com/radio-button";

        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
//        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get(url);
        System.out.println("open web demoqa CheckBox");

        driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > div:nth-child(2) > label")).click();


    }
}


