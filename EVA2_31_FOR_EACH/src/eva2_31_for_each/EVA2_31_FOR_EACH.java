/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_31_for_each;

/**
 *
 * @author regin
 */
public class EVA2_31_FOR_EACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int[10];
        
        for (int i = 0; i < 10; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
        //FOR EACH --> For especial para arreglos
        // solo funciona para lectura de arreglos
            for (int valor : arreglo) {
                System.out.print("[" + valor + "]");
            }
            System.out.println("");
            String cadenas[] = new String[5];
            cadenas[0] = "Hola";
            cadenas[1] = "";
            cadenas[2] = "Mundo";
            cadenas[3] = "";
            cadenas[4] = "!!";
            
            for (String cadena : cadenas) {
                System.out.println(cadena);
        }
        }
    
    }
    

