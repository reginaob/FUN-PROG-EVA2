/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_carreras;

import java.util.Scanner;

/**
 *
 * @author regin
 */
public class EVA2_12_CARRERAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String carre;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa las iniciales de tu carrera");
        carre = input.next();
        
        switch(carre){
            case"ISC":
                System.out.println("Ingenieria en sistemas computacionales");
                break;
            case"INF":
                System.out.println("Ingenieria en informatica");
                break;
            case"IND":
                System.out.println("Ingenieria industrial");
                break;
            case"IDI":
                System.out.println("Ingenieria en diseño industrial");
                break;
            case"LA":
                System.out.println("Licenciatura en administracion");
                break;
            case"IGE":
                System.out.println("Ingenieria en gestion empresarial");
                break;
            case"ARQ":
                System.out.println("Arquitectura");
                break;
           
        }
    }
    
}
