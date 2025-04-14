/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis.primeros.pasos;

/**
 *
 * @author juanr
 */
public class Ejercicio25Ackermann {
    
    public static int ackermann(int x, int y) {
        if (x == 0) {
            return y + 1;
        } else if (y == 0) {
            return ackermann(x - 1, 1);
        } else {
            return ackermann(x - 1, ackermann(x, y - 1));
        }
    }

    public static void main(String[] args) {
        int resultado = ackermann(2, 3);
        System.out.println(resultado);
    }
    
}
