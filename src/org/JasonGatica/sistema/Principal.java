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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Sumar suma = new Sumar(0,0);
       Restar resta = new Restar(0,0);
       Multiplicacion multiplica = new Multiplicacion(0,0);
       Division dividir = new Division(0,0);
       int opcion ;
       double resultado;
       
       
       
       JOptionPane.showMessageDialog(null,"Operaciones Aritmeticas");
       
        do{
       opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija su opcion\n"
       +"1)Suma\n"
       +"2)Resta\n"
       +"3)Multiplicacion\n"
       +"4)Division\n"));
       switch (opcion){
      
        case 1:
            suma.valor1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor "));
            suma.valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor "));
            JOptionPane.showMessageDialog(null,"Total de la sumatoria" + " " + suma.sumatoria(suma.valor1,suma.valor2));
        break;
        
        case 2:
           resta.valor1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor "));
           resta.valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor "));
           JOptionPane.showMessageDialog(null,"El resultado es" + " " +resta.resta(resta.valor1,resta.valor2));
        break;
        
        case 3:
           multiplica.valor1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor "));
           multiplica.valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor "));
           JOptionPane.showMessageDialog(null,"El resultado es" + " " +multiplica.multiplicar(multiplica.valor1,multiplica.valor2));
        break;
        
        case 4:
           dividir.valor1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor "));
           dividir.valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor "));
           if(dividir.valor2 !=0){
              resultado = dividir.dividir (dividir.valor1,dividir.valor2);
              JOptionPane.showMessageDialog(null,"El resultado es" + " " + resultado);
           }else {
               JOptionPane.showMessageDialog(null,"No se puede divivir entre 0");
           }
        break;
         }
       opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Desea continuar?\n"
       +"1)Si\n"
       +"2)No\n"));
      }while(opcion !=2);
    }
}