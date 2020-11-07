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
public class Ejercicio3 {
    // 1. Inicio
    public static void main(String[] args) {
        //2. Declaro las variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //3. valorMinuto, d[0,n]
        double valorMinuto;
        //4. minutosConsumidos, d[0,n]
        double minutosConsumidos;
        //5. consumoTotal, d[0,n]
        double consumoTotal;
        //6. Pedimos datos por teclado = entrada
        //7. Escribo "Ingrese cuanto cuesta el minuto"
        System.out.println("Ingrese valor del minuto");
        //8. leer valorMinuto
        valorMinuto=entrada.nextDouble();
        //9. Escribo "Ingrese Ingrese los minutos consumidos"
        System.out.println("Ingrese valor del minuto");
        //10. leer minutosConsumidos
        minutosConsumidos=entrada.nextDouble();
        //11. proceso
        consumoTotal = valorMinuto + minutosConsumidos;
        //12. salida
        System.out.printf ("El valor total: " + consumoTotal);
        //13. Fin
    }
}