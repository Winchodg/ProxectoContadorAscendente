/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proxectocontadorascendente;

/**
 *
 * @author Wences
 */
public class ContadorAscendente {

    private int valorActual;

    /**
     * @return valorActual
     */
    public int getValorActual() {
        return valorActual;
    }

    /**
     * @param valorActual set valorActual
     */
    public void setValorActual(int valorActual) {
        this.valorActual = valorActual;
    }

    public int incrementar() {
        if (this.valorActual < 1000) {
            this.valorActual++;
        } else {
            this.valorActual = 1000;
        }
        return this.valorActual;
    }

    public void reiniciar() {
        this.valorActual = 0;
    }

}
