package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/balu/IdeaProjects/Test_QAA/web_driver/111/chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); //экземпляр класса WebDriver

        Duration duration = Duration.ofSeconds(10);
        driver.manage().timeouts().implicitlyWait(duration);

        driver.get("https://habr.ru/");

        WebElement element = driver.findElement(By.xpath("//*[@class='tm-header__become-author-btn']"));
        element.click();

        String par = element.getCssValue("display");
        System.out.println(par);
        String par2 = element.getCssValue("color");
        System.out.println(par2);

    }
}