public class EjercicioSumarValor {

    public static void sumarAElementos(int[] arr, int valorASumar) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += valorASumar;
        }
        System.out.println("Dentro del método: " + java.util.Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40};
        System.out.println("Antes de modificar: " + java.util.Arrays.toString(numeros));
        
        sumarAElementos(numeros, 5);
        
        System.out.println("Después de modificar: " + java.util.Arrays.toString(numeros));
    }
}