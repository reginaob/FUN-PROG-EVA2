/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_continue;

/**
 *
 * @author regin
 */
public class EVA2_20_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // break --> termina el ciclo
        for (int i = 1; i <= 15; i++) {
            if(i == 10)
                break;
            
            System.out.print(i + " - ");
        }
        System.out.println("");
        for (int i = 1; i <= 15; i++) {
            if(i == 10)
                continue;
            System.out.print(i + " - ");
        }
    }
    
    
}
