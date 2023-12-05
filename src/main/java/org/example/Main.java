package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.setProperty("webdriver.chrome.driver", "/home/balu/IdeaProjects/Test_QAA/web_driver/111/chromedriver");
//        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); //экземпляр класса WebDriver

        driver.get("https://google.com");

        WebElement button_search = driver.findElement(By.xpath("//input[@value='Поиск в Google']"));
        WebElement settings_text = driver.findElement(By.xpath("//div[text()='Настройки']"));
        //button_search.click();
        settings_text.click();
        //driver.quit();
    }
}