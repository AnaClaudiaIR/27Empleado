import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoLeer {
    //Método para leer el List
    public static void leer(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("empleados.ser"))){
            List<Empleado> empleados = (ArrayList<Empleado>) ois.readObject();
            for (Empleado empleado : empleados) {
                System.out.println("Nombre: " + empleado.getNombre());
                System.out.println("Salario: " + empleado.getSalario());
                System.out.println("ID: " + empleado.getId());
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el empleado --> " + e.getMessage());
        }
    }
}
