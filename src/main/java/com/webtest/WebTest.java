package com.webtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");

        driver.findElement(By.id("firstname")).sendKeys("Shreyash");
        driver.findElement(By.id("surname")).sendKeys("   Vijay Gund   ");
        driver.findElement(By.id("age")).sendKeys("22");
        driver.findElement(By.id("country")).sendKeys("India");
        driver.findElement(By.id("notes")).sendKeys("I am Shreyash Vijay Gund");

        driver.findElement(By.xpath("/html/body/div/div[3]/form/input[4]")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
