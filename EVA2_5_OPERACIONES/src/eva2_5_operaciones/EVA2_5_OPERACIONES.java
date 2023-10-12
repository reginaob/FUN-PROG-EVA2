/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_operaciones;

/**
 *
 * @author regin
 */
public class EVA2_5_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var1, var2, resu;
        
        var1 = 100;
        var2 = 200;
        // operador +
        // suma
        // concatenar --> unir cadenas de texto
        resu = var1 + var2;
        System.out.println("suma");
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var1 + var2 = " + resu);
        // resta
        
        resu = var1 - var2;
        System.out.println("resta");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2 );
        System.out.println("var1 - var2 = " + resu);
        
        // multiplicación
        // operador *
        resu = var1 * var2;
        System.out.println("multiplicación");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2 );
        System.out.println("var1 X var2 = " + resu);
       
        // divicion
        // operador /
        // ojo: el tipo de dato es importante, si quieren 
        //el resultado de una division, hay que manejarlo flotante
        // si lo manejan entero, les dara el # de veces que cabe el
        // divisior en el dividendo (de forma entera )
        var1 = 15;
        var2 = 7;
                
       
        resu = var1 / var2;
        System.out.println();//SALTO DE LÍNEA (ENTER)
        System.out.println("división");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2 );
        System.out.println("var1 / var2 = " + resu);
        
        
        // division flotante
        double resuExacto;
        resuExacto = var1 / var2;
         System.out.println();//SALTO DE LÍNEA (ENTER)
        System.out.println("división exacta ");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2 );
        System.out.println("var1 / var2 = " + resuExacto);
        
        
        // porque evar2 es un numero flotante y lo guardamos en una variable de
        // tipo flotante
        double var2F = 7;
        resuExacto = var1 / var2F;
         System.out.println();//SALTO DE LÍNEA (ENTER)
        System.out.println("división exacta ");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2F );
        System.out.println("var1 / var2 = " + resuExacto);
        
        int cifra = 7;
        double cifraDouble = 7.0;
        
        double division = 100/ 10.0; // se toma el divisor como entero
        // double division = 100 / 10.0; // se toma el divisor como flotante.
        
                
        // precendencia de operaciones: 
        int a = 5, b = 3; int c = 2;
        int resultado = (a * b) + (a - c) * (b - a); //(15)+(3)*(-2)// 15-6=9
        System.out.println("RESULTADO PRECEDENCIA:" + resultado);
        
        //
        double potencia;
        potencia = Math.pow(100, 2);
        System.out.println("POTENCIA =" + potencia);
        
        
        
    }
    
}
