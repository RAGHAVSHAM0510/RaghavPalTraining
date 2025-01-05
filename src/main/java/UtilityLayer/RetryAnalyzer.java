package UtilityLayer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import BaseLayer.BaseClass;

public class RetryAnalyzer extends BaseClass implements IRetryAnalyzer {

	int counter = 1;

	int maxCounter = 5;

	@Override
	public boolean retry(ITestResult result) {

		if (counter < maxCounter) {
			counter++;

			return true;
		}

		return false;
	}

}
