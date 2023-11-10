/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author regin
 */
public class EVA2_26_USO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] platillos = new String[10];
        platillos[0] = "Tacos";
        platillos[1] = "Tostas de lomo";
        platillos[2] = "Tortas ahogadas";
        platillos[3] = "Tamales";
        platillos[4] = "Tripitas";
        platillos[5] = "Tripotas";
        platillos[6] = "Tlayudas";
        platillos[7] = "Tlacoyo";
        platillos[8] = "Chilaquiles";
        platillos[9] = "T-Bone";
        double[] precio = {20, 50, 60, 25, 80, 90, 55, 30, 100, 400};
        
        System.out.println("--------MENU--------");
        for (int i = 0; i < platillos.length; i++) {
            System.out.println(i + "-" + platillos[i] + ": $" + precio[i]);
           
           }
        int opc, cant;
        Scanner input = new Scanner(System.in);
        System.out.println("¿Que quieres ordenar");
        opc = input.nextInt();
        System.out.println("¿Cuantas órdenes quieres?");
        cant = input.nextInt();
        System.out.println("El consto de tu pedido es: $" + (cant * precio[opc]));
                
      }
        
    }
    

