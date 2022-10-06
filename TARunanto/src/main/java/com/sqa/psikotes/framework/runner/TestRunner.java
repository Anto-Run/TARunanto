package com.sqa.psikotes.framework.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/main/resources/features/001LPLoginValid.feature",
		"src/main/resources/features/051APOpenPageAdminValid.feature",
		"src/main/resources/features/055APSearchDataAdminValid.feature",
		"src/main/resources/features/059APTambahDataAdminValid.feature",
		"src/main/resources/features/063APShowDataAdminValid.feature",
		"src/main/resources/features/067APShow10DataAdminValid.feature",
		"src/main/resources/features/071APShow25DataAdminValid.feature",
		"src/main/resources/features/074APShow50DataAdminValid.feature",
		"src/main/resources/features/077APShow100DataAdminValid.feature",
		"src/main/resources/features/081APResetPasswordValid.feature",
		"src/main/resources/features/084APEditDataAdminValid.feature",
		
		
		"src/main/resources/features/185MPShow10DataValid.feature",
		"src/main/resources/features/188MPShow25DataValid.feature",
		"src/main/resources/features/191MPShow50DataValid.feature",
		"src/main/resources/features/197MPShow100DataValid.feature",
		"src/main/resources/features/227MPEditDataModulValid.feature",
		
		},
glue = "com.sqa.psikotes.framework.runner",
monochrome=true,
plugin = {"pretty","html:target/psikotes/htmlreport/PSIKOTESRunner.html",
		"json:target/psikotes/jsonreport/PSIKOTESRunner.json",
		"junit:target/psikotes/junitreport/PSIKOTESRunner.xml"})


public class TestRunner extends AbstractTestNGCucumberTests {

}
