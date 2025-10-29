package selenium_practices;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkarttask {
	WebDriver driver;

	public static void Switchtomain(WebDriver driver) {

		String mainWindow = driver.getWindowHandle();
		for (String handle : driver.getWindowHandles()) {
			if (!handle.equals(mainWindow)) {
				driver.switchTo().window(handle);
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.name("q")).sendKeys("mobiles", Keys.ENTER);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@title='Apple']")).click();
		Thread.sleep(3000);

		List<WebElement> Appleitems = driver.findElements(By.xpath("//div[@class='tUxRFH']"));
		Appleitems.get(0).click();
		Thread.sleep(3000);

		Switchtomain(driver);
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement BuyNow = driver.findElement(By.xpath("//button[text()='Buy Now']"));
		js.executeScript("arguments[0].scrollIntoView()", BuyNow);
		BuyNow.click();
		js.executeScript("arguments[0].click();", BuyNow);

		driver.findElement(By.className("F9+fd2")).click();
		Thread.sleep(2000);

		WebElement Youtube = driver.findElement(By.xpath("//a[@aria-label='YouTube']"));
		js.executeScript("arguments[0].scrollIntoView(true);", Youtube);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", Youtube);
		Thread.sleep(2000);
		List<WebElement> videolist = driver.findElements(By.id("video-title"));
		videolist.get(6).click();

		Thread.sleep(2000);

		String videoDur = driver.findElement(By.xpath("//span[@class='ytp-time-duration']")).getText();

		// System.out.println(videoDur);
		// 2. Split the string into minutes and seconds parts
		String[] timesplit = videoDur.split(":");
		int minutes = Integer.parseInt(timesplit[0]);
		int seconds = Integer.parseInt(timesplit[1]);

		// This is the core of the conversion
		System.out.println("Minutes found: " + minutes);
		System.out.println("Seconds found: " + seconds);

		// 3. Convert minutes to seconds and add the remaining seconds
		long totalSeconds = (minutes * 60) + seconds;

		// 4. Print the result of the conversion
		System.out.println("Duration converted to total seconds: " + totalSeconds);

		// 5. Calculate milliseconds for Thread.sleep()
		long videoPlayDurationInMs = totalSeconds * 1000;

		// 6. Pause the execution for the entire duration of the video
		System.out.println("Playing video for " + totalSeconds + " seconds...");
		Thread.sleep(videoPlayDurationInMs);
		System.out.println("Video finished playing.");
		// Thread.sleep(videoplayduration * 1000);
		driver.navigate().back();

		Thread.sleep(800);
		WebElement Instagram = driver.findElement(By.linkText("instagram.com/flipkart"));
		js.executeScript("arguments[0].scrollIntoView(true);", Instagram);
		js.executeScript("arguments[0].click();", Instagram);
//        
			Thread.sleep(3000);
//          driver.findElement(By.xpath("//img[@alt=\"Not Out Deals's profile picture\"]")).click();
		driver.switchTo().window("youtube");
		Thread.sleep(2000);
	driver.navigate().to("https://www.flipkart.com/");
		driver.quit();
	       
	       	}

}
