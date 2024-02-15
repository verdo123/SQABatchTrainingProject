package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.security.auth.kerberos.KeyTab;

public class WebTables {

        public static void main(String[] args) {

//        String path1 = "C:\\Users\\User\\IdeaProjects\\vdsqabatch13\\chromedriver-win64\\chromedriver.exe";
            String path2 = "C:\\Users\\Personal\\IdeaProjects\\SQABatchTrainingProject\\chromedriver-win64\\chromedriver.exe";
            String url = "https://demoqa.com/webtables";

            System.setProperty("webdriver.chrome.driver", path2);
            WebDriver driver = new ChromeDriver();
//        JavascriptExecutor js = (JavascriptExecutor) driver;

            driver.get(url);
            System.out.println("open web demoqa webtables");

            driver.findElement(By.id("addNewRecordButton")).click();
            driver.findElement(By.id("firstName")).sendKeys("Verdo");
            driver.findElement(By.id("lastName")).sendKeys("Daviarta");
            driver.findElement(By.id("userEmail")).sendKeys("Daviarta@gmail.com");
            driver.findElement(By.id("age")).sendKeys("27");
            driver.findElement(By.id("salary")).sendKeys("7800000");
            driver.findElement(By.id("department")).sendKeys("SQA");

            driver.findElement(By.id("submit")).click();


            driver.findElement(By.id("searchBox")).sendKeys("verdo");
            driver.findElement(By.id("basic-addon2")).click();
            System.out.println("Finsih");


        }
}

