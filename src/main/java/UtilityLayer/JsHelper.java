package UtilityLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class JsHelper extends BaseClass {

	public static void click(WebElement wb) {
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", WebElementHelper.visibilityOf(wb));

	}

	public static void sendKeys(WebElement wb, String value) {

		((JavascriptExecutor) getDriver()).executeScript("arguments[0].value='" + value + "';",
				WebElementHelper.visibilityOf(wb));

	}

	public static void handleDropDown(String className, String value) {

		((JavascriptExecutor) getDriver())
				.executeScript("document.getElementsByClassName('" + className + "')[0].value='" + value + "';");

	}

	public static void handleDropDownWithoutSelect(String className, int value) {

		((JavascriptExecutor) getDriver())
				.executeScript("document.getElementsByClassName('" + className + "')[" + value + "].click();");

	}

	public static void get(String url) {
		((JavascriptExecutor) getDriver()).executeScript("window.location='" + url + "';");
	}

	public static String getTitle() {
		return ((JavascriptExecutor) getDriver()).executeScript("return document.title").toString();
	}

	public static String getCurrentUrl() {
		return ((JavascriptExecutor) getDriver()).executeScript("return document.URL").toString();
	}

	public static void forward(int forward) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("history.go(+" + forward + ")");
	}

	public static void back(int back) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("history.go(-" + back + ")");
	}

	public static void refresh() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("history.go(0)");
	}

	public static void scrollIntoView(WebElement wb) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);", WebElementHelper.visibilityOf(wb));
	}

	public static void alert(String message) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("alert(" + message + ")");
	}

	public static void confirm(String message) {
		((JavascriptExecutor) getDriver()).executeScript("confirm(" + message + ")");
	}

	public static void prompt(String message) {
		((JavascriptExecutor) getDriver()).executeScript("prompt(" + message + ")");
	}

	public static void borderForElement(WebElement wb) {
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.border='3px solid red';",
				WebElementHelper.visibilityOf(wb));
	}

	public static void highLightElement(WebElement wb, String color) throws InterruptedException {

		String actualColor = WebElementHelper.visibilityOf(wb).getCssValue("background-color");

		System.out.println(actualColor);

		for (int i = 0; i <= 100; i++) {
			Thread.sleep(500);

			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("arguments[0].style.backgroundColor='rgb(" + color + ")';",
					WebElementHelper.visibilityOf(wb));

			Thread.sleep(500);

			((JavascriptExecutor) getDriver()).executeScript(
					"arguments[0].style.backgroundColor='" + actualColor + "';", WebElementHelper.visibilityOf(wb));
		}
	}

}
