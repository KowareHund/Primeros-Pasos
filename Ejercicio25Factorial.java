/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis.primeros.pasos;

/**
 *
 * @author juanr
 */
public class Ejercicio25Factorial {
    
    public static int factorial(int n){
        if (n==0){
            return 1;
        }else{
            return n * factorial(n-1);
        }
            
        }
    
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(factorial(numero));
    }
        
    
    
}
