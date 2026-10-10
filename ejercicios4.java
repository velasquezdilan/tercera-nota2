class CuentaBancaria {
    String titular;
    double saldo;

    CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
}

public class EjercicioCuentaBancaria {

    public static void depositar(CuentaBancaria cuenta, double monto) {
        cuenta.saldo += monto;
        System.5out.println("Dentro del método: Nuevo saldo de " + cuenta.titular + " = " + cuenta.saldo);
    } // Nota: Ignora el error tipográfico visual del print si lo copias, asegúrate de escribir System.out.println

    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria("Ana", 500.0);
        System.out.println("Antes de depositar: Saldo = " + miCuenta.saldo);
        
        depositar(miCuenta, 150.0);
        
        System.out.println("Después de depositar: Saldo = " + miCuenta.saldo);
    }
}