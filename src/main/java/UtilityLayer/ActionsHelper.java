package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class ActionsHelper extends BaseClass {

	public static void click(WebElement wb) {
		new Actions(getDriver()).click(WebElementHelper.visibilityOf(wb)).build().perform();

	}

	public static void doubleClick(WebElement wb) {
		new Actions(getDriver()).doubleClick(WebElementHelper.visibilityOf(wb)).build().perform();
	}

	public static void contextClick(WebElement wb) {
		new Actions(getDriver()).contextClick(WebElementHelper.visibilityOf(wb)).build().perform();
	}

	public static void moveToElement(WebElement wb) {
		new Actions(getDriver()).moveToElement(WebElementHelper.visibilityOf(wb)).build().perform();
	}

	public static void scrollToElement(WebElement wb) {
		new Actions(getDriver()).scrollToElement(WebElementHelper.visibilityOf(wb)).build().perform();
	}

	public static void clickAndHold(WebElement wb) {
		new Actions(getDriver()).clickAndHold(WebElementHelper.visibilityOf(wb)).build().perform();
	}

	public static void release(WebElement wb) {
		new Actions(getDriver()).release(WebElementHelper.visibilityOf(wb)).build().perform();
	}

	public static void dragAndDrop(WebElement src, WebElement trg) {
		new Actions(getDriver()).dragAndDrop(WebElementHelper.visibilityOf(src), WebElementHelper.visibilityOf(trg))
				.build().perform();
	}

	public static void sendKeys(WebElement wb, String value) {
		new Actions(getDriver()).sendKeys(WebElementHelper.visibilityOf(wb), value).build().perform();
	}

	public static void selectValue(WebElement wb, String expectedvalue) throws InterruptedException {

	}

}
