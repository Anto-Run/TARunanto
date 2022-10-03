/*
 * Author : Runanto
 * Created-date: 29/09/2022 13.00
 * Modifier: Runanto
 * Modified_date : 02/10/2022 21.00
 */


package com.sqa.psikotes.framework.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sqa.psikotes.framework.connection.DriverSingleton;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.utils.Utils;

public class AdminPage extends LoginPage{

	
	private WebDriver driver;
	public AdminPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Button
	@FindBy(xpath="//h3[@id='ui-id-7']")
	private WebElement btnUserManagement;
	
	@FindBy(xpath="//span[normalize-space()='Admin']")
	private WebElement btnAdmin;
	
	@FindBy(xpath="//img[@id='tl_user_management--51690_finder']")
	private WebElement btnGreenSearch;
	
	@FindBy(xpath="//span[normalize-space()='Search']")
	private WebElement btnSearch;
	
	@FindBy(xpath="//span[normalize-space()='Add']")
	private WebElement btnAdd;
	
	@FindBy(xpath="//button[@id='51742_query']/span")
	private WebElement btnSaveData;
	
	@FindBy(xpath="(.//*[normalize-space(text()) and normalize-space(.)='No'])[2]/following::span[1]")
	private WebElement btnYes;
	
	@FindBy(xpath="(.//*[normalize-space(text()) and normalize-space(.)='Close'])[1]/following::span[2]")
	private WebElement btnNo;
	
	//btn page
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[3]/div[1]/div[4]/ul[1]/li[1]/a[1]")
	private WebElement btnPrev;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[3]/div[1]/div[4]/ul[1]/li[8]/a[1]")
	private WebElement btnProv;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[3]/div[1]/div[4]/ul[1]/li[2]/a[1]")
	private WebElement btnPOne;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[3]/div[1]/div[4]/ul[1]/li[3]/a[1]")
	private WebElement btnPTwo;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[3]/div[1]/div[4]/ul[1]/li[4]/a[1]")
	private WebElement btnPThree;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[3]/div[1]/div[4]/ul[1]/li[5]/a[1]")
	private WebElement btnPFour;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[3]/div[1]/div[4]/ul[1]/li[6]/a[1]")
	private WebElement btnPFive;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[3]/div[1]/div[4]/ul[1]/li[7]/a[1]")
	private WebElement btnSix;
	
	

	
	
	//Insert
	@FindBy(xpath="//input[@id='tl_user_management--51690_text']")
	private WebElement insertSearch;
	
	//txt Add data
	@FindBy(id="tl_agent_editable-14-51730_text")
	private WebElement txtAddFullName;
	
	@FindBy(id="tl_agent_editable-14-51736_text")
	private WebElement txtAddTelephone;
	
	@FindBy(id="tl_agent_editable-14-51740_text")
	private WebElement txtAddUsername;
	
	@FindBy(id="tl_agent_editable-14-51741_text")
	private WebElement txtAddPassword;
	
	
	//Dropdown
	
	@FindBy(id="tl_agent_editable-14-51731_text")
	private WebElement btnDropPrivileges;

	
	@FindBy(xpath="tl_agent_editable-14-51733_text")
	private WebElement btnDropSupervisor;
	
	
	//Select
	@FindBy(xpath="//select[@id='tl_agent_editable-14-51731_text']")
	private WebElement selectPrivileges;	
	
	@FindBy(xpath="//select[@id='tl_agent_editable-14-51733_text']")
	private WebElement selectSupervisor;
	
	@FindBy(xpath="//select[@id='tl_user_management--51688_show_text']")
	private WebElement selectShowPage;
	
	//Validation (txt)
	@FindBy(xpath="//input[@id='tl_user_management--51695_text']")
	private WebElement txtUserManagement;

	@FindBy(xpath="//td[@id='tl_user_management--51688-cell-0-2']")
	private WebElement txtUsername;
	
	@FindBy(xpath="//td[@id='tl_user_management--51688-cell-0-3']")
	private WebElement txtFullName;
	
