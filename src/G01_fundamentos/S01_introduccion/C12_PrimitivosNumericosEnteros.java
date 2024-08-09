package G01_fundamentos.S01_introduccion;

/* Notas:
- Obtener los datos tecnicos de cada tipo de dato primitivo numerico entero.
- En el ejemplo que se presenta, usamos una variable de tipo byte y para obtener las propiedades correspondientes a ella, la clase Byte.
- Para obtener la informacion correspondiente a otro tipo de dato, manejar la clase wrapper asociada; como Short o Integer.
 */

public class C12_PrimitivosNumericosEnteros {
    public static void main(String[] args) {

        byte byteNumber = 127;
        System.out.println("Numero de Byte: " + byteNumber);
        System.out.println("Tipo byte corresponde en byte a: " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bits a: " + Byte.SIZE);
        System.out.println("Valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte: " + Byte.MIN_VALUE);

    }
}
