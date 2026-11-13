public class App {

    public static void main(String[] args) {
    
        cuentaAhorros ahorro = new cuentaAhorros("123", "Maria", 100000, 2);
        cuentaCorriente corriente = new cuentaCorriente("456", "Maria", 50000, 30000);
        ahorro.depositar(20000);
        corriente.depositar(20000);

        System.out.println("Retiros de cuenta: ");
        ahorro.retirar(5000);
        ahorro.retirar(5000);
        ahorro.retirar(5000);
        ahorro.retirar(5000);

        System.out.println("\nRetiro en la cuenta corriente: ");
        corriente.retirar(85000);

        System.out.println("\nAplicar interes: ");
        ahorro.aplicarInteres();

        System.out.println("\nInformación general: ");
        ahorro.mostrarInfo();
        corriente.mostrarInfo();

    }
}