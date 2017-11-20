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
                
                int num=Integer.parseInt(JOptionPane.showInputDialog("Adivine el número:"));
                
                if(num==numero){
                    i=compara;
                    JOptionPane.showMessageDialog(null,"Bien!Lo has conseguido.");
                    u=1;
                }
                else if((num-20)>numero || (num+20)<numero){
                    JOptionPane.showMessageDialog(null,"Muy lejos.");
                }
                else if(((num-20)<=numero && (num-10)>=numero)||((num+20)>=numero && (num+10)<=numero)){
                    JOptionPane.showMessageDialog(null,"Cerca.");
                }
                else if(((num-10)<numero && (num-5)>=numero)||((num+10)>=numero && (num+5)<numero)){
                    JOptionPane.showMessageDialog(null,"Cerca.");
                }
                else if(((num-5)<numero||(num+5)>numero)){
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