package com.opencart.utilty;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.opencart.testbase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info(result.getName()+" is started");
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info(result.getName()+" is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info(result.getName()+" is failed");
		Util.capturescreenshot(result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info(result.getName()+" is skipped");
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}








