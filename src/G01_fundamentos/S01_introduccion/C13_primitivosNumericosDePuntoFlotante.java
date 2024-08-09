package G01_fundamentos.S01_introduccion;

/* Notas:
- Para especificar que un variable tiene un valor decimal en concreto hay que poner ya sea 'f' o 'd' al final del numero
- Las variables de este tipo usan notacion cientififica o no dependiendo de la magnitud del numero decimal.
 */

public class C13_primitivosNumericosDePuntoFlotante {
    public static void main(String[] args) {

        float floatNumber = 2.12E3f;
        System.out.println(floatNumber); // Output: 2120.0 (Es equivalente)

        float anotherFloatNumber = 1.5E-3f;
        System.out.println(anotherFloatNumber); // Output: 0.0015 (Es equivalente)

    }
}
