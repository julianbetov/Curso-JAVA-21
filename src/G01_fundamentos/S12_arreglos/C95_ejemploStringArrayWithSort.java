package G01_fundamentos.S12_arreglos;

// Ejemplo de un arreglo de string y ordenar con sort

import java.util.Arrays;

public class C95_ejemploStringArrayWithSort {
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

        for (String producto : productos) {
            System.out.println(producto);
        }

        // Ordenar el array alfabeticamente A-Z
            // Nota: Si el array fuera de tipo numerico, los organizaria de acuerdo a ello.
        Arrays.sort(productos);

        // Array organizado
        for (String producto : productos) {
            System.out.println(producto);
        }

    }
}
