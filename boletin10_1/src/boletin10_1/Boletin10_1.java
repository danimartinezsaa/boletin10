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
     
            String num=JOptionPane.showInputDialog("Ingrese un numero:");
            String intentos=JOptionPane.showInputDialog("Ingrese número de oportunidades:");
            int compara = Integer.parseInt(intentos);
            int numero=Integer.parseInt(num);
        
        
        
            for(int i=0;i<compara;i++){
                String num2=JOptionPane.showInputDialog("Adivine el número:");
                int num22=Integer.parseInt(num2);
                if(num22==numero){
                    i=compara;
                    JOptionPane.showMessageDialog(null,"Bien!Lo has conseguido.");
                }
                else if(num22>numero){
                    JOptionPane.showMessageDialog(null,"El número introducido es mayor.");
                }
                else if(num22<numero){
                    JOptionPane.showMessageDialog(null,"El número introducido es menor.");
                }
                else
                    JOptionPane.showMessageDialog(null,"Inténtelo de nuevo.");
            }
        }        
    }
    
}
