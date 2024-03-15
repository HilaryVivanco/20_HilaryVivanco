/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package S04_22;

/**
 *
 * @author Hilary
 */
import javax.swing.JOptionPane;
public class S04_22_ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Introduce el primer número:");
        double num1 = Double.parseDouble(input1);
        String input2 = JOptionPane.showInputDialog("Introduce el segundo número:");
        double num2 = Double.parseDouble(input2);

        if (num1 % 2 == 0) {
            System.out.println(num1 + " es par.");
        } else {
            System.out.println(num1 + " es impar.");
        }

        if (num2 % 2 == 0) {
            System.out.println(num2 + " es par.");
        } else {
            System.out.println(num2 + " es impar.");
        }
        // TODO code application logic here
    }
    
}
