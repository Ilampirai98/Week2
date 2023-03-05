package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Account");
		driver.findElement(By.xpath("//textarea[contains(@name,'description')]")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Ilam");
		driver.findElement(By.xpath("//input[@name='officeSiteName']")).sendKeys("Siruseri");
		driver.findElement(By.xpath("//span[text()='Annual Revenue']/parent::td/following-sibling::td//input[@class='inputBox']")).sendKeys("100000");
		WebElement name = driver.findElement(By.name("industryEnumId"));
		Select drop =new Select(name);
		drop.selectByVisibleText("Computer Software");
		WebElement name1 = driver.findElement(By.name("ownershipEnumId"));
		Select drop1 =new Select(name1);
		drop1.selectByVisibleText("S-Corporation");
		WebElement name2 = driver.findElement(By.id("dataSourceId"));
		Select drop2 =new Select(name2);
		drop2.selectByVisibleText("Employee");
		WebElement name3 = driver.findElement(By.id("marketingCampaignId"));
		Select drop3 =new Select(name3);
		drop3.selectByIndex(7);
		WebElement name4 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select drop4 =new Select(name4);
		drop4.selectByVisibleText("Texas");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String tit =driver.getTitle();
		System.out.println(tit);
	}

}
