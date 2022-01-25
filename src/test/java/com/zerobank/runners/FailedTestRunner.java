package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/failed-html-report"},// failed reporting as a html type inside to target file
        features = "@target/rerun.txt",//cucumber rerun plugin allows us to store failed tests scenarios in a file
        glue = "com/zerobank/stepdefinitions"

)
public class FailedTestRunner {
}
