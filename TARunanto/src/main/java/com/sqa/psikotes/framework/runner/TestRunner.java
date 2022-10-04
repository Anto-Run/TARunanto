package com.sqa.psikotes.framework.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/main/resources/features/001LPLoginValid.feature",
		"src/main/resources/features/051APOpenPageAdminValid.feature",
//		"src/main/resources/features/055APSearchDataAdminValid.feature",
//		//"src/main/resources/features/059APTambahDataAdminValid.feature",
//		"src/main/resources/features/063APShowDataAdminValid.feature",
//		"src/main/resources/features/067APShow10DataAdminValid.feature",
//		"src/main/resources/features/071APShow25DataAdminValid.feature",
//		"src/main/resources/features/074APShow50DataAdminValid.feature",
		"src/main/resources/features/077APResetPassword.feature"
		},
glue = "com.sqa.psikotes.framework.runner",
monochrome=true,
plugin = {"pretty","html:target/psikotes/htmlreport/PSIKOTESRunner.html",
		"json:target/psikotes/jsonreport/PSIKOTESRunner.json",
		"junit:target/psikotes/junitreport/PSIKOTESRunner.xml"})


public class TestRunner extends AbstractTestNGCucumberTests {

}
