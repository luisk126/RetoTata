package com.pruebas.banco.reto.models;

public class FormularioModels {

    private String quieresComprar;
    private String cuantoPrestamo;
    private String coutasCredito;


    public String getQuieresComprar() {
        return quieresComprar;
    }

    public String getCuantoPrestamo() {
        return cuantoPrestamo;
    }

    public String getCoutasCredito() {
        return coutasCredito;
    }

    public FormularioModels(String quieresComprar, String cuantoPrestamo, String coutasCredito) {
        this.quieresComprar = quieresComprar;
        this.cuantoPrestamo = cuantoPrestamo;
        this.coutasCredito = coutasCredito;
    }

}
