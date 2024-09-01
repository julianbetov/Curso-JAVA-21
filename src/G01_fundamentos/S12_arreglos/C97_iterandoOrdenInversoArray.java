package G01_fundamentos.S12_arreglos;

// Iterando en orden inverso un Array

import java.util.Arrays;

public class C97_iterandoOrdenInversoArray {
    public static void main(String[] args) {

        // Inicializacion y llenado del array
        String[] productos = new String[7];
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);
        final int total = productos.length;

        /* For */

        for (int i = 0; i < total; i++) {
            System.out.println(productos[productos.length - (i + 1)]);
        }

        for (int i = total -1; i >= 0; i--) {
            System.out.println("Indice " + i + ": " + productos[i]);
        }

    }
}
