package ex6;

public class ContaPoupanca extends ContaBancaria{

    @Override
    public void depositar(double valor) {
        if (valor<0){
            throw new IllegalArgumentException("Valor invalido");
        }
        setSaldo(getSaldo() + valor);
    }


    @Override
    public double calcularJuros() {
        return getSaldo()* 0.1;
    }

    @Override
    public void passaMes() {
        setSaldo(calcularJuros() + getSaldo());
    }
}
