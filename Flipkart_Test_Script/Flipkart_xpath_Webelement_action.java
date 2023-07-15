package Flipkart_Test_Script;

import java.awt.Desktop.Action;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.netty.handler.codec.AsciiHeadersEncoder.NewlineType;

public class Flipkart_xpath_Webelement_action extends Flipkart_DriverClass
{
	
	//Xpaths
	
	//SigninButton
	static By SigninButton =By.xpath("//span[text()='Sign in']");
	static By textfiled = By.xpath("//input[@class='_2IX_2- VJZDxU']");
	static By searchbar = By.xpath("//input[@class='_3704LK']");
	static By searchIcon = By.xpath("//button[@class='L0Z3Pu']");
	static By close = By.xpath("//button[@class='_2KpZ6l _2doB4z']");
	static By product = By.xpath("//div[text()='SAMSUNG Galaxy F13 (Waterfall Blue, 64 GB)']");
	static By addCart = By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']");
	static By update = By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/div[4]/div[1]/div/button[2]");
	static By remove = By.xpath("//div[text()='Remove']");
	static By account = By.xpath("//span[@class='_1sLnDu']");
	static By logOut = By.xpath("//li[text()='Logout']");
	static By updateaddCart = By.xpath("//div[text()='realme C33 2023 (Sandy Gold, 128 GB)']");
	static By addCart2 = By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']");
	
	
	//Webelemnts
	
	static WebElement webelementSigninButton()
	{
		WebElement signinButtonRef=driver.findElement(SigninButton);
		return signinButtonRef;
	}
	
	static WebElement webelementTexfiled()
	{
		WebElement textfiledRef=driver.findElement(textfiled);
		return textfiledRef;
	}
	
	static WebElement webelementSearchBar()
	{
		WebElement searchBarRef=driver.findElement(searchbar);
		return searchBarRef;
	}
	
	static WebElement webelementSearchIcon()
	{
		WebElement searchIconRef=driver.findElement(searchIcon);
		return searchIconRef;
	}
	
	static WebElement webelementClose()
	{
		WebElement closeRef=driver.findElement(close);
		return closeRef;
	}
	static WebElement webelementProdut()
	{
		WebElement productRef=driver.findElement(product);
		return productRef;
	}
	static WebElement webelementAddcart()
	{
		WebElement AddcartRef=driver.findElement(addCart);
		return AddcartRef;
	}
	static WebElement webelementAddcart2()
	{
		WebElement AddcartRef2=driver.findElement(addCart2);
		return AddcartRef2;
	}
	static WebElement webelementUpdateAddcart()
	{
		WebElement UpdateAddcartRef=driver.findElement(updateaddCart);
		return UpdateAddcartRef;
	}
	static WebElement webelementUpdate()
	{
		WebElement UpdateRef=driver.findElement(update);
		return UpdateRef;
	}
	static WebElement webelementRemove()
	{
		WebElement RemoveRef=driver.findElement(remove);
		return RemoveRef;
	}
	static WebElement webelementAccount()
	{
		WebElement AccountRef=driver.findElement(account);
		return AccountRef;
	}
	static WebElement webelementLogut()
	{
		WebElement LogoutRef=driver.findElement(logOut);
		return LogoutRef;
	}
	
	
	
	
	//Actions
	
	public static void ActionSigninButoon()
	{
		webelementSigninButton().click();
	}
	
	public static void ActionTextfiledClick()
	{
		webelementTexfiled().click();
	}
	
	public static void ActionTextfiledSendkey(String s)
	{
		webelementTexfiled().sendKeys(s);;
	}
	
	public static void ActionSearchBar()
	{
		webelementSearchBar().click();
	}
	public static void ActionSearchBar(String s)
	{
		webelementSearchBar().sendKeys(s);;
	}
	public static void ActionSearchIcon()
	{
		webelementSearchIcon().click();
	}
	public static void Actionclose()
	{
		webelementClose().click();
	}
	public static void ActionProdut()
	{
		webelementProdut().click();
	}
	public static void ActionAddcart()
	{
		webelementAddcart().click();
	}
	public static void ActionAddcart2()
	{
		webelementAddcart2().click();
	}
	public static void ActionUpdate()
	{
		webelementUpdate().click();
	}
	public static void ActionRemove()
	{
		webelementRemove().click();
	}
	
	
	public static void ActionAccount()
	{
		Actions a = new Actions(driver);
		a.moveToElement(webelementAccount());
	}
	public static void ActionLogout()
	{
		webelementLogut().click();
	}
	public static void ActionUpdateAddcart()
	{
		webelementUpdateAddcart().click();
	}
	

}
