package com.pruebas.banco.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import net.thucydides.core.pages.PageObject;


public class CreditoVehiculoPage extends PageObject {

    public static final Target LBL_CREDITOS_VEHICULO = Target.the("lbl_creditos_vehiculo").located(By.xpath("//h2[contains(text(),'Créditos para moto')]"));
        public static final Target LBL_CREDITOS_MOTO = Target.the("lbl_creditos_moto").located(By.xpath("//h2[contains(text(),'Créditos para moto')]"));
        public static final Target BTN_SIMULAR_MOTO = Target.the("btn_simular_moto_alto").locatedBy("#creditos .row:nth-of-type(2) [class='col-lg-6 col-xl-4 swiper-slide d-flex align-items-stretch']:nth-of-type(1) .link-simular");
        public static final String TITLE_CREDITOS_MOTO = "Créditos para moto";
}
