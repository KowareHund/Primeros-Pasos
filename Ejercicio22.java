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
public class Ejercicio22 {
    
    public static void main (String[]args){
        
        Scanner Teclado = new Scanner (System.in);
        int numero = Teclado.nextInt();
        
        for(int i = 1;i<numero;i++){
            if (i % 2 != 0){
            System.out.println(i);
        }
        }
    }
    
}
