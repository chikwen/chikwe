package seleniumcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_cssSelector {
public static WebDriver driver;

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rediff.com");
	driver.manage().deleteAllCookies();
	driver.findElement(By.xpath("//p[@id='signin_info']/child::a[1]")).click();
	driver.findElement(By.cssSelector("form.loginform>div:nth-child(3)>div:nth-child(2)>div:nth-child(1)>div:nth-child(2)>input:nth-child(1)")).sendKeys("seleniumpanda@rediffmail.com"); 
	driver.findElement(By.xpath("//div[@class='cell']/following-sibling::div[1]/following::input[1]")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	driver.findElement(By.xpath("//ul[@class='setAccount']/preceding::a[1]")).click();
	driver.findElement(By.xpath("//div[@class='new_container']/descendant::b")).click();


	}

}
