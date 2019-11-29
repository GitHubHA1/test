import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	
	public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		WebElement source=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s=new Select(source);
		s.selectByIndex(2);
		//System.out.println(s.)
		//s.deselectByVisibleText("AED");
		// s=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	//	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	//	driver.findElement(By.xpath("//a[@value='KNU']")).click();
	//	Thread.sleep(2000);
	//	driver.findElement(By.xpath("(//a[@value='JLR'])[2]")).click();
	}
}
