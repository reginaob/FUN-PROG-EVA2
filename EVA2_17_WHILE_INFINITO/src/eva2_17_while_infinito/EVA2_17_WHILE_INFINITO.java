/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_while_infinito;

import java.util.Scanner;

/**
 *
 * @author regin
 */
public class EVA2_17_WHILE_INFINITO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 100;
        Scanner input = new Scanner (System.in);
        while(true){
            System.out.println("Introduce el número que piensas es el correcto");
            int num = input.nextInt();
            if(num == valor){
                System.out.println("Adivinaste!!");
                break;//aqui termina el while
                
            
            }
        }
    }
    
}
