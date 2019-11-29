import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffDemo {
	public static void main(String[] args) throws InterruptedException
	{
		//locate driver exe
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.rediff.com");
		 
		driver.findElement(By.xpath("//a[@title='Already a user? Sign in']")).click();
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("test1");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("test3");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		}
}
