/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscuatro;

/**
 *
 * @author reroes
 */
import java.util.Locale;
import java.util.Scanner;
public class Ejercicio5 {
    //1. Inicio
    public static void main(String[] args) {
        //2. Declaro las variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //3. valorPrestamo, d[0,n]
        double valorPrestamo;
        //4. valorInteres, d[0,n]
        double valorInteres;
        //5. plazo, int[12]
        int plazo=(12);
        //6. valorTotal, d[0,n]
        double valorTotal;
        //7. Pedimos los datos por teclado - entrada
        //8. Escribe "Escribe "Ingrese valor del prestamo"
        System.out.println("Ingrese valor del Prestamo");
        //9. leer valorPeestamo
        valorPrestamo=entrada.nextDouble();
        //10. Escribe "Ingrese valor del interes"
        System.out.println("Ingrese valor del Interes");
        //11. leer valorInteres
        valorInteres=entrada.nextDouble();
        //12. proceso
        valorTotal = valorPrestamo/plazo + valorInteres;
        //13. salida
        System.out.printf ("La mensualidad es: " + valorTotal);
    }
}
