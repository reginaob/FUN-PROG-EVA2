/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_leap_year;

import java.util.Scanner;

/**
 *
 * @author regin
 */
public class EVA2_7_LEAP_YEAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int year, resi4, resi100, resi400;
        
        System.out.println("Introduce el año");
        year = input.nextInt();
        
        resi4 = year % 4; //residuo de dividir al año entre 4
        resi100 = year % 100; //residuo de dividir al año entre 100
        resi400 = year % 400; //residuo de dividir al año entre 400
        // ! = diferente
       
        if ((resi4 == 0) && ((resi100 != 0) || (resi400 == 0))){
            System.out.println("El año " + year + " Es bisiesto ");
        
        }else
            System.out.println("El año" + year + " NO es bisiesto ");
        
      
    }
    
}
