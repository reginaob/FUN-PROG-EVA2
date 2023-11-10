/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_busqueda_arreglos;

import java.util.Scanner;

/**
 *
 * @author regin
 */
public class EVA2_27_BUSQUEDA_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CREAR UN ARREGLO DE 15 ELEMENTOS
        //LLENARLO DE ARREGLOS ALEATORIOS
        int[] arreglo = new int[15];
        //llenarlo con valores aleatorios entre 0 y 99
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
            
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
         int num;
        Scanner input = new Scanner(System.in);
        System.out.println("¿Que numero buscas");
        num = input.nextInt();
        //BÚSAQUEDA SECUENCIAL (por fuerza bruta)
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] == num)//Valor encontrado
                System.out.println("Valor encontrado en la posicion " + i);
            break;
            
        }
    }
}

