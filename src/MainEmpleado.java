import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        List<Empleado> empleados = new ArrayList<>();

        do { //Menu para introducir lo datos
            System.out.println("Nombre: ");
            String nombre = sc.nextLine();

            System.out.println("Salario: ");
            Double salario = sc.nextDouble();

            sc.nextLine();

            System.out.println("ID: ");
            String id = sc.nextLine();

            empleados.add(new Empleado(nombre, salario, id));
            sc.nextLine();

            System.out.println("¿Continuar? (s/n): ");
            opcion = sc.nextLine();
        } while (opcion.equalsIgnoreCase("s"));

        EmpleadoGuardar.guardar(empleados);
        System.out.println();
        EmpleadoLeer.leer();
    }
}
