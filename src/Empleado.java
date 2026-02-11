import java.io.Serializable;

public class Empleado implements Serializable {
    private String nombre;
    private double salario;
    private String id;

    public Empleado(String nombre, double salario, String id) {
        this.nombre = nombre;
        this.salario = salario;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
