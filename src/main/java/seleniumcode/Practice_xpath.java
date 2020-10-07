package seleniumcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_xpath {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rediff.com");
		driver.findElement(By.xpath("//p[@id='signin_info']/child::a[1]")).click();
		driver.findElement(By.xpath("//div[@class='cell']/descendant::input[3]")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//div[@class='cell']/following-sibling::div[1]/following::input[1]")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//div[@class='cell']/following-sibling::div[1]/following::input[2]")).click();
		driver.findElement(By.xpath("//ul[@class='setAccount']/preceding::a[1]")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='new_container']/descendant::b")).click();
						
				
	
	}

}
