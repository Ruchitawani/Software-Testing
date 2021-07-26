package selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shree\\Desktop\\Selenium Jar\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		
		WebDriver w = new FirefoxDriver();
		
		w.get("http://demo.guru99.com/test/newtours/index.php");
		
		//selenium dropdown button
		// yahoo
				
		w.findElement(By.className("dropdown-toggle")).click();
		w.findElement(By.linkText("Yahoo")).click();
		Thread.sleep(3000);
		w.navigate().to("http://demo.guru99.com/test/newtours/index.php"); 
		
		//flash movie demo
		  
		w.findElement(By.className("dropdown-toggle")).click();
		w.findElement(By.linkText("Flash Movie Demo")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		//table demo
		w.findElement(By.className("dropdown-toggle")).click();
		w.findElement(By.linkText("Table Demo")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		//insurance project
		w.findElement(By.xpath("//a[contains(text(),'Insurance Project')]")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		// agile project
		
		w.findElement(By.linkText("Agile Project")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		// bank project
		
		w.findElement(By.linkText("Bank Project")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		//security project
		w.findElement(By.xpath("//a[contains(text(),'Security Project')]")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		//Telicom project
		
		w.findElement(By.linkText("Telecom Project")).click();
		w.navigate().back(); 
		
		//payment gateway project
		w.findElement(By.xpath("//a[contains(text(),'Payment Gateway Project')]")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		//new tours
		w.findElement(By.xpath("//a[contains(text(),'New Tours')]")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		//seo
		w.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[11]/a[1]")).click();
		Thread.sleep(1000);
		w.navigate().to("http://demo.guru99.com/test/newtours/index.php");
		
		//login
		w.findElement(By.name("userName")).sendKeys("test");
		
		w.findElement(By.name("password")).sendKeys("test");
		
		w.findElement(By.name("submit")).click();
		w.navigate().back();
		
		//print on console
		System.out.println("Sign on is working");
		
		//sign on
		w.findElement(By.linkText("SIGN-ON")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		//register
		w.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(1000);
		
		w.findElement(By.name("firstName")).sendKeys("Ruchita");
		Thread.sleep(500);
		
		w.findElement(By.name("lastName")).sendKeys("Wani");
		Thread.sleep(500);
		
		w.findElement(By.name("phone")).sendKeys("7083229727");
		Thread.sleep(500);
		
		w.findElement(By.id("userName")).sendKeys("Ruchita@gmail.com");
		Thread.sleep(500);
		
		w.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]")).sendKeys("Wakad");
		Thread.sleep(500);
		
		w.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).sendKeys("Pune");
		Thread.sleep(500);
		
		w.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]")).sendKeys("Maharashtra");
		Thread.sleep(500);
		
		w.findElement(By.name("postalCode")).sendKeys("411027");
		Thread.sleep(500);
		
		Select country = new Select(w.findElement(By.name("country")));
		country.selectByVisibleText("INDIA");
		Thread.sleep(500);
		
		w.findElement(By.name("email")).sendKeys("test");
		
		w.findElement(By.name("password")).sendKeys("test");
		
		w.findElement(By.name("confirmPassword")).sendKeys("test");
		
		w.findElement(By.name("submit")).click();
		
		w.navigate().back();
		
		//support
		w.findElement(By.linkText("SUPPORT")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		//contact
		w.findElement(By.linkText("CONTACT")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		//home
		w.findElement(By.linkText("Home")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		//flights
		w.findElement(By.linkText("Flights")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		//hotels
		w.findElement(By.linkText("Hotels")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		//car rentals
		w.findElement(By.linkText("Car Rentals")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		//cruises
		w.findElement(By.linkText("Cruises")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		//destination
		w.findElement(By.linkText("Destinations")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		//vacations
		w.findElement(By.linkText("Vacations")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		w.close();

				
				
	}

}
