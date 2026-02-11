import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Set;

public class EmpleadoGuardar {
    //Método para guardar los datos
    public static void guardar(List<Empleado> empleados) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("empleados.ser"))) {
            out.writeObject(empleados);
            System.out.println("Empleados guardados.");
        } catch (IOException e){
            System.out.println("Error al guardar el empleado --> " + e.getMessage());
        }
    }
}
