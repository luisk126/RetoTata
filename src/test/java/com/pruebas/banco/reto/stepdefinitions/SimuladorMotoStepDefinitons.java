package com.pruebas.banco.reto.stepdefinitions;

import com.pruebas.banco.reto.models.FormularioModels;
import com.pruebas.banco.reto.questions.ValidaPersonasExisteQuestions;
import com.pruebas.banco.reto.task.DiligenciaFormularioPrestamoTask;
import com.pruebas.banco.reto.task.SeleccionaModuloSimularCreditoMotoAltoTask;
import com.pruebas.banco.reto.task.SeleccionaVehiculoTask;
import com.pruebas.banco.reto.task.SeleccionarSaberMasTask;
import com.pruebas.banco.reto.userinterfaces.PersonasPage;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class SimuladorMotoStepDefinitons {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User");
    }

    @Dado("que el usuario ingresa a la plataforma de bancolombia al modulo de persona")
    public void queElUsuarioIngresaALaPlataformaDeBancolombiaAlModuloDePersona() {
        theActorInTheSpotlight().attemptsTo(Open.url("https://www.bancolombia.com/personas"));
    }

    @Cuando("ingresa al modulo de persona")
    public void ingresaAlModuloDePersona() {
        theActorInTheSpotlight().should(seeThat(ValidaPersonasExisteQuestions.getText(PersonasPage.LBL_FINANCIA_SUEÑOS), is(PersonasPage.TITLE_FINANCIA_SUEÑOS)));
    }

    @Entonces("valida al modulo de financia tu sueños quieres y necesitas")
    public void validaAlModuloDeFinanciaTuSueñosQuieresYNecesitas() {
        theActorInTheSpotlight().should(seeThat(ValidaPersonasExisteQuestions.getText(PersonasPage.LBL_FINANCIA_SUEÑOS), is(PersonasPage.TITLE_FINANCIA_SUEÑOS)));
    }

    @Cuando("da click en SABER MAS")
    public void daClickEnSABERMAS() {
        theActorInTheSpotlight().attemptsTo(SeleccionarSaberMasTask.clickSaberMas());
    }

    @Cuando("da click en la pestaña vehiculos")
    public void daClickEnLaPestañaVehiculos() {
        theActorInTheSpotlight().attemptsTo(SeleccionaVehiculoTask.clickVehiculo());
    }

    @Cuando("da click en SIMULAR")
    public void daClickEnSIMULAR() {
        theActorInTheSpotlight().attemptsTo(SeleccionaModuloSimularCreditoMotoAltoTask.clickSimular());
    }

    @Cuando("luego diligencia el formulario")
    public void luegoDiligenciaElFormulario() {
        theActorInTheSpotlight().attemptsTo(DiligenciaFormularioPrestamoTask.llenarFormulario());
    }

    @Entonces("valida y extrae los resultados obtenidos")
    public void validaYExtraeLosResultadosObtenidos() {

    }

    @Y("cierra el navegador")
    public void cierraElNavegador() {

    }



}
