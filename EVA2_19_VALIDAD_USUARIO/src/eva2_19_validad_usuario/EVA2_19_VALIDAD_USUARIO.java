/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_validad_usuario;

import java.util.Scanner;

/**
 *
 * @author regin
 */
public class EVA2_19_VALIDAD_USUARIO {
    final static String NOMBRE_USUARIO = "Admin";
    final static String PASSWORD = "Admin";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario, password;
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("Introduce el usuario: ");
            usuario = input.nextLine();
            System.out.println("Introduce la contraseña: ");
            password = input.nextLine();
        }while(!usuario.equals(NOMBRE_USUARIO) || (!password.equals(PASSWORD)));
        System.out.println("ACCESO CONCEDIDO. BIENVENIDO!");
        
        
    }
    
}
