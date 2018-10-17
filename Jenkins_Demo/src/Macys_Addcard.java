import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Macys_Addcard {

	WebDriver driver;
	@Test
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nisum\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.macys.com/account/profile");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		System.out.println("Macys application opened ");
		
		List<WebElement> elements=driver.findElements(By.xpath("//*[@id='month']//option"));
		
		
		
		for(WebElement element:elements)
		{
			String text=element.getText();
			
			if(text.equals("May"))
		 {
			element.click();
			break;
		 }

				
			}
		
		driver.close();
	}

}
