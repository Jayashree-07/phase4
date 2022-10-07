package Assisted_selenium_projects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automate_a_web_App {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Step 1: load the chrome driver
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://demo.guru99.com/test/newtours/register.php");	
			
			driver.manage().window().maximize();
			Thread.sleep(1000);
			System.out.println("Title:"+driver.getTitle());
			
			System.out.println("------------------------");
			
			
			//entering the first name
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Jayashree");
			Thread.sleep(1000);
			//entering the last name
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Baskaran");Thread.sleep(1000);
			//entering the phone number
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("637495605");Thread.sleep(1000);
			//entering the email id
			WebElement email=driver.findElement(By.id("userName"));
			email.sendKeys("jay.bas@gmail.com");
			Thread.sleep(1000);
			//entering the address
			driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Ecr Neelangarai");Thread.sleep(1000);
			//entering the city
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Chennai");Thread.sleep(1000);
			//entering the state
			driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Tamilnadu");Thread.sleep(1000);
			//entering the postal code
			driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("600115");Thread.sleep(1000);
			//selecting the country from dropdown list
			Select drpCountry = new Select(driver.findElement(By.name("country")));
			drpCountry.selectByVisibleText("INDIA");
			Thread.sleep(1000);
			//entering the username
			WebElement user=driver.findElement(By.id("email"));
			user.sendKeys("jay.bas@gmail.com");
			Thread.sleep(1000);
			//entering the password
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rk92bp13");Thread.sleep(1000);
			//re-enter the password
			driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Rk92bp13");Thread.sleep(1000);
			//submit
			driver.findElement(By.xpath("//input[@name='submit']")).click();
			Thread.sleep(1000);
			
			
			//-----------------SIGN IN PAGE--------------------//
			
			driver.get("https://demo.guru99.com/test/newtours/login.php");
			driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("jay.bas@gmail.com");Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rk92bp13");Thread.sleep(20000);
			driver.findElement(By.xpath("//input[@name='submit']")).click();
			Thread.sleep(10000);
			
			System.out.println("Testing done successfully");
			Thread.sleep(10000);
			driver.quit();
	}

}

