public class EjercicioIntegerWrapper {

    public static void modificarNumero(Integer numero) {
        // Ocurre unboxing (se vuelve primitivo para sumar), 
        // y luego autoboxing (crea un NUEVO objeto Integer)
        numero = numero + 10;
        System.out.println("Dentro del método: " + numero);
    }

    public static void main(String[] args) {
        Integer valorOriginal = 50;
        System.out.println("Antes de llamar al método: " + valorOriginal);
        
        modificarNumero(valorOriginal);
        
        System.out.println("Después de llamar al método: " + valorOriginal);
    }
}