public class cuentaAhorros extends cuenta  {
    private double tasaInteres;
    private int retirosMes;

    public cuentaAhorros(String numeroCuenta, String titular, double saldo, double tasaInteres){
        super(numeroCuenta, titular, saldo);
        this.setTasaInteres(tasaInteres);
        this.retirosMes = 0;
    }
    public double getTasaInteres (){
        return this.tasaInteres;
    }
    public final void setTasaInteres (double tasaInteres){
        this.tasaInteres = tasaInteres;
    }
    public void aplicarInteres(){
        double ganancia = getSaldo() * tasaInteres / 100;
        setSaldo(getSaldo() + ganancia);

        System.out.println("Interes ganado: " + ganancia);
    } 

    @Override
    public void retirar (double cantidad){
        if(retirosMes >= 3){
            System.out.println("Ya realizo los 3 retiros del mes.");
        }else if (cantidad > 0 && cantidad <= getSaldo()){
            super.retirar(cantidad);
            retirosMes++;
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tasa de interes: " + tasaInteres + "%");
         System.out.println("Retiros del mes: " + retirosMes);
    }
}