package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ATSInc {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:/Users/madhav/Desktop/DIT0001/chromedriver.exe");
		driver = new ChromeDriver(); // To Open Browser
		driver.manage().window().maximize(); // To maximize the browser
		
		//Enter URL
		driver.get("https://spec.atsspecsolutions.com/"); 
		Thread.sleep(5000);
		
		//Input User Name
		driver.findElement(By.name("username")).sendKeys("dovini5510@one-mail.top");
		Thread.sleep(1000);
		
		//Input Password
		driver.findElement(By.name("password")).sendKeys("Ats123456");
		Thread.sleep(1000);
		
		//Click Login Button
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		Thread.sleep(5000);
		
		//Click on New Project
		driver.findElement(By.xpath("//span[contains(text(),'New Project')]")).click();
		Thread.sleep(5000);
		
		//Enter Details on New Project Page
		//Internal No.
		driver.findElement(By.xpath("//*[@role=\"document\"]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div/div/div/div/div/input")).sendKeys("n/a");
		Thread.sleep(1000);
		
		//Project Name
		driver.findElement(By.xpath("//*[@role=\"document\"]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[2]/div/div/div/input")).sendKeys("ATSInc");
		Thread.sleep(1000);
		
		//Country Name
		driver.findElement(By.xpath("//*[@role=\"document\"]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[3]/div/div/div/input")).sendKeys("Canada");
		Thread.sleep(1000);
		
		//State/Province
		driver.findElement(By.xpath("//*[@role=\"document\"]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[4]/div/div/div/input")).sendKeys("Ontario");
		Thread.sleep(1000);
		
		// City
		driver.findElement(By.xpath("//*[@role=\"document\"]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[5]/div/div/div/input")).sendKeys("n/a");
		Thread.sleep(1000);
		
		//Address
		driver.findElement(By.xpath("//*[@role=\"document\"]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[6]/div/div/div/textarea")).sendKeys("n/a");
		Thread.sleep(1000);
		
		//Bid Date
		driver.findElement(By.xpath("//*[@role=\"document\"]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[7]/div/div/div/input")).sendKeys("2020-01-30");
		Thread.sleep(1000);
		
		//Area
		driver.findElement(By.xpath("//*[@role=\"document\"]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[8]/div/div/div/input")).sendKeys("100");
		Thread.sleep(1000);
		
		//Next Button
		driver.findElement(By.xpath("//*[@role=\"document\"]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/button")).click();
		Thread.sleep(1000);
		
		driver.close();
		
	}

}
