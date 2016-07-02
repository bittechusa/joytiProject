package eshopper.main.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class HomePage {
	
	public WebDriver driver=null;
	public void HomePage(WebDriver driver) {
		this.driver=driver;
     
	}
	
	@FindBy(xpath="html/body/div[4]/header/section[3]/div/nav/ul/li[1]/a")
	private WebElement menItem;
	

}
