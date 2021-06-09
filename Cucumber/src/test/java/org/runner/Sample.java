package org.runner;


import org.Base.Base02;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Asus\\eclipse-workspace\\Cucumber\\src\\test\\resources\\cucu.feature",glue="org.stepdef",dryRun=true,monochrome=false,
	plugin= {"json:target/Destination/cucumber.json"})
public class Sample extends Base02{
	@AfterClass
	public static void generatereport() {
		jvmreport("C:\\Users\\Asus\\eclipse-workspace\\Cucumber\\target\\Destination\\cucumber.json");
		
	}
	
}
