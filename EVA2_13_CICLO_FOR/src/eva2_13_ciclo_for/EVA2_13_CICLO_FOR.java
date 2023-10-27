/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_ciclo_for;

/**
 *
 * @author regin
 */
public class EVA2_13_CICLO_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //for--- desde
        //punto de inicio, condicion para continuar, avance o retroceso
        // ++ ---> agrgar 1
        // -- ---> resta 1
        // += ---> incrementa en N
        // -= ---> decrementa en N
        // *= ---> multiplica por N
        // miestras la condicion es verdadera el for se ejcuta
        //cuando es falso termina
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("-");
        for(int i = 9; i >= 0; i--) {
            System.out.println(i);
        }
        // imprimir los numeros pares de 0 a 100, imcluyendo el 0 y 100
        
        for(int i = 0; i <= 100; i+=2)
            System.out.print( i + "-");
        
    }
    
}
