package week2.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

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
		//click leads
		driver.findElement(By.linkText("Leads")).click();
		//createlead
		driver.findElement(By.linkText("Create Lead")).click();
		//company name
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleafs");
		//firstname
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Hariharasudhan");
		//lastname
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Vaidyanathan");
		//title
		driver.findElement(By.xpath("//input[@name='generalProfTitle']")).sendKeys("Mr");
		//click on createlead
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String title = driver.getTitle();
		System.out.println("Title of the browser is " +title);
		driver.close();
	}

}
