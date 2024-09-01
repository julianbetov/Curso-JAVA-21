package G01_fundamentos.S12_arreglos;

// Iterando Arreglos

import java.util.Arrays;

public class C96_iterandoArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);

        /* For */
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Indice " + i + ": " + productos[i]);
        }

        /* For each */
        for (String producto : productos) {
            System.out.println(producto);
        }

        /* While */
        int contador = 0;
        while (contador < productos.length) {
            System.out.println("Indice " + contador + ": " + productos[contador]);
            contador++;
        }

        /* Do-While */
        int contador2 = 0;
        do {
            System.out.println("Indice " + contador2 + ": " + productos[contador2]);
            contador2++;
        } while (contador2 < productos.length);

    }
}
