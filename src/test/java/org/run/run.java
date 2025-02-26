package org.run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
glue = "org.run",
dryRun = false,
monochrome = true,
strict = true,
snippets = SnippetType.UNDERSCORE,
plugin =  {"html:report","junit:report\\junitreport.xml","json:report\\jsonreport.json"}
			)

public class run {

}
