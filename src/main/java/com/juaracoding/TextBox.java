package com.juaracoding;
/*
IntelliJ IDEA 2023.3.2 (Ultimate Edition)
Build #IU-233.13135.103, built on December 20, 2023
@Author User a.k.a. Benidiktus Verdo
Java Developer
Created on 06/02/2024 21:03
@Last Modified 06/02/2024 21:03
Version 1.0
*/

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {


    public static void main(String[] args) {

        String path = "C:\\Users\\User\\IdeaProjects\\vdsqabatch13\\chromedriver-win64\\chromedriver.exe";
        String url = "https://demoqa.com/text-box";

        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get(url);
        System.out.println("open web demoqa text box");

        driver.findElement(By.id("userName")).sendKeys("verdo");
        driver.findElement(By.id("userEmail")).sendKeys("verdo@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Jl.Telerama V Pasar Raya Kal-Tim");

        js.executeScript("window.scrollBy(0,1000)"); /*Scroll 1000px secara vertikal*/

        driver.findElement(By.id("permanentAddress")).sendKeys("Jl. Kebon kacang, Jakarta Pusat");
        driver.findElement(By.id("submit")).click();

    }
}

