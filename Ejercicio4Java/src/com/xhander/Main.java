package com.xhander;

public class Main {

    public static void main(String[] args) {

        SmartPhone M2 = new SmartPhone("Xiomi","M2", "ADM32", 4000 , 4);
        System.out.println("El SmartPhone Tiene las Siguientes Características: ");
        System.out.println("Marca: " + M2.marca);
        System.out.println("Modelo: " + M2.modelo);
        System.out.println("Procesador: " + M2.procesador);
        System.out.println("Batería: " + M2.batería + " Amperios");
        System.out.println("Memoria: " + M2.ram + " RAM");

        SmartWatch G3 = new SmartWatch("Motorola","G3", "W5", 2100, 2);
        System.out.println("El SmartWatch Tiene las Siguientes Características: ");
        System.out.println("Marca: " + G3.marca);
        System.out.println("Modelo: " + G3.modelo);
        System.out.println("Procesador: " + G3.procesador);
        System.out.println("Batería: " + G3.batería + " Amperios");
        System.out.println("Memoria: " + G3.ram + " RAM");

    }
}
