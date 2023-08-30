package base.org;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base_amazon {
    //public WebDriver driver;
    public static void url(WebDriver driver, String s) {

        driver.get(s);
    }
    public static void max(WebDriver driver) {
        driver.manage().window().maximize();

    }
    public static void Click(WebElement element) {
        element.click();
    }
    public static void scrolldown(WebDriver driver,WebElement webele) {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView()",webele);


    }

}
