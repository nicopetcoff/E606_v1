import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.Scanner;

public class Instituto {

    static ArrayList<Curso>cursos = new ArrayList<>();
    static Scanner sc = new Scanner (System.in);

    public static void main(String[] args){

        int opcion = 0;
        do{

            System.out.println("|1. Agregar alumno    |");
            System.out.println("|2. Mostrar curso     |");
            System.out.println("|4. Salr              |");

            System.out.println("Ingrese opcion");
            opcion = sc.nextInt();



            switch(opcion){

                case 1:
                    System.out.println("Ingrese datos del alumno");
                    sc.nextLine();
                    String[] datos = sc.nextLine().split("&");

                    Alumno alumno = new Alumno(datos[0], Integer.parseInt(datos[1]));

                    int numCurso = 0;
                    String nombreCurso = "";

                    if (cursos.isEmpty()){
                        numCurso=0;
                        System.out.println("Ingrese nombre del curso");
                        nombreCurso= sc.nextLine();
                    }else {
                        for (int i=0; i <= cursos.size(); i++){
                            System.out.println(i+ "-->" + cursos.get(i).getNombre());
                        }
                        System.out.print(cursos.size()+ "-->");

                        System.out.println("Seleccione un curso");
                        numCurso= sc.nextInt();

                        if (numCurso >= cursos.size()){
                            System.out.println("Ingrese nombre del curso");
                            sc.nextLine();
                            nombreCurso = sc.nextLine();
                        }

                        agregarAlumno(numCurso, nombreCurso, alumno);
                    }
                    break;

                case 2:
                    mostrarCurso();
                    break;



                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcion no válida");
                    break;
            }

        }while (opcion != 4);
    }

    public static void agregarAlumno(int nroCurso, String nombreCurso, Alumno alumno1){

        if (nroCurso < cursos.size()){
            cursos.get(nroCurso).agregarAlumnoCurso(alumno1);
        } else {
            Curso curso1 = new Curso(nombreCurso);
            cursos.add(curso1);
        }
    }

    public static void mostrarCurso(){
        System.out.println("Cursos");
        for(int i = 0; i<= cursos.size(); i++){
            System.out.println(cursos.get(i));
        }
    }

}
