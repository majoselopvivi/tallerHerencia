public class cuentaAhorros extends cuenta  {
    private double tasaInteres;

    public cuentaAhorros(String numeroCuenta, String titular, double saldo, double tasaInteres){
        super(numeroCuenta, titular, saldo);
        this.setTasaInteres(tasaInteres);
    }
    public double getTasaInteres (){
        return this.tasaInteres;
    }
    public final void setTasaInteres (double tasaInteres){
        this.tasaInteres = tasaInteres;
    }
}
