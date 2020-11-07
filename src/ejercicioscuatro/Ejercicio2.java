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
public class Ejercicio2 {
    //1. Inicio
    public static void main(String[] args) {
        //2. Declaro las variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //3. primerHijo, d[0,n]
        double primerHijo;
        //4. segundoHijo, d[0,n]
        double segundoHijo;
        //5. tercerHijo, d[0,n]
        double tercerHijo;
        //6. gastoTotal, d[0,n]
        double gastoTotal;
        //7. Pedimos datos por teclado - entrada
        //8. Escribir "Ingrese gastos del primer hijo"
        System.out.println("Ingrese gastos del primer hijo");
        //9. leer primerHijo
        primerHijo=entrada.nextDouble();
        //10. Escribir "Ingrese gastos del segundo hijo"
        System.out.println("Ingrese gastos del segundo hijo");
        //11. leer segundoHijo
        segundoHijo=entrada.nextDouble();
        //12. Escribir "Ingrese gastos del tercer hijo"
        System.out.println("Ingrese gastos del tercer hijo");
        //13. leer tercerHijo
        tercerHijo=entrada.nextDouble();
        //14. Escribir "Ingrese gasto total"
        System.out.println("Ingrese gasto total");
        //15. proceso
        gastoTotal = primerHijo + segundoHijo + tercerHijo;
        //16. salida
        System.out.printf ("Los gastos totales son: " + gastoTotal);
        //17. Fin
    }
}