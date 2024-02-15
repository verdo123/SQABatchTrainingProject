package com.juaracoding;
/*
IntelliJ IDEA 2023.3.2 (Ultimate Edition)
Build #IU-233.13135.103, built on December 20, 2023
@Author User a.k.a. Benidiktus Verdo
Java Developer
Created on 06/02/2024 21:04
@Last Modified 06/02/2024 21:04
Version 1.0
*/

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {


    public static void main(String[] args) {

//        String path1 = "C:\\Users\\User\\IdeaProjects\\vdsqabatch13\\chromedriver-win64\\chromedriver.exe";
        String path2 = "C:\\Users\\Personal\\IdeaProjects\\SQABatchTrainingProject\\chromedriver-win64\\chromedriver.exe";
        String url = "https://demoqa.com/checkbox";

        System.setProperty("webdriver.chrome.driver", path2);
        WebDriver driver = new ChromeDriver();
//        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get(url);
        System.out.println("open web demoqa CheckBox");

        driver.findElement(By.cssSelector("#tree-node > ol > li > span > label")).click();
        System.out.println("Finsih");


    }
}
