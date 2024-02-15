package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;


public class UjianMingguke3 {

    public static void main(String[] args) {
        String path2 = "C:\\Users\\Personal\\IdeaProjects\\SQABatchTrainingProject\\chromedriver-win64\\chromedriver.exe";
        String url = "https://shop.demoqa.com/";

        System.setProperty("webdriver.chrome.driver", path2);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        System.out.println("open web DemoQA ShopTools");

        /* Dissmiss purposes */
        WebElement Purposes = driver.findElement(By.cssSelector("body > p.woocommerce-store-notice.demo_store > a"));
        Purposes.click();

        Utils.delay(2);

        /* Masuk My Akun/Login */
        WebElement MyAccount = driver.findElement(By.cssSelector("#noo-site > header > div.noo-topbar > div > ul.pull-right.noo-topbar-right > li:nth-child(2) > a"));
        MyAccount.click();
        System.out.println("Login page");

        Utils.delay(2);

        /* Login */
        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("verdoqa");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("verdo123!");
        WebElement btnLogin = driver.findElement(By.name("login"));
        btnLogin.click();
        /* Assert validasi 1*/
        String expected = "https://shop.demoqa.com/my-account/";
        String currentUrl = driver.getCurrentUrl();
        System.out.print(currentUrl);
        if (expected.equals(currentUrl)){
            System.out.println(" Passed");
        } else {
            System.out.println("Failed");
        }
        /* Assert validasi 2 */
        String expectedTxt = "My Account";
        String heading = driver.findElement(By.className("page-title")).getText();
        if (expectedTxt.contains(heading)){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }



    }
}


// ID : verdoqa
// PW : verdo123!