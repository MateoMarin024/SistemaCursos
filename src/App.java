import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);       // Scanner para leer datos de usuario
        GestionCursos gestionCursos = new GestionCursos(); // Crea el gestor de cursos
        int opcion;                                     // Variable para menú

        do {
            // Menú
            System.out.println("\n SISTEMA DE GESTIÓN DE CURSOS ");
            System.out.println("1. Agregar curso");
            System.out.println("2. Listar cursos");
            System.out.println("3. Buscar curso por código");
            System.out.println("4. Eliminar curso por código");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    // Leer datos para crear un curso
                    System.out.print("Código: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Créditos: ");
                    int creditos = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Profesor: ");
                    String profesor = scanner.nextLine();

                    // Crear curso y agregarlo
                    Curso curso = new Curso(codigo, nombre, creditos, profesor);
                    gestionCursos.agregarCurso(curso);
                    break;

                case 2:
                    // mostrar todos los cursos
                    gestionCursos.listarCursos();
                    break;

                case 3:
                    // Buscar un curso por código
                    System.out.print("Ingrese el código del curso a buscar: ");
                    int codigoBuscar = scanner.nextInt();
                    scanner.nextLine();
                    Curso encontrado = gestionCursos.buscarCurso(codigoBuscar);
                    if (encontrado != null) {
                        System.out.println("Curso encontrado: " +
                                "Código: " + encontrado.getCodigo() +
                                "  Nombre: " + encontrado.getNombre() +
                                "  Créditos: " + encontrado.getCreditos() +
                                "  Profesor: " + encontrado.getProfesor());
                    } else {
                        System.out.println("Curso no encontrado.");
                    }
                    break;

                case 4:
                    // Eliminar un curso por código
                    System.out.print("Ingrese el código del curso a eliminar: ");
                    int codigoEliminar = scanner.nextInt();
                    scanner.nextLine();
                    gestionCursos.eliminarCurso(codigoEliminar);
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida, intente de nuevo.");
                    break;
            }

        } while (opcion != 5); // Repetir mientras que no sea opción 5 (salir)

        scanner.close();
    }
}