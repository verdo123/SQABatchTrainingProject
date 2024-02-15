package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Collection {
    public static void main(String[] args) {
        String path2 = "C:\\Users\\Verdo Daviarta\\IdeaProjects\\SQABatchTrainingProject\\chromedriver-win64\\chromedriver.exe";
        String url = "https://www.saucedemo.com/";

        System.setProperty("webdriver.chrome.driver", path2);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        System.out.println("open web Sauce Demo");


//        Mencari jumlah object, notes mencari jumlah object menggunakan List
        List<WebElement> listTagInput = driver.findElements(By.xpath("//input"));
        System.out.println("Jumlah tag Input = "+listTagInput.size());

        List<WebElement> listFormInput = driver.findElements(By.xpath("//input[contains(@class, 'form_input')]"));
        System.out.println("Jumlah form Input = "+listFormInput.size());

//        Login
        WebElement username = driver.findElement(By.xpath("//input[@name='user-name']"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("secret_sauce");
        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();

        List<WebElement> listItemPrice = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        System.out.println("Jumlah item price = "+listItemPrice.size());

//        Looping(untuk mengambil seluruh data
        for (int i=0; i < listItemPrice.size(); i++){
            System.out.println(listItemPrice.get(i).getText());
        }

        // Logout
        WebElement btnIconMenu = driver.findElement(By.xpath("//button[contains(@id, 'menu-btn')]"));
        btnIconMenu.click();
        Utils.delay(1);
        WebElement logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
        logout.click();
        Utils.delay(1);
        WebElement userName = driver.findElement(By.xpath("//input[@name='user-name']"));
        userName.sendKeys("standard_user");
        userName.sendKeys(Keys.CONTROL+"A");
        userName.sendKeys(Keys.DELETE);

    }
}
