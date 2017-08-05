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
import org.openqa.selenium.WebDriver;
import pageObject.FS_Account;
import sys.Credentials;
import sys.Load_CRM_enter_Credentials;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

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



    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(6000);


    }
}
