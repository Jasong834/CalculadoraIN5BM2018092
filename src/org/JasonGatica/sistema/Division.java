/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.JasonGatica.sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author programacion
 */
public class Division {
    double valor1;
    double valor2;

    public Division(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
    
    public double dividir(double valor1,double valor2){
  
        return  valor1/valor2;
    }
}
