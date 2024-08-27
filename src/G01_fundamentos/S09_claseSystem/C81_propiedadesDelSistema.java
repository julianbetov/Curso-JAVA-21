package G01_fundamentos.S09_claseSystem;

// Obtener las propiedades del sistema
/* Notas:
- Recurso: https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
 */

import java.util.Properties;

public class C81_propiedadesDelSistema {
    public static void main(String[] args) {

        // ----------------- IMPORTANTE -----------------
        // Obtener todas las propiedades del sistema
        Properties allProperties = System.getProperties();
        allProperties.list(System.out);
        // ----------------------------------------------

        // Algunas propiedades
        System.out.println("\n\n\n\n\n\n Algunas propiedades \n ");

        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        // Directorio del proyecto
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        // Salto de linea '\n'
        String lineSeparator = System.lineSeparator();
            // lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator = Primera linea " + lineSeparator + "esta la segunda linea linea");

    }
}
