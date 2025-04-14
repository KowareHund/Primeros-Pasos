/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis.primeros.pasos;

/**
 *
 * @author juanr
 */
public class Ejercicio30 {
    
    public static void main (String[]args){
        for (int i = 2; i <= 30; i++){
            boolean primo = true;
                    
            for(int j = 2;j<i;j++){
                if(i % j == 0){
                    primo = false;
                    break;
                        }     
                    }
                    
             if (primo) {
                System.out.println(i);
            }
       
        }
            
    }      
}