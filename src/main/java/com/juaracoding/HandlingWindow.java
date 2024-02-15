package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class HandlingWindow {
    public static void main(String[] args) {
        String path2 = "C:\\Users\\Personal\\IdeaProjects\\SQABatchTrainingProject\\chromedriver-win64\\chromedriver.exe";
        String url = "https://demoqa.com/browser-windows";

        System.setProperty("webdriver.chrome.driver", path2);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        System.out.println("open web demoqa");

        WebElement btnNewTab = driver.findElement(By.xpath ("//*[@id=\"tabButton\"]"));
        btnNewTab.click();

        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1)); /*switch to new tab*/
        WebElement sampleHeading = driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
        System.out.println(sampleHeading.getText());

        driver.switchTo().window(newTab.get(0)); /*switch to parent tab*/
        WebElement mainHeading = driver.findElement(By.xpath("//*[@id=\"app\"]/header"));
        System.out.println(mainHeading.getText());

        Utils.delay(3);
        driver.quit();


    }
}


