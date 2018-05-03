import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver=new FirefoxDriver();
		String baseURL="https://www.facebook.com";
		String expectedTitle="Gmail";
		String actualTitle="";
		String tagName="";
		driver.get(baseURL);
		actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		tagName=driver.findElement(By.id("email")).getTagName();
		//String sourcecode=driver.getPageSource();
		//System.out.println(sourcecode);
		System.out.println(tagName);
		Boolean value1=driver.findElement(By.xpath("//*[@id='u_0_7']")).isSelected();
		System.out.println(value1);
		System.exit(0);
			
	}

}
