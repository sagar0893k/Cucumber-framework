package base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	
	Properties prop;
	public static WebDriver driver;
	
 public TestBase()
	{
		try
		{
		FileInputStream fis=new FileInputStream("E:\\Eclipse\\cucutest\\src\\main\\java\\properties");
		 prop= new Properties();
		prop.load(fis);
		}
		
		catch(Exception e)
		{
			
		}
	}
	
	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver",prop.getProperty("chromeDriverPath"));
		driver=new ChromeDriver();
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);
		
		
	}
	
	
	
	
}
