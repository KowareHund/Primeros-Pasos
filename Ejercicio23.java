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
public class Ejercicio23 {
    
    public static void main (String[]args){
        
        Scanner Teclado = new Scanner (System.in);
        int num1 = Teclado.nextInt();
        int num2 = Teclado.nextInt();
        
        System.out.println(mcd(num1,num2));
        
    }
    
   static int mcd(int a,int b){
       
       if(b==0){
           return a;
       }else{
           return mcd(b,a%b);
       }
   }
}
