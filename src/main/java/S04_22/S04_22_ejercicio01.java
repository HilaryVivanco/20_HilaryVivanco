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
public class S04_22_ejercicio01 {

    public static void main(String[] args) {
        
        int numero = (int)Math.random()*5;
        System.out.println("el numero aleatorio es" + numero); 
        int numeroUsuario = 0;
        
        do {
            numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
            if (numeroUsuario == numero) {
                System.out.println("Felicidades adivinaste el numero");
            } else {
                System.out.println("Numero incorrecto");
            }
        }while (numero != numeroUsuario);
        // TODO code application logic here
    }
    
}
