package com.xhander;

/**En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
 * Agregaréis atributos tal cual tendrían esos objetos en la realidad.
 * Crear constructor vacío y con todos los parámetros para cada clase.
 * Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 */
public class SmartDevice {

    String marca;
    String modelo;
    String procesador;
    int batería;
    int ram;

    public SmartDevice() {

    }

    public SmartDevice(String marca, String modelo, String procesador, int batería, int ram) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.batería = batería;
        this.ram = ram;
    }



}

    // Clases hijas
    class SmartPhone extends SmartDevice {
        public SmartPhone(String marca, String modelo, String procesador, int batería, int ram) {
            super(marca, modelo, procesador, batería, ram);
        }
    }

     class SmartWatch extends SmartDevice {
         public SmartWatch(String marca, String modelo, String procesador, int batería, int ram) {
             super(marca, modelo, procesador, batería, ram);
         }
     }