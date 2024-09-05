package G02_POO.S01_clasesYObjetos.C130;

// Primera clase
/* Notas:
* - Modificadores de acceso: https://javamagician.com/java-modificadores-de-acceso/
* Uso: Establecer el nivel de acceso a clases, variables, metodos y constructores.
* Existen cuatro: public, private, protected y default (sin palabra clave).
* */
public class Automovil {

    /*
    Acceso: Cuando no se usa ninguna palabra clave, java establece el acceso
    por defecto a la clase, metodo o propiedad en particular. El modificador de
    acceso por defecto tambien se llama package-private, lo que significa que
    todos los miembros son visibles dentro del mismo paquete pero no son
    accesibles desde otro paquete.
     */

    String fabricante;
    String modelo;
    String color;
    double cilindrada;

}
