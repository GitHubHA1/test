import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create Driver Object
		
		//Chrome Driver
		//System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		//FireFox Driver
		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		//driver.get("http://www.google.com");
		driver.get("http://www.google.com");
		String Title=driver.getTitle();
		System.out.println(Title);
	//	driver.findElement(By.name("email")).sendKeys("Test");
	//	driver.findElement(By.linkText("Forgot account?")).click();
	//	driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
	//	driver.findElement(By.cssSelector("#u_0_2")).click();
		driver.findElement(By.xpath("//*[@id=\'hplogo\']")).getText();
		driver.findElement(By.cssSelector(".gLFyf")).sendKeys("test");
		driver.findElement(By.cssSelector(".FPdoLc > center:nth-child(1) > input:nth-child(1)")).click();
		/*try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	driver.quit();
	}

}