	@FindBy(xpath="//td[@id='tl_user_management--51688-cell-0-4']")
	private WebElement txtPrivileges;
	
	@FindBy(xpath="//td[@id='tl_user_management--51688-cell-0-5']")
	private WebElement txtSupervisor;
	
	@FindBy(xpath="//td[@id='tl_user_management--51688-cell-0-6']")
	private WebElement txtTelephone;
	
	@FindBy(xpath="//td[@id='tl_user_management--51688-cell-0-8']")
	private WebElement txtUserActive;
	
	
	@FindBy(xpath="//th[normalize-space()='User Name']")
	private WebElement txtNotFound;
	
	//Validation (button)
	@FindBy(xpath="//td[@id='tl_user_management--51688-cell-0-0']")
	private WebElement btnDataOne;
	
	@FindBy(xpath="//td[@id='tl_user_management--51688-cell-9-0']")
	private WebElement btnDataTen;
	
	@FindBy(xpath="//td[@id='tl_user_management--51688-cell-24-0']")
	private WebElement btnDataTwentyFive;
	
	@FindBy(xpath="//td[@id='tl_user_management--51688-cell-49-0']")
	private WebElement btnDataFifty;
	
	@FindBy(xpath="//td[@id='tl_user_management--51688-cell-99-0']")
	private WebElement btnDataOneHundred;

