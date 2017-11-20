/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class Boletin10_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        while(1==1){

            int compara = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de oportunidades:"));
            int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
        
            for(int i=0;i<compara;i++){
                int num=Integer.parseInt(JOptionPane.showInputDialog("Adivine el número:"));
                if(num==numero){
                    i=compara;
                    JOptionPane.showMessageDialog(null,"Bien!Lo has conseguido.");
                }
                else if(num>numero){
                    JOptionPane.showMessageDialog(null,"El número introducido es mayor.");
                }
                else if(num<numero){
                    JOptionPane.showMessageDialog(null,"El número introducido es menor.");
                }
                else
                    JOptionPane.showMessageDialog(null,"Inténtelo de nuevo.");
            }
        }        
    }
    
}
