package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuActions {
    public static void main(String[] args) {
        String path2 = "C:\\Users\\Verdo Daviarta\\IdeaProjects\\SQABatchTrainingProject\\chromedriver-win64\\chromedriver.exe";
        String url = "https://demoqa.com/menu";

        System.setProperty("webdriver.chrome.driver", path2);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

//        Hover Mouse
        WebElement hoverMouse = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverMouse).perform();

        WebElement subMenu2 = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[2]/a"));
        subMenu2.click();
        System.out.println("berhasil click hover menu");

        Utils.delay(3);

    }
}
