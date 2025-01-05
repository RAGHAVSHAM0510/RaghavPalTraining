package Tutorial111;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

public class Demo11 extends BaseClass {

	@Test
	public void abc() throws Exception {

		BaseClass.initialization();

		Thread.sleep(5000);
		WebElement wb = getDriver().findElement(By.name("name"));

		wb.sendKeys("Ajit");

		Assert.assertEquals(false, true);

	}

}
