package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Lead")).click();
		driver.findElement(By.partialLinkText("Find Leads")).click();
        //driver.findElement(By.xpath("//span[text()='Phone']")).click();
        //driver.findElement(By.id("ext-gen262")).clear();
        //driver.findElement(By.id("ext-gen262")).sendKeys("91");
        //driver.findElement(By.id("ext-gen266")).sendKeys("00");
        //driver.findElement(By.id("ext-gen270")).sendKeys("9865754268");
		//driver.findElement(By.xpath("//span[text()='Email']")).click();
        //I used email id so i return two 
		//driver.findElement(By.id("ext-gen282")).sendKeys("ilampirai@tcs.com");
        //driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        //driver.findElement(By.xpath("//a[text()='15587']")).click();
        //driver.findElement(By.xpath("//a[text()='Delete']")).click();
        //driver.findElement(By.partialLinkText("Find Leads")).click();
        driver.findElement(By.xpath("(//input[@style='width: 214px;'])[1]")).sendKeys("15587");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        driver.findElement(By.xpath("//div[contains(@class,'x-grid3-hd-inner x-grid3-hd-partyId')]")).click();
        String text = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-hd-inner x-grid3-hd-partyId')]")).getText();
		System.out.println(text);
		if(text.contains("15587")) {
			System.out.println("display");
		}
		else {
			System.out.println("Not display");
			
		driver.close();
		
}
}
}


