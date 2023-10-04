package com.pruebas.banco.reto.task;

import com.pruebas.banco.reto.userinterfaces.CreditoConsumoPage;
import com.pruebas.banco.reto.userinterfaces.CreditoVehiculoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class SeleccionaModuloSimularCreditoMotoAltoTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CreditoVehiculoPage.LBL_CREDITOS_MOTO),
                Click.on(CreditoVehiculoPage.BTN_SIMULAR_MOTO));
    }
    public static SeleccionaModuloSimularCreditoMotoAltoTask clickSimular (){
        return Tasks.instrumented(SeleccionaModuloSimularCreditoMotoAltoTask.class);
    }
}
