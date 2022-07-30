package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {
	WebDriver driver;

	public void lunch()
	{
		System.setProperty("webdriver.chrome.driver","/Users/diganto/Data/Selenium/untitled/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://localhost:3000/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("email")).sendKeys("tony@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("email")).sendKeys("batman@email.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("submit")).click();
		
	}
	public static void main(String[] args) {
        HelloSelenium obj = new HelloSelenium();
        obj.lunch();
    }
}
