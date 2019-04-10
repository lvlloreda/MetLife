package com.qvision.metlife.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com/qvision/metlife/features", glue = "com.qvision.metlife.stepsdefinitions", snippets = SnippetType.CAMELCASE)
public class ExpedicionPolizasGspRunner {

}
