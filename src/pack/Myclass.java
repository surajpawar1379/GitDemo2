package pack;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\suraj\\eclipse-workspace\\chromedriver.exe"); WebDriver driver =
		 * new ChromeDriver(); driver.manage().window().maximize();
		 * 
		 * driver.get("https://www.google.com");
		 * driver.findElement(By.id("APjFqb")).sendKeys("Suraj"); WebDriverWait wait =
		 * new WebDriverWait(driver, 5);
		 * wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
		 * driver.findElement(By.name("btnK")).click();
		 * 
		 * String str = "abcd", reverseString = ""; for (int i = str.length() - 1; i >=
		 * 0; i--) { char ch = str.charAt(i); reverseString = reverseString + ch;
		 * 
		 * } System.out.println(reverseString);
		 * 
		 * int k = 0; for (int i = 0; i < 6; i++) { for (int j = 0; j <= i; j++) {
		 * 
		 * System.out.print(k + "* "); k++; } System.out.println(""); }
		 * 
		 * WebElement drop = driver.findElement(By.id("abc")); Select dropdown = new
		 * Select(drop); dropdown.selectByIndex(2);
		 * 
		 * Assert.assertTrue(driver.findElement(By.id("abc")).isSelected());
		 * 
		 * // Alerts
		 * 
		 * driver.switchTo().alert().dismiss();
		 * 
		 * WebDriverWait wait2 = new WebDriverWait(driver, 5);
		 * wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("abcd")));
		 * 
		 * Actions a = new Actions(driver);
		 * a.moveToElement(driver.findElement(By.className("asd"))).click().keyDown(Keys
		 * .SHIFT).sendKeys("hello") .doubleClick().build().perform();
		 * 
		 * Set<String> str1 = driver.getWindowHandles(); Iterator<String> itr =
		 * str1.iterator(); String parent = itr.next(); String child = itr.next();
		 * driver.switchTo().window(parent); driver.switchTo().window(child);
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(0,250)", "");
		 * 
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("disable-infobars");
		 * options.setAcceptInsecureCerts(true);
		 * options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		 * options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		 * 
		 * File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); try {
		 * FileUtils.copyFile(src, new File("D:\\SURAJ.PNG")); } catch (IOException e) {
		 * // TODO Auto-generated catch block e.printStackTrace(); }
		 */

		String scentence = "Suraj is clever boy and handsome boy and married to akshata suraj pawar";
		String word[] = scentence.split(" ");

		for (int i = 0; i < word.length; i++) {
			int count = 1;
			if (word[i].equalsIgnoreCase("suraj") || word[i].equalsIgnoreCase("boy")
					|| word[i].equalsIgnoreCase("and")) {
				for (int j = i + 1; j < word.length; j++) {
				 
					if (word[i].equalsIgnoreCase(word[j])) {
						count++;
					}		
				
			}System.out.println(word[i] + " :" + count);
			System.out.println(word[i] + " :" + count);
			System.out.println(word[i] + " :" + count);
			}
		}
	}

}
