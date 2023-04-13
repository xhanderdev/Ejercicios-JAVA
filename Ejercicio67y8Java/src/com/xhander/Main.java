package com.xhander;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;

/** Dada la función: public static String reverse(String texto) {}
 *  Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
 */
public class Main {
    public static String reverse(String texto)  {

        return new StringBuilder(texto).reverse().toString();
    }
    // cadena invertida reverse.
    public static void main(String[] args) {

        String texto = "hola mundo";
        texto = reverse(texto);
        System.out.println("la cadena 'hola mundo', debe retornar 'odnum aloh'");
        System.out.println(texto);

        // Array unidimensional
        System.out.println("1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.");
        String unidimensional[] = {
                "Alex",
                "Andrea",
                "Anthony"
        };
        for (String unidimen : unidimensional) {
            System.out.println(unidimen);

        }

        // Array bidimensional
        System.out.println("2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.");
        int bidimensional [][] = {
                {4,6,8,9},
                {3,5,7,10}
        };
        for (int i = 0; i < bidimensional.length; i++) {
            System.out.println("Valor: " + i);

            for (int j = 0; j < bidimensional[1].length; j++) {
                System.out.println("Posición  i en: " + i + " j en: " + j);
                System.out.println(bidimensional[i][j]);
            }

        }


        // Vector

        System.out.println("3. Crea un Vector del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.");


        Vector<Integer> vector = new Vector<>();
        vector.add(4);
        vector.add(6);
        vector.add(8);
        vector.add(10);
        vector.add(12);
        vector.remove(2);
        vector.remove(3);
        System.out.println("Elementos del Vector " + vector);

        //
        System.out.println("4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.");

        Vector<Integer> vector2 = new Vector<>(1000);
        vector.add(8);
        vector.add(10);
        vector.add(12);

        System.out.println("Vector tamaño " + vector2.size() + " y capacidad: " + vector2.capacity());


        // ArrayList
        System.out.println("5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.");

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Casa");
        lista.add("Carro");
        lista.add("Moto");
        lista.add("Avión");

        for (String nombre: lista) {
            System.out.println(nombre);
        }


        LinkedList<String> copiaLista = new LinkedList<String >(lista);

        for (String nombre: copiaLista) {
            System.out.println(nombre);
        }

        System.out.println("6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer for de relleno.");

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i = 0; i <=10; i++) {
            numeros.add(i);

            for (int par = 0; par < numeros.size(); par++) {

                if (numeros.get(par) % 2 == 0) {
                    numeros.remove(par);
                }
            }
        }
        System.out.println(numeros);


        //throws
        System.out.println("7. Crea una función DividePorCero. Esta, debe generar una excepción (throws) a su llamante del tipo ArithmeticException que será capturada por su llamante (desde main, por ejemplo).Si se dispara la excepción, mostraremos el mensaje Esto no puede hacerse. Finalmente, mostraremos en cualquier caso: Demo de código.");


        //InputStream y PrintStream
        System.out.println("8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: fileIn y fileOut. La tarea de la función será realizar la copia del fichero dado en el parámetro fileIn al fichero dado en fileOut.");




        System.out.println("9. Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.");


    }


}

