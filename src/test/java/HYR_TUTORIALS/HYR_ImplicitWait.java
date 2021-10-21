package HYR_TUTORIALS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HYR_ImplicitWait {
	WebDriver driver;
  @Test
	  public void test1() 
  {
		
	 // System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	 //driver.manage().window().maximize();
	  	WebDriverManager.chromedriver().setup(); 
	  	driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(1000,1000));
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html/");
		
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("txt1")).sendKeys("SIVA");
		
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.id("txt2")).sendKeys("Bhiswas");
		
		
  }
  
}
