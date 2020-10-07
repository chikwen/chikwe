package seleniumcode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPractice {
public static WebDriver driver;
public static Select select;

public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@class='login']")).click();
	driver.findElement(By.cssSelector("input#email_create")).sendKeys("chikwendu10@automationpractice.com");
    driver.findElement(By.cssSelector("button#SubmitCreate")).click();
	
    driver.findElement(By.xpath("//div[@id='uniform-id_gender1']")).click();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
	driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Chikwendu");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//input[@id='customer_firstname']/following::input[1]")).sendKeys("Ten");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//input[@id='customer_firstname']/following::input[1]/following::input[2]")).sendKeys("Practice123.");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	select = new Select (driver.findElement(By.id("day")));
select.selectByVisibleText("13"); 
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	select= new Select(driver.findElement(By.id("month")));
	select.selectByVisibleText("Feb"); 
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	select= new Select(driver.findElement(By.id("year")));
	select.selectByVisibleText("1960"); 
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.cssSelector("input#firstname")).sendKeys("Ten");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	driver.findElement(By.cssSelector("input#lastname")).sendKeys("Ten");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.cssSelector("input#address1")).sendKeys("1423 Garden drive");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.cssSelector("input#city")).sendKeys("Wylie");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.cssSelector("select#id_state")).sendKeys("Texas");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.cssSelector("input#postcode")).sendKeys("75098");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.cssSelector("select#id_country")).sendKeys("USA");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.cssSelector("input#phone_mobile")).sendKeys("4692190737");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.cssSelector("input#alias")).sendKeys("Chikwe");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
	
	System.out.println("Your new Selenium Practice id is created");
	}
}