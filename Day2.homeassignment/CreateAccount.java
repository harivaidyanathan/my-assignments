package week2.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		//password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//login
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//click CRMSFA
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		//click account
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		//click create accounts
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		//account name
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("venfield");
		//Description
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("selenium automation tester");
		//numberof employees
		driver.findElement(By.xpath("//input[@id='numberEmployees']")).sendKeys("10");
		//site name
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("LeafTaps");
		//click create account
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		String title = driver.getTitle();
		System.out.println("Title of the browser is " +title);
		driver.close();

	}

}
