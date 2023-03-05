package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("http://leaftaps.com/opentaps/control/login");
		Driver.manage().window().maximize();
		Driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		Driver.findElement(By.id("password")).sendKeys("crmsfa");
		Driver.findElement(By.className("decorativeSubmit")).click();
		Driver.getTitle();
		String title = Driver.getTitle();
		System.out.println(title);
		Driver.close();

	}

}
