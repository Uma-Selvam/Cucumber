package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.ReportClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\LoginPage.feature",glue="org.step",
monochrome=true,dryRun=true,snippets=SnippetType.CAMELCASE,
plugin= {"html:target\\HtmlReport",
		"junit:target\\XmlReport.xml",
		"json:target\\JsonReport.json"})

														


public class TestRunnerClass {
	@AfterClass
	public static void tc01()
	{
	ReportClass.generateReport("target\\JsonReport.json");
	}
}
