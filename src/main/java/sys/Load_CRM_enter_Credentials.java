package sys;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class Load_CRM_enter_Credentials {

    public static void enter_creds(String email, String password) throws InterruptedException {
        $(By.cssSelector("#cred_userid_inputtext")).setValue(email);
         Thread.sleep(500);
        $(By.cssSelector("#cred_password_inputtext")).shouldBe(enabled);
        $(By.cssSelector("#cred_password_inputtext")).setValue(password);

    }

    public static void Sign_In_button() {
        $(By.id("cred_sign_in_button")).shouldBe(enabled);
        $(By.id("cred_sign_in_button")).click();
    }


}
