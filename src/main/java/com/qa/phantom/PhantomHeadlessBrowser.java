package com.qa.phantom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomHeadlessBrowser {

	public static void main(String[] args) {
		
		// PhantomJSDriver internally uses Ghost Driver
		// Ghost Driver is used as JSON wire protocol --> HTTP Rest calls
		// Headless Browser Testing
		// No browser will be launched
		// Testing is happening behind the scene.
		// its very fast
		// it directly interacts with your app HTTP DOM
		
		System.setProperty("phantomjs.binary.path", "C:\\Users\\raj2b\\Downloads\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		WebDriver driver = new PhantomJSDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println("title before login --> " + title);
		
		
		

	}

}
