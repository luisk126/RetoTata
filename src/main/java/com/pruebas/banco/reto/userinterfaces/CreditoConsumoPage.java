package com.pruebas.banco.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CreditoConsumoPage extends PageObject {
    public static final Target LBL_CREDITO_CONSUMO = Target.the("lbl_credito_consumo").located(By.xpath("//h1[contains(text(),'Créditos de consumo')]"));
    public static final Target BTN_VEHICULO = Target.the("btn_vehiculo").locatedBy("//a[@id='tab-categoria-vehiculo']");
    public static final String TITLE_CREDITO_CONSUMO = "Créditos de consumo";
}
