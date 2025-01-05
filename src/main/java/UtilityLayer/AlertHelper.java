package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class AlertHelper extends BaseClass {

	public static Alert alertIsPresent() {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public static void accept() {
		alertIsPresent().accept();
	}

	public static void dimiss() {
		alertIsPresent().dismiss();
	}

	public static void sendKeys(String value) {
		alertIsPresent().sendKeys(value);
	}

	public static String getText() {
		return alertIsPresent().getText();
	}

}
