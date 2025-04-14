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
public class Ejercicio24 {
    
    public static void main (String[]args){
        
        Scanner Teclado = new Scanner (System.in);
        int a = Teclado.nextInt();
        int b = Teclado.nextInt();
        int c = Teclado.nextInt();
        int d = (b*b-4*a*c);
                
        if(d>0){
            double x1 = (-b + Math.sqrt(d)/(2*a));
            double x2 = (-b - Math.sqrt(d)/(2*a));
            System.out.println(x1);
            System.out.println(x2);
        
        }else if (d==0){
            double x = (-b/(2*a));
            System.out.println(x);
        
        }else{
           
            System.out.println("No tiene solucion");
            
    }
        }
}
    