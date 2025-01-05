package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class DropDownHelper extends BaseClass {

	public static void selectByVisibleText(WebElement wb, String value) {

		new Select(WebElementHelper.visibilityOf(wb)).selectByVisibleText(value);
	}

	public static void selectByValue(WebElement wb, String value) {

		new Select(WebElementHelper.visibilityOf(wb)).selectByValue(value);

	}

	public static void selectByIndex(WebElement wb, int index) {

		new Select(WebElementHelper.visibilityOf(wb)).selectByIndex(index);

	}

	private static void selectDropDownValue(List<WebElement> lists, String expectedValue) {
		for (WebElement lswb : lists) {
			String actualValue = lswb.getText();

			if (actualValue.equalsIgnoreCase(expectedValue)) {
				lswb.click();
				break;
			}
		}
	}

	public static void selectValue(WebElement wb, String expectedValue) {

		List<WebElement> ls = new Select(WebElementHelper.visibilityOf(wb)).getOptions();
		DropDownHelper.selectDropDownValue(ls, expectedValue);

	}

	/*
	 * Select Drop down Values and if drop down tag name start without select tag in
	 * HTML DOM Structure.
	 * 
	 */

	public static void selectValue(List<WebElement> lists, String expectedValue) {

		List<WebElement> list = WebElementHelper.visibilityOfAllElements(lists);

		DropDownHelper.selectDropDownValue(list, expectedValue);
	}

}
