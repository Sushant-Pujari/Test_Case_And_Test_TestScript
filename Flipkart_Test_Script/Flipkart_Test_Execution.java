package Flipkart_Test_Script;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart_Test_Execution extends Flipkart_DriverClass 
{
	@BeforeMethod
	public void OpenBrowser()
	{
		Flipkart_DriverClass .drive();
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
		//driver.close();
	}
	
	@Test
	
	public static void Flipkart_Login()
	{
		Flipkart_xpath_Webelement_action.ActionSigninButoon();
		Flipkart_xpath_Webelement_action.ActionTextfiledClick();
		Flipkart_xpath_Webelement_action.ActionTextfiledSendkey("9075272431");
		
	}
	
	@Test
	public static void searchItem() {
		Flipkart_xpath_Webelement_action.Actionclose();
		Flipkart_xpath_Webelement_action.ActionSearchBar();
		Flipkart_xpath_Webelement_action.ActionSearchBar("samsung mobiles");
		Flipkart_xpath_Webelement_action.ActionSearchIcon();
	}
	@Test
	public static void displayFirstPage() {
	    Flipkart_xpath_Webelement_action.Actionclose();
	    //WebElement element = driver.findElement(By.xpath("//div[@class='eFQ30H']"));
	    List<WebElement> ref = driver.findElements(By.xpath("//div[@class='eFQ30H']"));
	    for (WebElement webElement : ref) {
	        System.out.println(webElement.getText());
	    }
	}
	@Test
	public static void addProduct() {
		Flipkart_xpath_Webelement_action.Actionclose();
		Flipkart_xpath_Webelement_action.ActionSearchBar();
		Flipkart_xpath_Webelement_action.ActionSearchBar("samsung mobiles");
		Flipkart_xpath_Webelement_action.ActionSearchIcon();
		Flipkart_xpath_Webelement_action.ActionProdut();
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> i1=ids.iterator();
		
		String parent=i1.next();
		String child=i1.next();
		
		driver.switchTo().window(child);

		Flipkart_xpath_Webelement_action.ActionAddcart();

		
	}
	
	@Test
	public static void updateProduct() {
		Flipkart_xpath_Webelement_action.Actionclose();
		Flipkart_xpath_Webelement_action.ActionSearchBar();
		Flipkart_xpath_Webelement_action.ActionSearchBar("samsung mobiles");
		Flipkart_xpath_Webelement_action.ActionSearchIcon();
		Flipkart_xpath_Webelement_action.ActionProdut();
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> i1=ids.iterator();
		
		String parent=i1.next();
		String child=i1.next();
		
		driver.switchTo().window(child);
		Flipkart_xpath_Webelement_action.ActionAddcart();
		Flipkart_xpath_Webelement_action.ActionSearchBar();
		Flipkart_xpath_Webelement_action.ActionSearchBar("realme mobiles");
		Flipkart_xpath_Webelement_action.ActionSearchIcon();
		Flipkart_xpath_Webelement_action.ActionUpdateAddcart();
		Set<String> ids1 = driver.getWindowHandles();
		Iterator<String> i2=ids1.iterator();
		
		String parent1=i2.next();
		String child1=i2.next();
		String child2=i2.next();
		
		driver.switchTo().window(child2);
		Flipkart_xpath_Webelement_action.ActionAddcart2();
		

		
	}
	@Test
	public static void removeProduct() {
		Flipkart_xpath_Webelement_action.Actionclose();
		Flipkart_xpath_Webelement_action.ActionSearchBar();
		Flipkart_xpath_Webelement_action.ActionSearchBar("samsung mobiles");
		Flipkart_xpath_Webelement_action.ActionSearchIcon();
		Flipkart_xpath_Webelement_action.ActionProdut();
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> i1=ids.iterator();
		
		String parent=i1.next();
		String child=i1.next();
		
		driver.switchTo().window(child);
		
		Flipkart_xpath_Webelement_action.ActionAddcart();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000);");
		Flipkart_xpath_Webelement_action.ActionRemove();

		
	}
	
	@Test
	public static void logOut() {
		Flipkart_xpath_Webelement_action.ActionAccount();
		Flipkart_xpath_Webelement_action.ActionLogout();
	}
	
	
	

	
}
