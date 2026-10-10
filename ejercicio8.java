public class EjercicioCuadradoArray {

    public static void elevarAlCuadrado(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        System.out.println("Dentro del método: " + java.util.Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] valores = {2, 3, 4, 5};
        System.out.println("Antes de modificar: " + java.util.Arrays.toString(valores));
        
        elevarAlCuadrado(valores);
        
        System.out.println("Después de modificar: " + java.util.Arrays.toString(valores));
    }
}