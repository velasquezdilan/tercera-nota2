public class EjercicioStringInmutable {

    public static void modificarTexto(String texto) {
        // Concatenar crea un NUEVO objeto String en memoria y la variable local apunta a él
        texto = texto + " Mundo";
        System.out.println("Dentro del método: " + texto);
    }

    public static void main(String[] args) {
        String mensaje = "Hola";
        System.out.println("Antes de llamar al método: " + mensaje);
        
        modificarTexto(mensaje);
        
        System.out.println("Después de llamar al método: " + mensaje);
    }
}