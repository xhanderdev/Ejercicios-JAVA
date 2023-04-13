package com.xhander;

public class prueba {
    public static void main(String[] args) {

        String cadena = new String("*");
        int numero = 4; //*|*1|*12|*123|*1234

        int num = 1;
        while (num <= numero) {
            cadena += "|*";
            for (int i = 1; i <= num; i++ )
                cadena += i;
            num ++;

        }
        System.out.println(cadena);

    }


}
