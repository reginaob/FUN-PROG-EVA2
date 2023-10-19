/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_if_aninado;

import java.util.Scanner;

/**
 *
 * @author regin
 */
public class EVA2_2_IF_ANINADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor1, valor2;
        Scanner input = new Scanner(System.in);
        
        System.out.println("valor1");
        valor1 = input.nextInt();
        System.out.println("valor2");
        valor2 = input.nextInt();
        
        //> Operador
        if(valor1 > valor2)//VERDAD               //concatenar
            System.out.println("El valor más grande es " + valor1);
        else{//falso,el valor1 no es mas grande que el valor 2
            //if anidado: un if dentro de otro if
            // = es asignacion
            // == ES COMPARACION
            
            if(valor1 == valor2) //VERDAD
                System.out.println("Ambos valores son iguales");
            else
                System.out.println("El valor más pequeño es " + valor1);
        }
    }
    
}
