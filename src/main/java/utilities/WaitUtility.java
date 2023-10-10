package utilities;

import java.time.Duration; 
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	
	WebDriver driver;
	
	public WaitUtility(WebDriver driver) {
		this.driver = driver;
	}
	public void explicitWait(WebDriver driver, String locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
	}
	
	public void waitUntilVisibilityOfElement(String xpath, long maxTimeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(maxTimeOut));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	
//	public void fluent(WebDriver driver, WebElement element, String locator) { 		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30L))
//				.pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
//		
//		element = wait.until(new Function<WebDriver, WebElement>(){
//			public WebElement apply(WebDriver driver) {
//				return driver.findElement(By.xpath(locator));
//			}
//
//		});
//	}
	
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
