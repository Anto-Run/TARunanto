/*
 * Author : Runanto
 * Created-date: 29-09-2022 13.00
 * Modifer:Runanto
 * Modifed date: 29/09/2022 23.00
 */

package com.sqa.psikotes.framework.scenariotest;

public enum PSIKOTESScene {

	/*
	 * Scene Runanto
	 */
	
	R001("TSLP001001 admin login valid click button signin"), //1
	R002("TSLP001002 admin login valid click button green username"), //1
	R003("TSLP001003 admin login valid click button green password"), //1
	R004("TSLP001004 Admin login valid dan menekan enter keyboard"), //1
	// 1, 1,1,1
	
	R005("TSLPN002001 Admin login invalid dan menekan tombol sign in"), //6
	R006("TSLPN002002 Admin login invalid dan menekan tombol enter (green button) username"), //6
	R007("TSLPN002003 Admin login invalid dan menekan tombol enter (green button) password"), //6
	//6, 6, 6
	
	R008("TSAP001001 Admin masuk ke halaman admin"), //1
	R009("TSAP002001 Admin mencari data dengan tombol search"), //6
	R010("TSAP002002 Admin mencari data dengan  tombol enter (green button)"), //6
	R011("TSAP002003 Admin mencari data dengan tombol enter pada keyboard"), //6
	//1, 6, 6, 6
	
	R012("TSAP003001 Admin menyetujui menambahkan data akun admin"),//1
	R013("TSAP003002 Admin tidak menyetujui menambahkan data akun admin"),//1
	//1,1

	R014("TSAP004001 Admin menampilkan10 data admin"),//1
	R015("TSAP004002 Admin menampilkan25 data admin"), //1
	R016("TSAP004003 Admin menampilkan50 data admin"), //1
	R017("TSAP004004 Admin menampilkan100 data admin"),//1
	//1,1,1,1
	
	R018("TSAP005001 Admin menampilkan10 data  admin pada page ke1"),//1
	R019("TSAP005002 Admin menampilkan10 data  admin pada page ke2"),//1
	R020("TSAP005003 Admin menampilkan10 data  admin pada page ke3"), //1
	R021("TSAP005004 Admin menampilkan10 data  admin pada page ke4"),//1
	R022("TSAP005005 Admin menampilkan10 data  admin pada page ke5"),//1
	R023("TSAP005006 Admin menampilkan10 data  admin pada page ke6"),//1
	R024("TSAP005007 Admin menampilkan10 data  admin pada page ke7"),//1
	R025("TSAP005008 Admin menampilkan10 data  admin pada page ke8"),//1
	R026("TSAP005009 Admin menampilkan10 data  admin pada page ke9"),//1
	R027("TSAP005010 Admin menampilkan10 data  admin pada page ke10"),//1
	R028("TSAP005011 Admin menampilkan10 data admin pada page paling awal"), //1
	R029("TSAP005012 Admin menampilkan10 data admin pada page paling terakhir"), //1
	//1,1,1,1,1,1,1,1,1,1,1,1,
	
	R030("TSAP006001 Admin menampilkan25 data admin pada page ke1"), //1
	R031("TSAP006002 Admin menampilkan25 data admin pada page ke2"), //1
	R032("TSAP006003 Admin menampilkan25 data admin pada page ke3"), //1
	R033("TSAP006004 Admin menampilkan25 data admin pada page ke4"), //1
	R034("TSAP006005 Admin menampilkan25 data admin pada page paling awal"), //1
	R035("TSAP006006 Admin menampilkan25 data admin pada page paling terakhir"), //1
	//1,1,1,1,1,1
	
	
	R036("TSAP007001 Admin menampilkan50 data admin pada page ke1"),//1
	R037("TSAP007002 Admin menampilkan50 data admin pada page ke2"), //1
	R038("TSAP007003 Admin menampilkan50 data admin pada page >>"), //1
	R039("TSAP007004 Admin menampilkan50 data admin pada page <<"), //1
	R040("TSAP008001 Admin menampilkan100 data admin pada page ke1"),
	// 1, 1, 1, 1, 1

	R041("TSAP009001 Admin mereset passwod akun admin"),
	R042("TSAP010001 Admin mengubah satu field pada akun admin"), //4
	R043("TSAP010002 Admin mengubah dua field pada akun admin"), //6
	R044("TSAP010003 Admin mengubah tiga field pada akun admin"), //3
	R045("TSAP010004 Admin mengubah semua field pada akun admin"), //1
	//1, 4,6,3,1
	
	R046("TSAP011001 Admin tidak menyetujui edit password"), //3
	R047("TSAP011002 Admin menyetujui edit password"), //3
	R048("TSAP012001 Admin batal menghapus data"),
	R049("TSAP012002 Admin berhasil menghapus data"),
	//3,3, 1,1
	
	R051("TSAPN013001 Admin mencari data dengan tombol search"),
	R052("TSAPN013002 Admin mencari data dengan  tombol enter (green button)"),
	R053("TSAPN013003 Admin mencari data dengan tombol enter pada keyboard"),
	//3,3, 1,1
	
	R054("TSAPN014001 Admin berhasil masuk form tambah data"),//14
	//14
	
	R670("TSLO002001N Admin membatalkan logout dari website"),
	R671("TSLO002002N Admin membatalkan logout dari website"),
	R672("TSLO002002 Admin berhasil logout dari website");
	//1,1,1
	

	
	
	
	private String testName;
	
	private PSIKOTESScene(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	
		}


}
