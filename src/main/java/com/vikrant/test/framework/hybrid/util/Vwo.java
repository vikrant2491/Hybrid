package com.vikrant.test.framework.hybrid.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;

public class Vwo {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://app.vwo.com/#/analyze/heatmap/129/reports?token=eyJhY2NvdW50X2lkIjo2LCJleHBlc%20mltZW50X2lkIjoxMjksImNyZWF0ZWRfb24iOjE1MDc3ODk0ODcsInR5cGUiOiJjYW1wYWlnbiIsI%20nZlcnNpb24iOjEsImhhc2giOiJiMzlmMTQ4MWE0ZDMyN2Q4MDllNTM1YzVlNWFjOGVlMCJ9");
		String w1 = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='View heatmap']")).click();
		for(String handle: driver.getWindowHandles()){
			if(!handle.equalsIgnoreCase(w1)){
				driver.switchTo().window(handle);
			}
		}
		System.out.println(driver.getTitle());
//		driver.findElement(By.xpath("//div[@data-qa='zarujegatu']")).click();
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='heatmap-iframe']"));
		driver.switchTo().frame(frame);
		Shadow sh = new Shadow(driver);
		sh.setExplicitWait(100, 5);
		sh.findElement("div[data-qa='zarujegatu']").click();
		WebElement eleList = driver.findElement(By.id("element-list-iframe"));
		driver.switchTo().frame(eleList);
		String b1 = sh.findElement("input[data-qa='inline-su-v1-email']:nth-of-type(2)").getCssValue("border");
		System.out.println(b1);
		sh.findElement("table>tr:nth-of-type(2)>td[data-qa='ganukuqena']").click();
		String b2 = sh.findElement("input[data-qa='inline-su-v1-email']:nth-of-type(2)").getCssValue("border");
		System.out.println(b2);

	}

}
