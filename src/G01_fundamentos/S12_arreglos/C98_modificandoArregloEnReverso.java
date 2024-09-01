package G01_fundamentos.S12_arreglos;

// Modificando el arreglo en reverso

import java.util.Arrays;

public class C98_modificandoArregloEnReverso {
    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo", "Asus Notebook", "Macbook Air",
                "Chromecast 4ta generacion", "Bicicleta Oxford"};

        int total = productos.length;
        Arrays.sort(productos);

        for (int i = 0; i < total; i++) {
            System.out.println(productos[i]);
        }

        for (int i = 0; i < total/2 ; i++) {
            String actual = productos[i];
            String inverso = productos[total-1-i];
            productos[i] = inverso;
            productos[total-1-i] = actual;
        }

        for (String producto : productos) {
            System.out.println(producto);
        }

    }
}
