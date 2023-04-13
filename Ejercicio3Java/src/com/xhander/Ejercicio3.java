package com.xhander;

/** En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
 *Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
 * String[] nombres = {"", "", "", ""}
 */

public class Ejercicio3 {
    public static void main(String[] args) {

        String[] nombres = {"Alex", "Andrea", "Anthony"};

        for (int i = 0; i< nombres.length; i++){

            // Nombres concatenados
            System.out.println("Primer nombre " + nombres[i++] + " ,Segundo nombre " + nombres[i++] + " y Tercer nombre "+ nombres[i++]);

        }


    }
}
