/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_modulo;

import java.util.Scanner;

/**
 *
 * @author regin
 */
public class EVA2_3_MODULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int valor, residuo;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el valor");
        valor = input.nextInt();
        
        residuo = valor % 2; // % operador de modulo --> residuo
        if(residuo == 0) //VALOR ES PAR
            System.out.println("EL VALOR ES PAR");
        else
            System.out.println("EL VALOR ES IMPAR");
    }
    
}
