package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Ilampirai");
		driver.findElement(By.name("lastname")).sendKeys("Zahir Hussain");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9865754268");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Angel@1234");
		WebElement id = driver.findElement(By.id("day"));
		Select drop =new Select(id);
		drop.selectByVisibleText("6");
		WebElement id1 = driver.findElement(By.id("month"));
		Select drp =new Select(id1);
		drp.selectByVisibleText("Jan");
		WebElement id2 = driver.findElement(By.id("year"));
		Select dp =new Select(id2);
		dp.selectByVisibleText("1998");
		driver.findElement(By.xpath("//label[@class='_58mt']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
