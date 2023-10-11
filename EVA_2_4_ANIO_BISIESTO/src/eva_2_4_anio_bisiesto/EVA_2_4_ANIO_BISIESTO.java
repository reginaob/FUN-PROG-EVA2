/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_2_4_anio_bisiesto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA_2_4_ANIO_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year, residuo;
        
        Scanner input = new Scanner(System.in); 
        System.out.println("Introduce el año");
        year = input.nextInt();
        //Verificar si es divisible entre 4
        residuo = year % 4;
        
        if(residuo == 0){ //divisible entre 4, no es garantia de que es año bisiesto
            residuo = year % 100;
            if(residuo > 0)//si no es divisible entre 100 es bisiesto
                System.out.println("Si es año bisiesto");
            else{
                residuo = year % 400;
                if(residuo == 0)
                    System.out.println("si es año bisiesto ");
                else
                    System.out.println("No es año bisiesto");
            
            }
            
        }else 
            System.out.println("No es año bisiesto");
        
        
            
         
       
        
    }
    
}
