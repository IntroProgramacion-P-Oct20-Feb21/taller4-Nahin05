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
public class Ejercicio1 {
    //1. Inicio
    public static void main(String[] args) {
        //2. Declaro las variables
         Scanner entrada = new Scanner(System.in);
         entrada.useLocale(Locale.US);
         //3. base, d[0,n]
         double base;
         //4. altura, d[0,n]
         double altura;
         //5. area, d[0,n]
         double area;
         //6. pido datos por teclado - entradas
         //7. Escribir "Ingrese base del triangulo"
         System.out.println("Ingrese base del triangulo");
         //8. leer base
         base=entrada.nextDouble();
         //9. Escribir "Ingrese altura del triangulo"
         System.out.println("Ingrese la altura");
         //10. leer altura
         altura=entrada.nextDouble();
         //11. proceso
         area = base * altura/2;
         //12. salida
         System.out.printf ("area del triangulo: " + area);
         //13. Fin
    }
    
}
