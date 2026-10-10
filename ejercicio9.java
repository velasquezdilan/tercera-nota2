public class EjercicioLimpiarNegativos {

    public static void limpiarNegativos(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
        System.out.println("Dentro del método: " + java.util.Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] temperaturas = {-5, 12, -3, 22, 0, -8};
        System.out.println("Antes de modificar: " + java.util.Arrays.toString(temperaturas));
        
        limpiarNegativos(temperaturas);
        
        System.out.println("Después de modificar: " + java.util.Arrays.toString(temperaturas));
    }
}