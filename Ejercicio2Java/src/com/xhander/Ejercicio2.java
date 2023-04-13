package com.xhander;

/** Para este ejercicio tendréis que crear una función que reciba un precio y
 * devuelva el precio con el IVA incluido.
 */

public class Ejercicio2 {
    public static void main(String[] args) {

    //Devuelve el precio con IVA incluido

    double precio = 100000;
    double iva = precio * 0.16;
    double total = precio + iva ;
    String totalPrecio = precioIva(precio, iva, total);
    System.out.println(totalPrecio);

    }
    //función que recibe el precio
    static String precioIva(double precio, double iva, double total) {
    return "El precio total del valor de $ " + precio + " , con el iva del 16 % es: $ "  + total;

    }
}
