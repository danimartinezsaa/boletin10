/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_2;

import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class Boletin10_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        while(1==1){
     
            String intentos=JOptionPane.showInputDialog("Ingrese número de oportunidades:");
            int compara = Integer.parseInt(intentos);
            int u=0;
            int numero = (int) (Math.random() * 50) + 1;
        
            for(int i=0;i<compara;i++){
                
                String num2=JOptionPane.showInputDialog("Adivine el número:");
                int num22=Integer.parseInt(num2);
                
                if(num22==numero){
                    i=compara;
                    JOptionPane.showMessageDialog(null,"Bien!Lo has conseguido.");
                    u=1;
                }
                else if((num22-20)>numero || (num22+20)<numero){
                    JOptionPane.showMessageDialog(null,"Muy lejos.");
                }
                else if(((num22-20)<=numero && (num22-10)>=numero)||((num22+20)>=numero && (num22+10)<=numero)){
                    JOptionPane.showMessageDialog(null,"Cerca.");
                }
                else if(((num22-10)<numero && (num22-5)>=numero)||((num22+10)>=numero && (num22+5)<numero)){
                    JOptionPane.showMessageDialog(null,"Cerca.");
                }
                else if(((num22-5)<numero||(num22+5)>numero)){
                    JOptionPane.showMessageDialog(null,"Muy Cerca.");
                }
                else
                    JOptionPane.showMessageDialog(null,"Inténtelo de nuevo.");
            }
            
            if(u==0)
                JOptionPane.showMessageDialog(null, "Número de intentos excedidos");
        }        
    }
}