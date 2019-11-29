import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	// this is a comment
	
public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.de/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		//locate account menue
		WebElement E1=driver.findElement(By.xpath("//a[@id='nav-link-accountList']//span[@class='nav-line-2 ']"));
		a.moveToElement(E1).build().perform();
		//text box 
		WebElement E2=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		a.moveToElement(E2).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();;
}
}
