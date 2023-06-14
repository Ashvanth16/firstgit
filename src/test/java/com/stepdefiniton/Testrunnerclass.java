package com.stepdefiniton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=
"C:\\Users\\My Pc\\eclipse-workspace\\cucumberpro\\src\\test\\java\\org\\ash\\cucumberpro\\running.feature",
glue="com.stepdefiniton",dryRun=false,monochrome=true
,strict=true,snippets=SnippetType.CAMELCASE,tags= {"@sanity , @smoke"},
plugin= {"pretty","html:Report/cucumber_html","junit:Report\\junitreport.xml","json:Report\\jsonreport.json"})
public class Testrunnerclass {

}
