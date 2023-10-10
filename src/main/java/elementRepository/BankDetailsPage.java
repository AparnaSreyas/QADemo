package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankDetailsPage {
	WebDriver driver;
	
	public BankDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//input[@id='worker-ac_name']")
	WebElement accountName;
	
	@FindBy(xpath = "//input[@id='worker-ac_no']")
	WebElement accountNumber;
	
	@FindBy(xpath = "//input[@id='worker-sort_code']")
	WebElement sortCode;
	
	@FindBy(xpath = "//button[text()='Save']")
	WebElement saveButton;
	
	@FindBy(xpath = "//div[@class='col-sm-6 breadcrumb-navigation']//ul//a[1]")
	WebElement home;
	
	public void inputAccountName() {
		accountName.sendKeys("xxx");
	}

	public void inputAccountNumber() {
		accountNumber.sendKeys("2628");
	}
	
	public void inputSortCode() {
		sortCode.sendKeys("111");
	}
	
	public void clickSave() {
		saveButton.click();
	}
	
	public void clickHome() throws InterruptedException {
		Thread.sleep(5000);
		home.click();
	}
}
