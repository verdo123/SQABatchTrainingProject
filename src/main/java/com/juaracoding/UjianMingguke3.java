package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.util.ArrayList;


public class UjianMingguke3 {

    public static void main(String[] args) {
        String path2 = "C:\\Users\\Verdo Daviarta\\IdeaProjects\\SQABatchTrainingProject\\chromedriver-win64\\chromedriver.exe";
        String url = "https://shop.demoqa.com/";

        System.setProperty("webdriver.chrome.driver", path2);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
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
        String expectedTxt = "Tools";
        String heading = driver.findElement(By.xpath("//Div[@class='navbar-logo']")).getText();
        if (expectedTxt.contains(heading)){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        /* Add to Chart */
        WebElement home = driver.findElement(By.xpath("//*[@id=\"noo-site\"]/header/div[2]/div/div/div/div/a"));
        home.click();
        System.out.println("Masuk Kehalaman belanja");

        /*Scroll 2000px secara vertikal*/
        js.executeScript("window.scrollBy(0,2000)");

        Utils.delay(5);

        WebElement productTokyoTalkies = driver.findElement(By.xpath("//a[normalize-space()='Tokyo Talkies']"));
        productTokyoTalkies.click();
        System.out.println("Tokyo Talkies terpilih");

        /*Scroll 2000px secara vertikal*/
        js.executeScript("window.scrollBy(0,1000)");

        WebElement addChart = driver.findElement((By.xpath("//*[@id=\"product-704\"]/div[1]/div[2]/form/div/div[2]/button")));
        addChart.click();

        String hasBeenAddedCart = "Tokyo Talkies";
        String Cart = driver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div/div/div[1]/div/div")).getText();
        if (expectedTxt.contains(Cart)){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }


    }
}


// ID : verdoqa
// PW : verdo123!