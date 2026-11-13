public class cuentaCorriente extends cuenta {
    private double sobregiro;

    public cuentaCorriente(String numeroCuenta, String titular, double saldo, double sobregiro) {
        super(numeroCuenta, titular, saldo);
        this.sobregiro = sobregiro;
    }

    public double getSobregiro() {
        return this.sobregiro;
    }

    public void setSobregiro(double sobregiro) {
        this.sobregiro = sobregiro;
    }

    @Override
    public void retirar(double cantidad) {

        if (cantidad > 0 && cantidad <= getSaldo() + sobregiro) {
            
            double nuevoDisponible = (getSaldo() + sobregiro) - cantidad;
            setSaldo(nuevoDisponible);
            System.out.println("Retiro realizado correctamente.");
            System.out.println("Nuevo saldo: " + getSaldo());
        } else {
            System.out.println("Limite de sobregiro excedido.");
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Limite de sobregiro: " + sobregiro);
    }
}