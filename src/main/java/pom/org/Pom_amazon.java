package pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_amazon {

    public  WebDriver driver1;
    public WebDriver driver;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]/div[1]/div[1]/img[1]")
    public WebElement elementclickmobile ;
    public WebElement clickrealme;


    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]")
    private WebElement clickRealme;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[13]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[1]")
    private WebElement scrolldown;


    public Pom_amazon() {
        this.driver1 = driver;
        PageFactory.initElements(driver1, this);
    }

    public WebElement getElementclickall() {
        return elementclickmobile;
    }

    public WebElement getClosesidebar() {
        return clickRealme;
    }

    public WebElement getScrolldown() {
        return scrolldown;
    }
}
