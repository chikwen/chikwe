package seleniumcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetLinkText {
public static WebDriver driver;
	public static void main(String[] args, WebElement source) {
		
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://rediffmail.com");
Actions actions=new Actions (driver);
//WebElement source=driver.findElement(By.id("draggable"));
driver.switchTo().frame(0);
//actions.dragAndDropBy(source, 40, 40).perform();
driver.switchTo().defaultContent();
WebElement createaccountlink = driver.findElement(By.cssSelector("p#signin_info>a:nth-of-type(2)"));
System.out.println("the text of this link is :" + createaccountlink.getText());

//WebElement shoppinglink = driver.findElement(By.xpath("//a[@class='vdicon']/following-sibling::a[1]"));
//System.out.println("the text of this link is :" + shoppinglink.getText());
	}

}
 