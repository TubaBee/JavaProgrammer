package com.class26;

public class WebDriverTest {
	public static void main(String[] args) {
		ChromeDriver chrome = new ChromeDriver();
		chrome.refresh();
		chrome.open();

		FireFoxDriver firefox = new FireFoxDriver();
		firefox.refresh();
		firefox.open();

		WebDriver driver = new ChromeDriver();
		driver.open();
		driver.refresh();
		System.out.println("........................");
		//creating an object of child class and given reference to the parent
		WebDriver driver1 = new FireFoxDriver();
		driver1.open();
		driver1.refresh();
		// no access to child specific class through Parent type
	}
}
