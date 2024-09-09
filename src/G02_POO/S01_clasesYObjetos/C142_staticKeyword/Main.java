package G02_POO.S01_clasesYObjetos.C142_staticKeyword;

// Atributos, metodos y bloques staticos

public class Main {
    public static void main(String[] args) {

        System.out.println("Tasa de interes inicial: " + (Banco.getTasaInteres()*100) + "%");
        System.out.println("Total de cuentas iniciales: " + Banco.getTotalCuentas());

        // Cambiar la tasa de interes (Sin instanciar el banco)
        Banco.setTasaInteres(0.03);

        // Crear la instancia del banco
        Banco banco = Banco.getInstanica();
        System.out.println(banco);

            // Validando el patron Singleton (Unica instancia por clase)
            Banco banco2 = Banco.getInstanica(); // 'banco2' hace referencia a 'banco' ya que no es posible crear otro objeto.
            System.out.println(banco2);

        // Crear cuentas bancarias
        banco.crearCuenta(); // Primera cuenta creada
        banco.crearCuenta(); // Segunda cuenta creada

        System.out.println("Tasa de interes actual: " + (Banco.getTasaInteres()*100) + "%");
        System.out.println("Total de cuentas actuales: " + Banco.getTotalCuentas()); // Total de cuentas creadas en la clase Banco

    }
}
