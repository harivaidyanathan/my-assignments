package week2.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AutomateFacebook {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		//create new account
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		//firstname
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hari");
		//SURNAME
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Vaidyanathan");
		//DOB
		WebElement sourceDD = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		//instantiate the select class
		Select DATE=new Select(sourceDD);
		DATE.selectByIndex(4);
		WebElement sourcemm = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		//instantiate the select class
		Select month=new Select(sourcemm);
		month.selectByIndex(5);
		WebElement sourceyy = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		//instantiate the select class
		Select year=new Select(sourceyy);
		year.selectByIndex(5);
		//gender
		driver.findElement(By.xpath("(//input[@id='sex'])[2]")).click();
		//mobilenumber
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7603876135");

	}

}
