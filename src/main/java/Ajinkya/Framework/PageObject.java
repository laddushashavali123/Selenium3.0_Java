package Ajinkya.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {

		WebDriver driver;
	
		@FindBy(id="element_information")
		WebElement Element_to_be_search;
		
		public PageObject(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		public WebElement Element_to_be_search_function()
		{
			return Element_to_be_search;
		}
}
