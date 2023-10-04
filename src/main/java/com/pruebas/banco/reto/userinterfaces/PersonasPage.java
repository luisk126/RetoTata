package com.pruebas.banco.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PersonasPage extends PageObject {

    public static final Target MODAL_AGUA_CERRAR = Target.the("modal_agua_cerrar").located(By.xpath("//*[@id='close-modal-btn']"));
    public static final Target LBL_FINANCIA_SUEÑOS = Target.the("lbl_financia_sueños").located(By.xpath("//h3[contains(text(),'Financia lo que sueñas, quieres y necesitas.')]"));
    public static final Target BTN_SABER_MAS = Target.the("btn_saber_mas").locatedBy("[href='\\/personas\\/creditos\\/consumo']");
    public static final String TITLE_FINANCIA_SUEÑOS = "Financia lo que sueñas, quieres y necesitas.";

}
