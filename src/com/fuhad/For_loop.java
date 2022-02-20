package com.fuhad;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class For_loop {

	public void forLoop() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

	}

	@Test
	public void target() {
		System.setProperty("webdriver.chrome.driver", "/Users/panther/Downloads/Driver/chromedriver");
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.target.com/");
		List<WebElement> ele = dr.findElements(By.xpath("//ul[contains(@class,'UtilityNavList')]/li"));
		for (int i = 1; i < ele.size(); i++) {
			String text = dr.findElement(By.xpath("//ul[contains(@class,'UtilityNavList')]/li[" + i + "]")).getText();
			if (!text.equals("Orders")) {
				dr.findElement(By.xpath("//ul[contains(@class,'UtilityNavList')]/li[" + i + "]")).click();
				System.out.println(dr.getTitle());
				dr.navigate().back();
			} else {
				continue;
			}

		}

	}
}
