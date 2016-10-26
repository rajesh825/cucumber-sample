package com.test.tempconverter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by z608174 on 26/10/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/cucumber-htmlreport","json: cucumber-html-reports/cucumber.json"},
        features="src/test/resources",
        glue= "com.test.tempconverter.step")

public class RunCukesTest {
}
