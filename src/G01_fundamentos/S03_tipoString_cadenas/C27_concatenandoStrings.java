package G01_fundamentos.S03_tipoString_cadenas;

public class C27_concatenandoStrings {
    public static void main(String[] args) {

        String curso = "Programacion Java";
        String estudiante = "jbdres";

        String detalle = curso + " con el estudiante: " + estudiante;
        System.out.println(detalle);

        // Estableciendo la prioridad de los operadores
        System.out.println(detalle + 10 + 5); // 105 (Los numeros se toman como strings)
        System.out.println(detalle + (10 + 5)); // 15 (Se hace la suma correctamente)
        System.out.println(10 + 5 + detalle); // 15 ... (Lo primero que encuentra en compilador son numeros, por lo que hace la suma y despues concatena el string)

        // Usando un metodo para concatenar
        String detalle2 = curso.concat(" con ".concat(estudiante)); // Este metodo es anidable
        System.out.println(detalle2);

    }
}
