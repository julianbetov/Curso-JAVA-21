package G01_fundamentos.S09_claseSystem;

// Agregar y personalizar propiedades y configuraciones de la aplicacion
/* Notas:
- Hay dos formas
        - Primera: Crear un archivo de propiedad (con extencion de propiedad) y ahi colocar todas las configuraciones con nombre y valor
        - Segunda: Asignar via metodo: setProperty()
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class C82_agregarYPersonalizarPropiedadesYConfiguraciones {
    public static void main(String[] args) {

        /* Se ha creado un archivo 'config.properties' y la informacion ahi escrita se agregara a la clase System */

        try {

            // Leer el archivo y obtener el contenido (En bytes)
            FileInputStream archivo = new FileInputStream("src\\G01_fundamentos\\S09_claseSystem\\config.properties");

            // Guardar todas las propiedades del sistema
            Properties properties = new Properties(System.getProperties());
            properties.load(archivo); // Agregar la configuraciones del archivo creado
            // Agregar al objeto una sola propiedad => llave - valor
            properties.setProperty("mi.propiedad.personalizada", "Valor guardado");

            // Nota: hasta este punto no se han modificado ni cargado mas propiedades a System
            // System.getProperties().list(System.out); // => sigue igual

            // Actualizar System
            System.setProperties(properties);

            System.getProperties().list(System.out);
            System.out.println(System.getProperty("config.autor.nombre"));


        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo " + e);
            //throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
