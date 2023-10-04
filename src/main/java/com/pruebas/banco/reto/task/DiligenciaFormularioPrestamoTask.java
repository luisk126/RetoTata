package com.pruebas.banco.reto.task;

import com.pruebas.banco.reto.userinterfaces.SufiPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;


public class DiligenciaFormularioPrestamoTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(SufiPage.LBL_INFORMACION));
        actor.attemptsTo(Click.on(SufiPage.SEL_CREDITO_COMPRAR));
        actor.attemptsTo(SelectFromOptions.byIndex(0).from(SufiPage.SEL_CREDITO_COMPRAR));
        //actor.attemptsTo(new SendKeysIntoTarget(SufiPage.TXT_VALOR_PRESTAMO,"1200000"));
        actor.attemptsTo(Enter.theValue("1200000").into(SufiPage.TXT_VALOR_PRESTAMO));
        actor.attemptsTo(SelectFromOptions.byVisibleText("36").from(SufiPage.SEL_PLAZO));

        //actor.attemptsTo(Click.on(SufiPage.BTN_SIMULAR_TU_CREDITO));
    }
    public static DiligenciaFormularioPrestamoTask llenarFormulario (){
        return Tasks.instrumented(DiligenciaFormularioPrestamoTask.class);
    }
}
