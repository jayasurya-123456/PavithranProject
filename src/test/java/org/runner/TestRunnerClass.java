package org.runner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Feature\\ibps.feature",
		glue = "org.stepdefinition",
		dryRun = false,
		monochrome = true,
		plugin= {"html:target\\Reports",
				"junit:target\\Reports\\cucumber.xml",
				"json:target\\Reports\\output.json"}
		
		)
public class TestRunnerClass {
	@AfterClass
	public static void report() {
		JvmReport.generateJvmreport((System.getProperty("user.dir"))+"\\target\\Reports\\output.json");
	}
}
