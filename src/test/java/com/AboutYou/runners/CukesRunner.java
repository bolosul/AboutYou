package com.AboutYou.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
        "html:target/default-htmlreports",
        "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/AboutYou/step_definition",
        dryRun =true,
        tags = "@prog"


)
public class CukesRunner {



}
