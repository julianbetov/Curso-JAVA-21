package G01_fundamentos.S12_arreglos;

// Ejemplo de un arreglo de numeros

public class C94_ejemploArregloNumerico {
    public static void main(String[] args) {

        // El array se inicializa con la cantidad de elementos totales a guardar
        int[] numerosEnteros = new int[4];
            // Importante: La cantidad de espacios no se puede modificar

        // Asignar datos a cada posicion del array (Siempre desde cero)
        numerosEnteros[0] = 30;
        numerosEnteros[1] = 20;
        numerosEnteros[2] = 10;
        numerosEnteros[3] = 0;

        // Acceder a los elementos del array
        System.out.println(numerosEnteros[0]);
        System.out.println(numerosEnteros[1]);
        System.out.println(numerosEnteros[2]);
        System.out.println(numerosEnteros[3]);

        // Ultimo elemento del array
        System.out.println(numerosEnteros[ numerosEnteros.length-1 ]);

        // for-each para el array (Recorrerlo e imprimirlo)
        for (int i : numerosEnteros) {
            System.out.println(i);
        }

    }
}
