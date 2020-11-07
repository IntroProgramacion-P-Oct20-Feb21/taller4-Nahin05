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
public class Ejercicio4 {
    //1. Inicio
    public static void main(String[] args) {
        //2. Declaro las variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //3. valorCpu, d[0,n]
        double valorCpu;
        //4. valorTeclado, d[0,n]
        double valorTeclado;
        //5. valorPantalla, d[0,n]
        double valorPantalla;
        //6. valorRaton, d[0,n]
        double valorRaton;
        //7. valorTotal, d[0,n]
        double valorTotal;
        //8. Pedimos los datos por teclado - entrada
        //9. Escribo "Ingrese valor del CPU"
        System.out.println("Ingrese valor del CPU");
        //10. leer valorCpu
        valorCpu=entrada.nextDouble();
        //11. Escribo "Ingrese Ingrese el valor del Teclado"
        System.out.println("Ingrese valor del Teclado");
        //12. leer valorTeclado
        valorTeclado=entrada.nextDouble();
        //13. Escribo "Ingrese valor de la pantalla"
        System.out.println("Ingrese valor de la pantalla");
        //14. leer valorPantalla
        valorPantalla=entrada.nextDouble();
        //15. Escribo "Ingrese Ingrese el valor del raton"
        System.out.println("Ingrese valor del raton");
        //16. leer valorRaton
        valorRaton=entrada.nextDouble();
        //17. Escribo "Ingrese Ingrese el valor total"
        System.out.println("Ingrese valor total");
        //18. leer valorTotal
        valorTotal=entrada.nextDouble();
        //19. proceso
        valorTotal = valorCpu + valorTeclado + valorPantalla + valorRaton;
        //20. salida
        System.out.printf ("El valor total: " + valorTotal);
        //21. Fin
    }
}
