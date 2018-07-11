package configreader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPracticeTest {
	WebDriver driver;
    @Test
    public void congifReaderTest() throws InterruptedException {
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
    	String url= ConfigLoader.getMyValue("URL");
    	driver.get(url);
    	driver.findElement(By.cssSelector(".login")).click();
    	driver.findElement(By.id("email")).sendKeys(ConfigLoader.getMyValue("User"));
    	driver.findElement(By.id("passwd")).sendKeys(ConfigLoader.getMyValue("Password"));
    	driver.findElement(By.id("SubmitLogin")).click();

    	Thread.sleep(3000);
    	driver.close();
    } 
}
