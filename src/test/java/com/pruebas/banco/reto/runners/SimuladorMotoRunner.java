package com.pruebas.banco.reto.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        //tags = {"@CotizacionCreditoMotoAlto"},
        glue = {"com.pruebas.banco.reto.stepdefinitions","com.pruebas.banco.reto.utils"},
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class SimuladorMotoRunner
{
}
