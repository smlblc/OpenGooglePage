import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestOpenNewGooglePage {

    @Test
    void openGoogle(){
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
    }
}
