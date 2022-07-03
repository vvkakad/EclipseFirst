package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/java/com/features",
		glue="com.stepdefs",
		dryRun=false, // this is use to compile feature file
		monochrome= true,// this is use for output
		tags= "@vvk", //will run only those scenarios which have given tags.
					  // if having more than one tag the write as {"@tag1 , @tag2"}
					  //if we want any particular test case should not run than use {"~@tag"}
					  // ~ this symbol called "tilled".
		plugin= {"html:target"}// this is use for report generation
		
		)

public class TestRunner {

}
