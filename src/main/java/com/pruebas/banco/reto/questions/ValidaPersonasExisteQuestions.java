package com.pruebas.banco.reto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidaPersonasExisteQuestions implements Question<String> {

    private Target target;

    public ValidaPersonasExisteQuestions(Target target) {
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(target).viewedBy(actor).asString();
    }
    public static ValidaPersonasExisteQuestions getText (Target target){
        return new ValidaPersonasExisteQuestions(target);
    }

}
