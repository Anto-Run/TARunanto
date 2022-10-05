/*
 * Author : Runanto
 * Created-date: 29-09-2022 13.00
 * Modifer:Runanto
 * Modifed date: 29/09/2022 23.00
 */

package com.sqa.psikotes.framework.scenariotest;

public enum PSIKOTESScene {

	//1, 1,1,1, 1, 6, 6, 6, 1,1, 1,1,1,1, 1,1,1,1,1,1,1,1,1,1,1,1

	R001("TSLP001001 admin login valid click button signin"), //1
	R002("TSLP001002 admin login valid click button green username"), //1
	R003("TSLP001003 admin login valid click button green password"), //1
	R004("TSLP001004 Admin login valid dan menekan enter keyboard"), //1
	R005("TSAP001001 Admin masuk ke halaman admin"), //1
	// 1, 1,1,1,1
	
	R006("TSAP002001 Admin mencari data dengan tombol search"), //6
	R007("TSAP002002 Admin mencari data dengan  tombol enter (green button)"), //6
	R008("TSAP002003 Admin mencari data dengan tombol enter pada keyboard"), //6
	//6, 6, 6
	
//	
	R009("TSAP003001 Admin menyetujui menambahkan data akun admin"),//1
	R010("TSAP003002 Admin tidak menyetujui menambahkan data akun admin"),//1
//	//1,1
	
	R011("TSAP004001 Admin menampilkan10 data admin"),//1
	R012("TSAP004002 Admin menampilkan25 data admin"), //1
	R013("TSAP004003 Admin menampilkan50 data admin"), //1
	R014("TSAP004004 Admin menampilkan100 data admin"),//1
	//1,1,1,1
//	
	R015("TSAP005001 Admin menampilkan10 data  admin pada page ke1"),//1
	R016("TSAP005002 Admin menampilkan10 data  admin pada page ke2"),//1
	R017("TSAP005003 Admin menampilkan10 data  admin pada page ke3"), //1
	R018("TSAP005004 Admin menampilkan10 data  admin pada page ke4"),//1
	R019("TSAP005005 Admin menampilkan10 data  admin pada page ke5"),//1
	R020("TSAP005006 Admin menampilkan10 data  admin pada page ke6"),//1
	R021("TSAP005007 Admin menampilkan10 data  admin pada page ke7"),//1
	R022("TSAP005008 Admin menampilkan10 data  admin pada page ke8"),//1
	R023("TSAP005009 Admin menampilkan10 data  admin pada page ke9"),//1
	R024("TSAP005010 Admin menampilkan10 data  admin pada page ke10"),//1
	R025("TSAP005011 Admin menampilkan10 data admin pada page paling awal"), //1
	R026("TSAP005012 Admin menampilkan10 data admin pada page paling terakhir"), //1
//	//1,1,1,1,1,1,1,1,1,1,1,1,
	
	R027("TSAP006001 Admin menampilkan25 data admin pada page ke1"), //1
	R028("TSAP006002 Admin menampilkan25 data admin pada page ke2"), //1
	R029("TSAP006003 Admin menampilkan25 data admin pada page ke3"), //1
	R030("TSAP006004 Admin menampilkan25 data admin pada page ke4"), //1
	R031("TSAP006005 Admin menampilkan25 data admin pada page paling awal"), //1
	R032("TSAP006006 Admin menampilkan25 data admin pada page paling terakhir"), //1
////	
////	//1,1,1,1,1,1
////	
////	
	R033("TSAP007001 Admin menampilkan50 data admin pada page ke1"),//1
	R034("TSAP007002 Admin menampilkan50 data admin pada page ke2"), //1
	R035("TSAP007003 Admin menampilkan50 data admin pada page >>"), //1
	R036("TSAP007004 Admin menampilkan50 data admin pada page <<"), //1
	// 1, 1, 1, 1
	
	R37("TSAP008001 Admin menampilkan100 data admin pada page ke1"),
	R38("TSAP009001 Admin mereset passwod akun admin"),
//	//1, 1
	
	R39("TSAP010001 Admin mengubah satu field pada akun admin"), //4
	R40("TSAP010002 Admin mengubah dua field pada akun admin"), //6
	R41("TSAP010003 Admin mengubah tiga field pada akun admin"), //3
	R42("TSAP010004 Admin mengubah semua field pada akun admin"); //1
	//4,6,3,1
	
	private String testName;
	
	private PSIKOTESScene(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	
		}


}
