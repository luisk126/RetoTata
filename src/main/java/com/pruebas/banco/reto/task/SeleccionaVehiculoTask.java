package com.pruebas.banco.reto.task;

import com.pruebas.banco.reto.userinterfaces.CreditoConsumoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionaVehiculoTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CreditoConsumoPage.BTN_VEHICULO));
    }
    public static SeleccionaVehiculoTask clickVehiculo (){
        return Tasks.instrumented(SeleccionaVehiculoTask.class);
    }

}
