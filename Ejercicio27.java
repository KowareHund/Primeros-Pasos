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
public class Ejercicio27 {
    
    public static void main (String[]args){
        
        Scanner Teclado = new Scanner (System.in);
        while(true){
            double fahrenheit = Teclado.nextDouble();
            
            if (fahrenheit==999){
                break;
            }else{
                double celsius = (5.0 / 9) * (fahrenheit - 32);
                System.out.println(celsius);
            }
        }
        
        
    }
    
}
