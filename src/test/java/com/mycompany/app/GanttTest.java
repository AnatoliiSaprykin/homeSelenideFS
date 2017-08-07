package com.mycompany.app;

import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import sys.Credentials;
import sys.Load_CRM_enter_Credentials;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GanttTest {
    private static final String crm_url_fs = Credentials.crm_url_fs;

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
        $(By.cssSelector("#TabSFA")).shouldBe(enabled).click(); //Clicked Sales arrow
        $(By.xpath(".//*[@id='proRM']/span[2]")).shouldBe(enabled).click(); // clicked on Project Service
        $(By.xpath(".//*[@id='prorm_gantt']")).shouldBe(enabled).click(); // Clicked on Gantt




    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(6000);


    }
}
