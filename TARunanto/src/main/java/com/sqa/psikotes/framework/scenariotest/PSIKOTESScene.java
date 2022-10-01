//Author : Runanto
//Created-date: 29-09-2022 13.00

package com.sqa.psikotes.framework.scenariotest;

public enum PSIKOTESScene {


	R1("TSLP001001 admin login valid click button signin"), //1
	R2("TSLP001002 admin login valid click button green username"), //1
	R3("TSLP001003 admin login valid click button green password"), //1
	R4("TSLP001004 Admin login valid dan menekan enter keyboard"), //1
	R5("TSAP001001 Admin masuk ke halaman admin"); //1
	
	
	private String testName;
	
	private PSIKOTESScene(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	
		}


}
