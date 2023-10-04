package com.pruebas.banco.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import net.thucydides.core.pages.PageObject;

public class SufiPage extends PageObject {

        public static final Target LBL_INFORMACION = Target.the("lbl_informacion").located(By.xpath("//label[contains(text(),'¿Qué quieres comprar con este crédito?')]"));
        public static final Target LBL_IMG_SUFI = Target.the("lbl_img_sufi").located(By.xpath("//header/div[2]/nav[1]/ul[1]/li[1]/a[1]/img[1]"));
        public static final Target SEL_CREDITO_COMPRAR = Target.the("sel_credito_comprar").located(By.xpath("//select[@name='tipoCredito']"));
        public static final Target TXT_VALOR_PRESTAMO = Target.the("txt_valor_prestamo").located(By.xpath("//input[@name='valorSolicitado']"));
        public static final Target SEL_PLAZO = Target.the("sel_plazo").located(By.xpath("//select[@name='plazo']"));
        public static final Target BTN_SIMULAR_TU_CREDITO = Target.the("btn_tu_simular").located(By.xpath("//button[@id='btnSubmit']"));
}
