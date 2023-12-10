package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/balu/IdeaProjects/Test_QAA/web_driver/111/chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); //экземпляр класса WebDriver

        Duration duration = Duration.ofSeconds(10);
        driver.manage().timeouts().implicitlyWait(duration);

        try {
            driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
            Thread.sleep(2000);

            WebElement element1 = driver.findElement(By.id("draggable"));
            WebElement element2 = driver.findElement(By.id("droppable"));

            Actions actions = new Actions(driver);
            actions
                    .moveToElement(element1)
                    .clickAndHold()
                    .moveToElement(element2)
                    .release()
                    .build()
                    .perform();
            // либо можно всё сделать с помощью одного метода
            Thread.sleep(2000);
            actions.dragAndDropBy(element1, -150, 0).release().build().perform();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            Thread.sleep(10000);
            driver.quit();
        }



    }
}