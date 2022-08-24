package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {


	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("suhaina");
		driver.findElement(By.name("lastname")).sendKeys("haslin");
		driver.findElement(By.name("reg_email__")).sendKeys("suhaina2002");
		driver.findElement(By.id("password_step_input")).sendKeys("pa55word");
        WebElement birthday=driver.findElement(By.name("birthday_day"));
        Select dd1=new Select(birthday);
        dd1.selectByVisibleText("20");
        WebElement birthmonth=driver.findElement(By.name("birthday_month"));
        Select dd2=new Select(birthmonth);
        dd2.selectByVisibleText("may");
        WebElement birthyear=driver.findElement(By.name("birthday_year"));
        Select dd3=new Select(birthyear);
        dd3.selectByVisibleText("2002");
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.name("websubmit")).click();
	}
}
				
				
				
	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
	
		
				
		
		
		


	


