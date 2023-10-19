/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_tallas;

import java.util.Scanner;

/**
 *
 * @author regin
 */
public class EVA2_11_TALLAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int talla;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa una talla");
        talla = input.nextInt();
        
         switch(talla){
            case 28:
                System.out.println("Small");
                break;
            case 42:
                System.out.println("medium");
                break;
            case 44:
                System.out.println("Large");
                break;
            case 48:
                System.out.println("Xlarge");
                break;
            default:
                System.out.println("La talla no es valida");
        
        
        
        
       
         }
        
    }
    
}
