package step.org;

import base.org.Base_amazon;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pom.org.Pom_amazon;
import runner.org.Runner_amazon;

public class Stepdef_amazon extends Base_amazon {
    public WebDriver driver;
    public  static  WebDriver driver1 = Runner_amazon.driver;
    public static Pom_amazon amazon =new Pom_amazon();




    @Given("to get the url")
    public void to_get_the_url() {
  url(driver1,"https://www.flipkart.com/");
  max(driver1);



    }
    @When("user check the home page and click")
    public void user_check_the_home_page_and_click() {
      Click(amazon.elementclickmobile);
      Click(amazon.clickrealme);



    }
    @Then("logout from the page")
    public void logout_from_the_page() {
scrolldown(driver1, amazon.getScrolldown());

    }

}
