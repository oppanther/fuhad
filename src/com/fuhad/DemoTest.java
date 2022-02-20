package com.fuhad;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class DemoTest {
	ChromeDriver dr;

	public void openBrower() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/panther/Downloads/Driver/chromedriver");

		 dr = new ChromeDriver();
	}

	public void openfullpage() {
		dr.manage().window().maximize();

	}

	public void clickonanyelement() {
		dr.findElement(By.xpath("dgfgfbfgfh")).click();

	}

	public void closePage() {
		dr.quit();
		System.out.println("this test had been pass");

	}

	public void opennAnyWebsite() {
		dr.get("https://www.target.com/");

	}

}
