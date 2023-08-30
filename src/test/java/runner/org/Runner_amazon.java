package runner.org;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/features/amazon.feature" ,glue = "step.org")
public class Runner_amazon {
    public static WebDriver driver;

    @BeforeClass

    public static void start() {
        driver = new ChromeDriver();
    }


    //WebDriver driver =new ChromeDriver();


}
