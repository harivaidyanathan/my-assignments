package week2.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		//createlead
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		//company name
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleafs");
		//firstname
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Hariharasudhan");
		//lastname
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Vaidyanathan");
		//firstname local
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Hari");
		//Department
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("sales");
		//Description
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("edit lead program");
		//Email
		driver.findElement(By.xpath("//input[@name='primaryEmail']")).sendKeys("haivaidyanathan@gmail.com");
		//State
		WebElement sourcestate = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		//instantiate the select class
		Select state=new Select(sourcestate);
		state.selectByVisibleText("New York");
		//click on createlead
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		//Edit
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		//clear description
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		//important note
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("filling important note");
		//update
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		//title
		String title = driver.getTitle();
		System.out.println("Title of the browser is " +title);
		driver.close();

	}

}
