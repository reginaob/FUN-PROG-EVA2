/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_ciclo_for_2;

import java.util.Scanner;

/**
 *
 * @author regin
 */
public class EVA2_14_CICLO_FOR_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VAMOS A CAPTURAR CALIFICACION DE UN GRUPO Y GENERAR
        //EL PROMEDIO:
        int noCalifa;
        int sumaCalifas = 0; //cero es el neutro aditivo
                             //1 es el neutro multiplicativo
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero de calificaciones");
        noCalifa = input.nextInt();
        
        for(int i = 0; i < noCalifa; i++){
            System.out.println("Introduce la calificacion: ");
            int califa = input.nextInt();
            //sumatoria de calificaciones:
            //ACUMULADORES
            //sumaCalifas = sumaCalifas + califa;
            sumaCalifas += califa;
        }
        //el promedio es sumaCalifas, pero ambos son enteros
        // y dividir enteros en java da como resultado un entero, sin decimal
        double promedio = sumaCalifas / (noCalifa * 1.0);
        System.out.println("El promedio es " + promedio);    
        }
    }
    

