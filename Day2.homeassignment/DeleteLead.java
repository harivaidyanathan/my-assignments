package week2.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/");
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
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		//findleads
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		//phone
		driver.findElement(By.xpath("(//span[contains(text(),'Phone')]")).click();
		//areacode
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("44");
		//number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("761386135");
		//find leads
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		//get the text
		String phonetext= driver.findElement(By.xpath("//a[@id='ext-gen966']")).getText();
		System.out.println(phonetext);
		driver.findElement(By.xpath("//a[@id='ext-gen966']")).click();
		//delete
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		//find leads again
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		//capture leadid
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(phonetext);
		//findleads search
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		// checking no records display
		String msgdisplay= driver.findElement(By.xpath("//div[@id='ext-gen437']")).getText();
		System.out.println(msgdisplay);
		
		String message ="No records to display";
		
		if(msgdisplay.equals(message) )
		{
			System.out.println("account is deleted");
		}
		else
		{
			System.out.println("account is not deleted");
		}
		String title = driver.getTitle();
		System.out.println("Title of the browser is " +title);
		driver.close();
	}

}
