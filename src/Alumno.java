public class Alumno {
    String nombre;
    int idAlumno;

    public Alumno(String nombre, int idAlumno) {
        this.nombre = nombre;
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", idAlumno=" + idAlumno +
                '}';
    }
}
