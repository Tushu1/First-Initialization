package TusharCompany.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCatalogue {

	WebDriver driver;
	
	
	public ProductCatalogue(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//WebElement userEmail = driver.findElement(By.id("userEmail"));
	
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement userPwd;
	
	@FindBy(id="login")
	WebElement login;
	
	public void loginApplication(String email, String password) {
		userEmail.sendKeys(email);
		userPwd.sendKeys(password);
		login.click();
	}
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");
	}
	
}
