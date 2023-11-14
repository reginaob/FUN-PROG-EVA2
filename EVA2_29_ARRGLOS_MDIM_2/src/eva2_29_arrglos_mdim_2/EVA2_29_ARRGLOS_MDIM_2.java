/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_arrglos_mdim_2;

/**
 *
 * @author regin
 */
public class EVA2_29_ARRGLOS_MDIM_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int [3][];
        //podemos definir el tamaño de cada fila:
        matriz[0] = new int[10];
        matriz[1] = new int[5];
        matriz[2] = new int[3];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random() * 100);
            }
        }
         //LEER NUESTRO ARREGLO
        for(int i = 0; i < matriz.length; i++) {//fila
            for (int j = 0; j < matriz[i].length; j++) {//columnas 
                System.out.print("[" + matriz[i][j] + "]"); 
            }
            System.out.println("");
        
        }
    }
    
}
