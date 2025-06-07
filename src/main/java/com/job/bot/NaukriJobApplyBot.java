package com.job.bot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class NaukriJobApplyBot {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("login_Layer")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("your_email");
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("your_password");
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        Thread.sleep(5000);
        driver.quit(); // just test login for now
    }



}
