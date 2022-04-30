import java.util.ArrayList;

public class Curso {

    String nombre;
    ArrayList <Alumno> alumnos = new ArrayList();

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public void agregarAlumnoCurso (Alumno alumno1){

         alumnos.add(alumno1);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
