/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_30_cubo;

/**
 *
 * @author regin
 */
public class EVA2_30_CUBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //si nada mas quiere uno o n cantidad de arreglo se pone asi
        int cubo [][][] = new int [3][4][5];
        
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo.length; k++) {
                    cubo[i][j][k] = (int)(Math.random() * 100);
                    System.out.print("[" + cubo [i][j][k] + "]");
                }       
                System.out.println("");
            }
            System.out.println("");
            
        }
        
    }
    
}
