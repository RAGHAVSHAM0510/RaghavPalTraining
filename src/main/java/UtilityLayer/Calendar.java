package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class Calendar extends BaseClass {

	public static void selectMonthAndYear(WebElement wb, String expectedValue, WebElement next) {

		while (true) {
			String actualValue = wb.getText();

			if (actualValue.equalsIgnoreCase(expectedValue)) {
				break;
			} else {
				WebElementHelper.click(next);
			}
		}

	}

	public static void selectDate(List<WebElement> list, String expectedDate) {

		for (WebElement wb : WebElementHelper.visibilityOfAllElements(list)) {
			String actualDate = wb.getText();

			if (actualDate.equalsIgnoreCase(expectedDate)) {
				WebElementHelper.click(wb);
				break;
			}

		}

	}

}
