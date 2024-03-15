/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package S04_22;

import javax.swing.JOptionPane;

/**
 *
 * @author Hilary
 */
public class S04_22_ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroHoras = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tus numero de horas"));
        
        if(numeroHoras > 8){
            System.out.println("Trabajaste mas de 8 horas");
            int horasExtras = numeroHoras - 8;
            int sueldoTotal = 80 + ( horasExtras * 10);
            System.out.println("Tus horas extras son : " + horasExtras);
            System.out.println("tu sueldo extra es: " + horasExtras * 10);
            System.out.println("tu sueldo es: " + sueldoTotal);
        }else{
            System.out.println("tu sueldo es: " + numeroHoras + 10);
        }
        // TODO code application logic here
    }
    
}
