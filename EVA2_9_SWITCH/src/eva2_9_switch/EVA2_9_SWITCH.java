/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_switch;

import java.util.Scanner;

/**
 *
 * @author regin
 */
public class EVA2_9_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int mes;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el número del mes: ");
        mes = input.nextInt();
        
        switch(mes){
            case 1:
                System.out.println("ENERO");
                break;
            case 2:
                System.out.println("FEBRERO");
                break;
            case 3:
                System.out.println("MARZO");
                break;
            case 4:
                System.out.println("MAYO");
                break;
            case 5:
                System.out.println("ABRIL");
                break;
            case 6:
                System.out.println("JUNIO");
                break;
            case 7:
                System.out.println("JULIO");
                break;
            case 8:
                System.out.println("AGOSTO");
                break;
            case 9:
                System.out.println("SEPTIEMBRE");
                break;
            case 10:
                System.out.println("OCTUBRE");
                break;
            case 11:
                System.out.println("NOVIEMBRE");
                break;
            case 12:
                System.out.println("DICIEMBRE");
                System.out.println("Mi cumple");
                break;
            default://SIEMPRE ES LA ULTIMA INSTRUCCION (PERO ES OPCIONA)
                System.out.println("El número de mes no es válido");
        }
    }
    
}
