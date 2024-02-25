package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class S01_FirstScript {
	//
	public static void main(String[] args) {
		//
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/selenium/web/web-form.html");

		driver.getTitle();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

		WebElement textBox = driver.findElement(By.name("my-text"));
		WebElement submitButton = driver.findElement(By.cssSelector("button"));

		textBox.sendKeys("Selenium");
		submitButton.click();

		WebElement message = driver.findElement(By.id("message"));
		message.getText();
		
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
