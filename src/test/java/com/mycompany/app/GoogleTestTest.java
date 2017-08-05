package com.mycompany.app;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.xpath;


public class GoogleTestTest {
    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.ie.driver", "C:\\geckodriver\\IEDriverServer.exe");
        System.setProperty("selenide.browser", "IE");

        /*System.setProperty("webdriver.chrome.driver", "C:\\geckodriver\\chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");*/
    }



    @Test
    public void name() throws Exception {

        open("http://ru.selenide.org/quick-start.html");
         // Само подождёт, пока элемент исчезнет
        $(".wrapper-color-content>h4").shouldHave(text("Начать использовать Selenide "));

    }
}