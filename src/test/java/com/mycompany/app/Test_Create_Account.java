package com.mycompany.app;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.LogEvent;
import com.codeborne.selenide.logevents.SelenideLog;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.FS_Account;
import sys.Credentials;
import sys.Load_CRM_enter_Credentials;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;

public class Test_Create_Account {

    private static final String crm_url_fs = Credentials.crm_url_fs;
    private WebDriver driver;



    @Before
    public void SetUp() throws Exception {


        System.setProperty("webdriver.chrome.driver", "C:\\geckodriver\\chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");

        Configuration.timeout = 9000;
    }

    @Test
    public void test() throws Exception {
        open(crm_url_fs);
       Load_CRM_enter_Credentials.enter_creds(Credentials.emailTrial_fs, Credentials.pASSWORD);

       Load_CRM_enter_Credentials.Sign_In_button();
       $(By.cssSelector("#TabSFA")).shouldBe(enabled).click();
       $(By.xpath(".//*[@id='nav_accts']/span[1]/span/img")).shouldBe(enabled).click();
       $(By.xpath(".//*[@id='account|NoRelationship|HomePageGrid|Mscrm.HomepageGrid.account.NewRecord']/span/a")).
               shouldBe(enabled).click(); // clicks on New button


        $("div.ms-crm-Inline-HasError:nth-child(1)").click();
        $(By.xpath(".//*[@id='header_notescontrol']/a[2]")).click();

        $(By.xpath(".//*[@id='name']/div[1]")).hover();
        $(By.xpath(".//*[@id='name']/div[1]")).click();
        System.out.println("clicked label");
        $(By.xpath(".//*[@id='name_i']")).click();
        $(By.xpath(".//*[@id='name_i']")).setValue("123");


    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(6000);


    }
}
