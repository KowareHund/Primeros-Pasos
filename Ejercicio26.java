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
public class Ejercicio26 {
    
    public static void main(String[]args){
        Scanner Teclado = new Scanner (System.in);
        int num1 = Teclado.nextInt();
        int num2 = Teclado.nextInt();
        int num3 = Teclado.nextInt();
        
        int mayor = Math.max(num1,Math.max(num2,num3));
        int menor = Math.min(num1,Math.min(num2,num3));
        
        System.out.println(mayor + " es mayor");
        System.out.println(menor + " es menor");
    }
}
