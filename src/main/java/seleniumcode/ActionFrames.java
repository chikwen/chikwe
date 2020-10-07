package seleniumcode;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ActionFrames {
public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/draggable/");
Actions actions = new Actions(driver);
WebElement source = driver.findElement(By.id("draggable"));
driver.switchTo().frame(0);
actions.dragAndDropBy(source, 40, 40).perform();
//driver.switchTo().defaultContent();

	}

}
