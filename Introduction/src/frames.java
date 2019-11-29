import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		WebElement E1=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(E1);
		System.out.println(driver.findElement(By.xpath("//div[@id='draggable']")).getText());
		WebElement Drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions s=new Actions(driver);
		s.dragAndDrop(Drag, Drop).build().perform();
	}

}
