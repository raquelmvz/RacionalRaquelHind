/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racionalRaquelHind;

/**
 *
 * @author raque
 */
public class AppRacional {
    
    public static void main(String[] args) {
        
        //Creacion de dos racionales con valores 4/5 y 3/4
        
        Racional z = new Racional(4,5);
        
        Racional k = new Racional(3,4);
        
        //Crea racional aleatorio
        Racional aleatorio = Racional.aleatorio();
        
        // Imprime los tres racionales
        System.out.printf("z = %.2f \n", (double)z.getA() / z.getB());
        System.out.printf("k = %.2f \n", (double)k.getA() / z.getB());
        System.out.printf("%.2f" , (double)aleatorio.getA()/aleatorio.getB());
        
        
        //Comparacion de z y k
        System.out.println("¿z y k son iguales?: " + Racional.igualdad(z, k));
        
        
        
    }
        
        
    
}
