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
public class Ejercicio21 {
    
    public static void main(String[] args){
        
        Scanner Teclado = new Scanner (System.in);
        
        int num1 = Teclado.nextInt();
        int num2 = Teclado.nextInt();
        
        if(num1<num2){
            System.out.println(num2 + " es mayor,"+ num1 + " es menor" );
        } else{
            System.out.println(num1 + " es mayor,"+ num2 + " es menor");
        }
        
    }
}
