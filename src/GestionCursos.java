import java.util.ArrayList;

public class GestionCursos {

    private ArrayList<Curso> cursos; // lista que almacena todos los cursos en memoria

    // Constructor
    public GestionCursos() {
        cursos = new ArrayList<>();   // inicializa la lista de cursos
    }

    // Agregar un curso a la lista
    public void agregarCurso(Curso curso) {
        cursos.add(curso);                                 // Añade curso a la lista
        System.out.println("Curso agregado: " + curso.getNombre());
    }

    // Listar todos los cursos
    public void listarCursos() {
        if (cursos.isEmpty()) {                            // Verifica si la lista está vacía
            System.out.println("No hay cursos registrados.");
        } else {
            System.out.println("Cursos disponibles:");
            for (Curso curso : cursos) {                  // recorre la lista
                System.out.println("Código: " + curso.getCodigo() +
                        ", Nombre: " + curso.getNombre() +
                        ", Créditos: " + curso.getCreditos() +
                        ", Profesor: " + curso.getProfesor()); // muestra cada atributo
            }
        }
    }

    // buscar curso por código
    public Curso buscarCurso(int codigo) {
        for (Curso curso : cursos) {                      // recorre la lista
            if (curso.getCodigo() == codigo) return curso; // devuelve curso si coincide el código
        }
        return null;                                      // si no se encuentra, devuelve null (no encontrado)
    }

    // eliminar curso por código
    public void eliminarCurso(int codigo) {
        Curso curso = buscarCurso(codigo);               // primero busca el curso
        if (curso != null) {
            cursos.remove(curso);                         // lo elimina de la lista
            System.out.println("Curso eliminado: " + curso.getNombre());
        } else {
            System.out.println("Curso no encontrado, no se puede eliminar.");
        }
    }
}