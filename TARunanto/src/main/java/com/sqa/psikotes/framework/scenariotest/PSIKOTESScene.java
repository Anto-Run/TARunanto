//Author : Runanto
//Created-date: 29-09-2022 13.00

package com.sqa.psikotes.framework.scenariotest;

public enum PSIKOTESScene {


	R1("TSLP001001 admin login valid click button signin"),
	R2("TSLP001002 admin login valid click button green username"),
	R3("TSLP001003 admin login valid click button green password"),
	R4("TSAP001001 Admin masuk ke halaman admin");
	
	
	private String testName;
	
	private PSIKOTESScene(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	
		}


}
