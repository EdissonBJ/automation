package com.example.pruebamatriztest.runners;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/pruebamatriz.feature",
        glue = "com/example/pruebamatriztest/stepdefinitions",
        tags = "@InicioSesion",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class runnerOperation  {


}


