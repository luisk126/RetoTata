package com.pruebas.banco.reto.task;

import com.pruebas.banco.reto.userinterfaces.PersonasPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;


public class SeleccionarSaberMasTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        if (false)
        {
            actor.attemptsTo(MoveMouse.to(PersonasPage.MODAL_AGUA_CERRAR),
                    Click.on(PersonasPage.MODAL_AGUA_CERRAR)
            );
        }

        actor.attemptsTo(
                Scroll.to(PersonasPage.BTN_SABER_MAS),
        Click.on(PersonasPage.BTN_SABER_MAS));
    }
    public static SeleccionarSaberMasTask clickSaberMas (){
        return Tasks.instrumented(SeleccionarSaberMasTask.class);
    }

}
