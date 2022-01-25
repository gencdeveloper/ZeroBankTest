package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // run with cucumber
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html", // for html report where want to use
                "json:target/cucumber.json", // json report with json format. Espacially for the api
                "rerun:target/rerun.txt"//cucumber rerun plugin allows us to store failed tests scenarios in a file
        },
        features = "src/test/resources/features", //feature file directory
        glue = "com/zerobank/stepdefinitions",//provide step defitinions
        dryRun = false,
        tags = "@smoke"// what kind of tags we are running
)

public class CukesRunner {

}