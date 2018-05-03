import java.io.FileInputStream;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {

	public static void main(String[] args) throws Exception, NoSuchElementException {
		FileInputStream f=new FileInputStream("C:\\Users\\kuki\\Programs\\SeleniumTest\\src\\objectrepository.properties");
		Properties prop=new Properties();
		prop.load(f);
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys("palash622@gmail.com");
		driver.findElement(By.xpath(prop.getProperty("next"))).click();
		driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys("Sunsunu@622");
		driver.findElement(By.xpath(prop.getProperty("signin"))).click();
	}

}
