package ru.yota.speed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
    System.out.println("Start");
    System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
    System.setProperty("webdriver.gecko.driver", "C:\\ChromeDriver\\geckodriver.exe");
       WebDriver driver = new FirefoxDriver();
       driver.get("https://my.yota.ru/");
       driver.findElement(By.id("authLoginText")).clear();
       driver.findElement(By.id("authLoginText")).sendKeys("tetav@mail.ru");
       driver.findElement(By.id("authPasswordLogin")).clear();
       driver.findElement(By.id("authPasswordLogin")).sendKeys("skrver5");
       driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
        WebDriverWait wait = new WebDriverWait(driver,40);
      //  wait.until(ExpectedCondition.elementToBeClickable(lastElementToLoad));
       // slide
        WebElement decrease = driver.findElement(By.className("decrease"));

        decrease.findElement(By.className("icon")).click();


       /*
        int width=slider.getSize().getWidth();
        System.out.println("int "+ width);
        Actions move = new Actions(driver);
        Action action  = move.dragAndDropBy(slider, ((width*60)/100), 0).build();
        action.perform();

       /*



        driver.quit();
        */

    }
}
