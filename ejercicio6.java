class Empleado {
    String nombre;
    double sueldo;

    Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
}

public class EjercicioEmpleado {

    public static void aplicarBonificacion(Empleado emp, double aumento) {
        emp.sueldo += aumento;
        System.out.println("Dentro del método: El sueldo de " + emp.nombre + " ahora es " + emp.sueldo);
    }

    public static void main(String[] args) {
        Empleado empleadoMain = new Empleado("Carlos", 2000.0);
        System.out.println("Antes de la bonificación: Sueldo = " + empleadoMain.sueldo);
        
        aplicarBonificacion(empleadoMain, 300.0);
        
        System.out.println("Después de la bonificación: Sueldo = " + empleadoMain.sueldo);
    }
}