package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotel {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BaLa\\eclipse-oxygen-workspace\\Others\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys("Bala231292");
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("Balapandiyan.10");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		WebElement ddnLocation = driver.findElement(By.id("location"));
		Select s=new Select(ddnLocation);
		s.selectByValue("New York");
		WebElement ddnHotel = driver.findElement(By.id("hotels"));
		Select s1=new Select(ddnHotel);
		s1.selectByValue("Hotel Sunshine");
		WebElement ddnRoom = driver.findElement(By.id("room_type"));
		Select s2=new Select(ddnRoom);
		s2.selectByVisibleText("Super Deluxe");
		WebElement ddnRoomNo = driver.findElement(By.id("room_nos"));
		Select s3=new Select(ddnRoomNo);
		s3.selectByVisibleText("1 - One");
		WebElement checkIn = driver.findElement(By.id("datepick_in"));
		checkIn.clear();
		Thread.sleep(3000);
		checkIn.sendKeys("23/11/2020");
		WebElement checkOut = driver.findElement(By.id("datepick_out"));
		checkOut.clear();
		checkOut.sendKeys("25/12/2020");
		WebElement adultRoom = driver.findElement(By.id("adult_room"));
		Select s4=new Select(adultRoom);
		s4.selectByVisibleText("2 - Two");
		WebElement childRoom = driver.findElement(By.id("child_room"));
		Select s5=new Select(childRoom);
		s5.selectByIndex(0);
		WebElement btnSearch = driver.findElement(By.id("Submit"));
		btnSearch.click();
		WebElement radioBtn = driver.findElement(By.id("radiobutton_0"));
		radioBtn.click();
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();
		WebElement txtFirstName = driver.findElement(By.id("first_name"));
		txtFirstName.sendKeys("Balachander");
		WebElement txtLastName = driver.findElement(By.id("last_name"));
		txtLastName.sendKeys("Pandiyan");
		WebElement txtAddress = driver.findElement(By.id("address"));
		txtAddress.sendKeys("Meenambakkam, Chennai");
		WebElement ccNo = driver.findElement(By.id("cc_num"));
		ccNo.sendKeys("1234567891012365");
		WebElement ccType = driver.findElement(By.id("cc_type"));
		Select s6=new Select(ccType);
		s6.selectByValue("AMEX");
		WebElement ccExpMonth = driver.findElement(By.id("cc_exp_month"));
		Select s7=new Select(ccExpMonth);
		s7.selectByValue("12");
		WebElement ccExpYear = driver.findElement(By.id("cc_exp_year"));
		Select s8=new Select(ccExpYear);
		s8.selectByVisibleText("2022");
		WebElement ccCvv = driver.findElement(By.id("cc_cvv"));
		ccCvv.sendKeys("146");
		WebElement txtBookNow = driver.findElement(By.id("book_now"));
		txtBookNow.click();
		
	}

}
