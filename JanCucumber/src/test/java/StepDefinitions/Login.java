package StepDefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login{

    public static WebDriver driver;

    @Given("The user will be on the login page")
    public void the_user_will_be_on_the_login_page() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://www.whiteboxqa.com/login.php");
    }


    @When("^the user enters (.*) and (.*)$")
    public void the_user_enters_username_and_password(String name, String password) {

        driver.findElement(By.id("username")).sendKeys(name);
        driver.findElement(By.id("password")).sendKeys(password);

    }

    @And("clicks on Login button")
    public void clicks_on_login_button() {
        driver.findElement(By.id("login")).click();
    }


    @Then("the user must redirect to his homepage")
    public void the_user_must_redirect_to_his_homepage() {

        System.out.println(driver.getTitle());
        driver.close();
    }


}
