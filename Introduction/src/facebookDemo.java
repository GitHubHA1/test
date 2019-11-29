import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebookDemo {
	
public static void main(String[] args) throws InterruptedException
{
	//locate driver exe
	//System.setProperty("webdriver.gecko.driver","C:\\work\\geckodriver.exe");
	//create Driver
	//WebDriver driver=new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	  Thread.sleep(3000);
	     //Xpath Syntax //Tagname[@attribute='value']
	//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test1");
	//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("test2");
	// Thread.sleep(2000);
	//driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
	
	//Css Tagname[attribute='value']
	
	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("test1");
	driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("test2");
	 Thread.sleep(2000);
	driver.findElement(By.cssSelector("*[value='Log In']")).click();
	
	//driver.quit();
	
	
	
	
	}
}
