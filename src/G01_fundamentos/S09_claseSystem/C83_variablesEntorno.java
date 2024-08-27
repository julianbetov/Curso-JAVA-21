package G01_fundamentos.S09_claseSystem;

// Obtener las variables de ambiente del sistema operativo
/* Notas:

 */

import javax.lang.model.SourceVersion;
import java.util.Map;

public class C83_variablesEntorno {
    public static void main(String[] args) {

        // Listado completo de las variables de entorno
        Map<String, String> varEnv = System.getenv(); // get environment
        System.out.println("varEnv = " + varEnv);

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);
        String computerName = System.getenv("computername");
        System.out.println("computerName = " + computerName);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);
        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);
        String path = System.getenv("Path");
        System.out.println("path = " + path);
        
        /* A las variables de entorno se puede acceder tambien desde "varEnv" */
            // Haciendolo asi se busca por el nombre exacto de la variable de entorno. Es sencible a mayusculas y minusculas
        String username2 = varEnv.get("USERNAME");
        System.out.println("username2 = " + username2);
        String path2 = varEnv.get("Path");
        System.out.println("path2 = " + path2);

    }
}
