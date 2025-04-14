/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis.primeros.pasos;
import java.util.Scanner;

/**
 *
 * @author juanr
 */
public class Ejercicio18 {
    
    public static void main (String[]args){
        
        Scanner Teclado = new Scanner (System.in);
        
        int numero = Teclado.nextInt();
        int suma = 0;
        
        for(int i = 1;i <=100;i++){
            suma += numero + i;
        }
        System.out.println(suma);
        
    }
    
}
