package Baseactions;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Step.Hooks;



public class Basicactions {
	public static WebDriver driver = Hooks.driver;
	public static void scrolldown()
	{
		Actions Act = new Actions(driver);
		Act.sendKeys(Keys.DOWN).build().perform();
	}
	
	public static void pagedown()
	{
		Actions Act = new Actions(driver);
		Act.sendKeys(Keys.END).build().perform();
	}
	
	public static void keydown()
	{
		Actions Act = new Actions(driver);
		Act.sendKeys(Keys.DOWN).build().perform();
	}
	
	public static void keyenter()
	{
		Actions Act = new Actions(driver);
		Act.sendKeys(Keys.ENTER).build().perform();
	}
	
	public static void explicitwait(By EWait)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(EWait));
	}
	
	public static String getheadertext(By Header)
	{
		String HeaderText =driver.findElement(Header).getText();
		System.out.println(HeaderText);
		return HeaderText;
	}
	
	public static void click(By element)
	{
		driver.findElement(element).click();
	}
	
	public static void EnterText(By element, String text)
	{
		driver.findElement(element).sendKeys(text);
	}
	
	public static void select(By element, String Text)
	{
		WebElement dropdown = driver.findElement(element);
		Select obj = new Select(dropdown);
		obj.selectByVisibleText(Text);
	}
	
	public static void upload(By element, String pathoffile) throws AWTException
	{
		driver.findElement(element).click();
		StringSelection SS = new StringSelection(pathoffile); 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(SS, null); 
		
        //native key strokes for CTRL, V and ENTER keys
        Robot robot = new Robot();
        robot.delay(1000);
       
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
