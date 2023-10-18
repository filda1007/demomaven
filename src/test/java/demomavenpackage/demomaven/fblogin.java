package demomavenpackage.demomaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		username.sendKeys("filda@gmail.com");
        WebElement password = driver.findElement(By.name("pass"));
	    password.sendKeys("fildapass");
		WebElement login = driver.findElement(By.name("login"));
	    login.click();

	}

}
