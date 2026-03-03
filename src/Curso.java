public class Curso {

    private int codigo;        
    private String nombre;      
    private int creditos;       
    private String profesor;    

    // Constructor vacío
    public Curso() { }           // Permite crear un curso sin inicializar atributos

    // Constructor con parámetros
    public Curso(int codigo, String nombre, int creditos, String profesor) {
        setCodigo(codigo);       // Se asigna código con validación
        setNombre(nombre);       // Se asigna nombre con validación
        setCreditos(creditos);   // Se asignan créditos con validación
        setProfesor(profesor);   // Se asigna profesor con validación
    }

    // Getters
    public int getCodigo() { return codigo; }            
    public String getNombre() { return nombre; }         
    public int getCreditos() { return creditos; }       
    public String getProfesor() { return profesor; }      

    // Setters con validación
    public void setCodigo(int codigo) {
        if (codigo > 0) this.codigo = codigo;           // Solo acepta numeros positivos
        else System.out.println("Código inválido.");  
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) this.nombre = nombre; // Nombre válido
        else System.out.println("Nombre inválido.");                      // Nombre inválido
    }

    public void setCreditos(int creditos) {
        if (creditos > 0) this.creditos = creditos;   // Solo créditos positivos
        else System.out.println("Los créditos deben ser mayores a 0."); 
    }

    public void setProfesor(String profesor) {
        if (profesor != null && !profesor.isEmpty()) this.profesor = profesor; // Profesor válido
        else System.out.println("Profesor inválido.");                         
    }
}