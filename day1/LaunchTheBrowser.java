package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheBrowser {

	public static void main(String[] args) {
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://www.facebook.com/");

	}

}
