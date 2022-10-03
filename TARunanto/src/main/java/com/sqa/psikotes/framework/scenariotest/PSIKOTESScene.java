/*
 * Author : Runanto
 * Created-date: 29-09-2022 13.00
 * Modifer:Runanto
 * Modifed date: 29/09/2022 23.00
 */

package com.sqa.psikotes.framework.scenariotest;

public enum PSIKOTESScene {

	//1, 1,1,1, 1, 6, 6, 6, 1,1, 1,1,1,1, 1,1,1,1,1,1,1,1,1,1,1,1

	R1("TSLP001001 admin login valid click button signin"), //1
	R2("TSLP001002 admin login valid click button green username"), //1
	R3("TSLP001003 admin login valid click button green password"), //1
	R4("TSLP001004 Admin login valid dan menekan enter keyboard"), //1
	R5("TSAP001001 Admin masuk ke halaman admin"), //1
	// 1, 1,1,1,1
	
	R6("TSAP002001 Admin mencari data dengan tombol search"), //6
	R7("TSAP002002 Admin mencari data dengan  tombol enter (green button)"), //6
	R8("TSAP002003 Admin mencari data dengan tombol enter pada keyboard"), //6
	//6, 6, 6
	
	
	R9("TSAP003001 Admin menyetujui menambahkan data akun admin"),//1
	R10("TSAP003002 Admin menyetujui menambahkan data akun admin"),//1
	//1,1
	
	R11("TSAP004001 Admin menampilkan10 data admin"),//1
	R12("TSAP004002 Admin menampilkan25 data admin"), //1
	R13("TSAP004003 Admin menampilkan50 data admin"), //1
	R14("TSAP004004 Admin menampilkan100 data admin"),//1
	//1,1,1,1
	
	R15("TSAP005001 Admin menampilkan10 data  admin pada page ke1"),//1
	R16("TSAP005002 Admin menampilkan10 data  admin pada page ke2"),//1
	R17("TSAP005003 Admin menampilkan10 data  admin pada page ke3"), //1
	R18("TSAP005004 Admin menampilkan10 data  admin pada page ke4"),//1
	R19("TSAP005005 Admin menampilkan10 data  admin pada page ke5"),//1
	R20("TSAP005006 Admin menampilkan10 data  admin pada page ke6"),//1
	R21("TSAP005007 Admin menampilkan10 data  admin pada page ke7"),//1
	R22("TSAP005008 Admin menampilkan10 data  admin pada page ke8"),//1
	R23("TSAP005009 Admin menampilkan10 data  admin pada page ke9"),//1
	R24("TSAP005010 Admin menampilkan10 data  admin pada page ke10"),//1
	R25("TSAP005011 Admin menampilkan10 data admin pada page paling awal"), //1
	R26("TSAP005012 Admin menampilkan10 data admin pada page paling terakhir");//1
	//1,1,1,1,1,1,1,1,1,1,1,1,
	
	
	private String testName;
	
	private PSIKOTESScene(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	
		}


}
