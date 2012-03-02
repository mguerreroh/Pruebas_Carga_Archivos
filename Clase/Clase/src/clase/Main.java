
package clase;


public class Main {

    
    public static void main(String[] args) {
        //Aqui instanciamos
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();
        Alumno alumno3 = new Alumno();
        //Asignamos nombres
        alumno1.setNombre("Jorge");
        alumno2.setNombre("Carla");
        alumno3.setNombre("Vladimir");

        System.out.println(alumno1.saludar(alumno2));
        System.out.println(alumno1.saludar(alumno3));
        System.out.println(alumno2.saludar(alumno3));
        System.out.println(alumno3.saludar(alumno1));
    }

}