	//Method
	public void adminPage() {
		btnUserManagement.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnAdmin.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);	
	}
	
	public void searchDataAdmin(String strSearch) {
		this.insertSearch.sendKeys(strSearch);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		
	}
	
	public void addDataAdmin(String fullName, String telephone, String username, String password) {
		this.txtAddFullName.sendKeys(fullName);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		selectPrivileges.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	    new Select(selectPrivileges).selectByVisibleText("Admin");
		selectPrivileges.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		selectSupervisor.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(selectSupervisor).selectByVisibleText("DEVELOPER (DEVELOPER)");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		selectSupervisor.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.txtAddTelephone.sendKeys(telephone);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.txtAddUsername.sendKeys(username);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.txtAddPassword.sendKeys(password);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	
	//Click method
	public void clickBtnUserManagement() {
		btnUserManagement.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		
	}
	
	public void clickBtnAdmin() {
		btnAdmin.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickInSearch() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		insertSearch.click();
	}
	
	public void clickBtnSearch() {
		btnSearch.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		
	}
	
	public void clikBtnGreenSearch() {
		btnGreenSearch.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	
	}
	
	public void clickEnterKeyboard() {
		this.insertSearch.sendKeys(Keys.ENTER);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		
	}
	public void clickBtnAdd(){
		btnAdd.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		
	}
	
	public void clickBtnSaveData() {
		btnSaveData.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickFullName(String fullname) {
		this.txtAddFullName.clear();
		this.txtAddFullName.sendKeys(fullname);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
//	public void clickPrivileges() {
//		btnDropPrivileges.click();
//		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//		selectPrivileges.click();
//		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//	}
//	
//	public void clickSupervisor() {
//		btnDropSupervisor.click();
//		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//		selectSupervisor.click();
//		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//	}
	
	public void clickTelephone(String telephone) {
		this.txtAddTelephone.clear();
		this.txtAddTelephone.sendKeys(telephone);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickUsername(String username) {
		this.txtAddUsername.clear();
		this.txtAddUsername.sendKeys(username);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickPassword(String password) {
		this.txtAddPassword.clear();
		this.txtAddPassword.sendKeys(password);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnYes() {
		btnYes.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnNo() {
		btnNo.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	//select
	public void selectShowPageTen() {
		selectShowPage.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(selectShowPage).selectByVisibleText("10");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		selectShowPage.click();
		
	}
	
	public void selectShowPageTwentyFive() {
		selectShowPage.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(selectShowPage).selectByVisibleText("25");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		selectShowPage.click();
	}
	
	public void selectShowPageFifty() {
		selectShowPage.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(selectShowPage).selectByVisibleText("50");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		selectShowPage.click();
		
	}
	
	public void selectShowPageOneHundred() {
		selectShowPage.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(selectShowPage).selectByVisibleText("100");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		selectShowPage.click();
		
	}
	
	
	//get method
	public String getTxtUserManagement() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtUserManagement);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		return txtUserManagement.getAttribute("value");
	}
	
	public String getTxtUsername() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtUsername);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtUsername);
		return txtUsername.getText();
	}
	
	public String getTxtFullName() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtFullName);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtFullName);
		return txtFullName.getText();
	}
	
	public String getTxtPrivileges() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtPrivileges);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtPrivileges);
		return txtPrivileges.getText();
	}
	
	public String getTxSupervisor() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtSupervisor);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtSupervisor);
		return txtSupervisor.getText();
	}
	
	public String getTxtTelephone() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtTelephone);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtTelephone);
		return txtTelephone.getText();
	}
	
	public String getTxtUserActive() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtUserActive);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtUserActive);
		return txtUserActive.getText();
	}
	
	public String getTxtNotFound() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtNotFound);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtNotFound+"Data tidak ditemukan");
		return txtNotFound.getText();
	}
	
	public boolean getBtnDataOne() {
		boolean isData = false;
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, btnDataOne);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		int intData = Integer.parseInt(btnDataOne.getText());
		if(intData == 1) {
			return isData = true;
		}else if(intData == 11) {
			return isData = true;
		}else if (intData == 21) {
			return isData = true;
		}
		else if (intData == 31) {
			return isData = true;
		}else if (intData == 41) {
			return isData = true;
		}
		else if (intData == 51) {
			return isData = true;
		}else if (intData == 61) {
			return isData = true;
		}else if (intData == 71) {
			return isData = true;
		}else if (intData == 81) {
			return isData = true;
		}else if (intData == 91) {
			return isData = true;
		}
		else if (intData == 26) {
			return isData = true;
		}else if (intData == 51) {
			return isData = true;
		}else if (intData == 76) {
			return isData = true;
		}else {
			return isData;
		}
	}
	
	public boolean getBtnDataTen() {
		boolean isData = false;
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, btnDataTen);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		int intData = Integer.parseInt(btnDataTen.getText());
		if(intData == 10) {
			return isData = true;
		}else if(intData == 20) {
			return isData = true;
		}else if (intData == 30) {
			return isData == true;
		}
		else if (intData == 40) {
			return isData = true;
		}else if (intData == 50) {
			return isData = true;
		}
		else if (intData == 60) {
			return isData = true;
		}else if (intData == 70) {
			return isData = true;
		}else if (intData == 80) {
			return isData = true;
		}else if (intData == 90) {
			return isData = true;
		}else if (intData == 100) {
			return isData = true;
		}else if (intData >100) {
			return isData = true;
		}else {
			return isData;
		}
	}
	
	public boolean getBtnDataTwentyFive() {
		boolean isData = false;
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, btnDataTwentyFive);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		int intData = Integer.parseInt(btnDataTwentyFive.getText());
		if(intData == 25) {
			return isData = true;
		}else if(intData == 50) {
			return isData = true;
		}else if (intData == 75) {
			return isData == true;
		}else if (intData == 100) {
			return isData == true;
		}else if (intData > 100) {
			return isData == true;
		}else {
			return isData;
		}
	}
	
	public boolean getBtnDataFifty() {
		boolean isData = false;
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, btnDataFifty);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		int intData = Integer.parseInt(btnDataFifty.getText());
		if(intData == 50) {
			return isData = true;
		}else if(intData == 100) {
			return isData = true;
		}else if (intData > 150) {
			return isData == true;
		}else {
			return isData;
		}
	}
	
	public boolean getBtnDataOneHundred() {
		boolean isData = false;
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, btnDataOneHundred);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		int intData = Integer.parseInt(btnDataOneHundred.getText());
		if(intData == 100) {
			return isData = true;
		}else if (intData > 100) {
			return isData == true;
		}else {
			return isData;
		}
	}
	
}
