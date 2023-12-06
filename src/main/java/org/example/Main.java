package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/balu/IdeaProjects/Test_QAA/web_driver/111/chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); //экземпляр класса WebDriver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("some_ID"))));

        driver.get("https://avito.ru");

        WebElement avtoRubrikatorButton = driver.findElement(By.xpath("//a[data-marker$='visual-rubricator/block-Авто']"));
        avtoRubrikatorButton.click();
        driver.close();
    }
}