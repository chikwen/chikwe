package seleniumcode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithSelect {
	public static Select select;
public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("13"); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Feb");
		
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1960");
		
	}

}
