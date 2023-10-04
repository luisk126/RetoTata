package com.pruebas.banco.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ResultadoCoutaPage extends PageObject {
    public static final Target LBL_POSIBLE_COUTA = Target.the("lbl_posible_couta").located(By.xpath(""));
    public static final Target LBL_RESULTADO_COUTA = Target.the("lbl_resultado_couta").located(By.xpath("')]"));
    public static final Target LBL_RESULTADO_COUTA_MENSUAL = Target.the("lbl_resultado_couta_mensual").locatedBy("[class] [class='col-xs-12 val']:nth-of-type(2) .val-number");
    public static final Target LBL_RESULTADO_SEGURO_VIDA = Target.the("lbl_resultado_seguro_vida").locatedBy("[class] [class='col-xs-12 val']:nth-of-type(2) .val-number");
    public static final Target LBL_RESULTADO_TOTAL_COUTA = Target.the("lbl_total_couta").locatedBy("div:nth-of-type(3) > .cntInfo.col-xs-6.text-right > p > .ng-binding.val-number");
    public static final String TITLE_POSIBLE_COUTA = "Esta sería tu posible cuota";
    public static final String TITLE_RESULTADO_COUTA = "Crédito de consumo";
}
