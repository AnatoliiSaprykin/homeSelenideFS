package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FS_Account {

    WebDriver driver;
    public static WebElement element = null;


	/* Sales down-arrow button */

    public static WebElement Sales_down(WebDriver driver) {
        return driver.findElement(By.cssSelector("#TabSFA"));
    }


    public static void click_Sales_down(WebDriver driver) {

        element = Sales_down(driver);
        element.click();

        System.out.println("Sales down-arrow button");
    }

	/* Click Accounts icon */

    public static void click_Accounts(WebDriver driver) throws Exception {

        element = driver.findElement(By.xpath(".//*[@id='nav_accts']"));
        element.click();

        System.out.println("Click Accounts icon");

    }


	/*Click New  button*/

    public static WebElement new_button(WebDriver driver) {

        return driver.findElement(By.xpath("//*[@id='account|NoRelationship|HomePageGrid|Mscrm.HomepageGrid.account.NewRecord']/span"));

    }

    public static void click_new(WebDriver driver) throws Exception { //click New button
          /*  element = new_button(driver);
            Ctrl_V_class.Tab(driver);
            Wait_custom.waitForLoad(driver);


            element.sendKeys(Keys.ENTER);
            System.out.println("1 enter on New button");
            Wait_custom.waitForLoad(driver);

            Actions action = new Actions(driver);

            action.moveToElement(driver.findElement(By.xpath("//*[@id='account|NoRelationship|HomePageGrid|Mscrm.HomepageGrid.account.NewRecord']/span"))).doubleClick().build().perform(); //DOUBLECLICK
            System.out.println("2 enter on New button");

            Wait_custom.waitForLoad(driver);
            Ctrl_V_class.setClipboard_ctrl_c("1 Account nathan test");
            System.out.println("click_new + buffer" );*/

    }
	/* ==================       Robot Enter         ===================*/



	/* Account name field*/


    public static WebElement name_field(WebDriver driver) {
        return driver.findElement(By.cssSelector("#name_i"));
    }

    public static void fill_name_field(WebDriver driver) throws InterruptedException {

        //name_field(driver).click();
        //Thread.currentThread().wait(1000);


    }
}