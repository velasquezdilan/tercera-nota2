public class EjercicioDuplicar{

    public static int duplicar(int numero) {
        numero *= 2;
        System.out.println("Dentro del método: numero = " + numero);
        return numero;
    }

    public static void main(String[] args) {
        int valor = 7;
        System.out.println("Antes de llamar al método: valor = " + valor);
        
        // Si llamamos a duplicar(valor); sin asignar, la variable 'valor' no cambiará.
        // Asignamos el valor retornado para actualizar la variable original:
        valor = duplicar(valor);
        
        System.out.println("Después de llamar al método: valor = " + valor);
    }
}
