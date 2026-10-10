
public class InnerEjercicioObjetoReasignacion{

    
} Persona {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}

public class EjercicioObjetoReasignacion{

    public static void cambiarPersona(Persona p) {
        // Intentamos reasignar el parámetro a un nuevo objeto en memoria
        p = new Persona("Carlos");
        System.out.println("Dentro del método: " + p.nombre);
    }

    public static void main(String[] args) {
        Persona personaMain = new Persona("Ana");
        System.out.println("Antes de llamar al método: " + personaMain.nombre);
        
        cambiarPersona(personaMain);
        
        System.out.println("Después de llamar al método: " + personaMain.nombre);
    }
}