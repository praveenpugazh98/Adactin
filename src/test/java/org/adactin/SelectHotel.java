package org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends TestClass {

	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="radiobutton_0") WebElement checkbutton;
	@FindBy(name="continue") WebElement press;
}
