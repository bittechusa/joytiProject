package eshopper.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import eshopper.main.org.HomePage;

public class TestEshopper {
	
	public WebDriver driver=null;
	@BeforeClass
	public void initiation(){
		driver=new FirefoxDriver();
		driver.get("https://www.eshopper24.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void verifyMenDetailPage(){
		 //HomePage homepage=new HomePage();
		
	}

}
