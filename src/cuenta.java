public class cuenta {
    private String numeroCuenta, titular;
    private  double saldo;

    public cuenta(){
    }

    public cuenta (String numeroCuenta, String titular, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setNumeroCuenta(){
        this.numeroCuenta = numeroCuenta;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setSaldo(double saldo){
       if (saldo >= 0){
        this.saldo = saldo;
       }else{
        System.out.println("Saldo debe ser un numero positivo");
       }
    }

    public void depositar(double cantidad){
        if(cantidad > 0){
            this.saldo += cantidad;
            System.out.println("Nuevo saldo: " + saldo);
        }else{
            System.out.println("La cantidad debe ser positiva.");
        }

    }

    public void retirar (double cantidad){
        if (cantidad > 0 && cantidad <= saldo){
            this.saldo -= cantidad;
            System.out.println("Nuevo saldo: " + saldo);
        }else{
            System.out.println("Fondo insuficientes o cantidad invalidad.");
        }
    }

    public void mostrarInfo(){
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}

