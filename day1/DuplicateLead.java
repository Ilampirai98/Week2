package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ilampirai");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Zahir Hussain");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ilam");
		driver.findElement(By.name("departmentName")).sendKeys("Non IT");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ilampirai@tcs.com");
		driver.findElement(By.name("submitButton")).click();
		String tit =driver.getTitle();
		System.out.println(tit);
		driver.findElement(By.partialLinkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nila");
		driver.findElement(By.id("createLeadForm_lastName")).clear();
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ragavan");
		driver.findElement(By.name("submitButton")).click();
		String tit1 =driver.getTitle();
		System.out.println(tit1);

	}

}
