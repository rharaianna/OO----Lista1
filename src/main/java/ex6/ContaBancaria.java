package ex6;

public abstract class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void depositar(double valor);

    public void sacar(double valor){
        if (valor > saldo){
            throw new IllegalArgumentException("Saldo Insuficiente");
        }
        saldo -= valor;
    }

    public abstract double calcularJuros();
    public abstract void passaMes();
}
