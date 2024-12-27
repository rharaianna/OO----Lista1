package ex6;

public class  ContaCorrente extends ContaBancaria {


    @Override
    public void depositar(double valor) {
        if (valor < 0){
            throw new IllegalArgumentException("Valor invalido");
        }
        double deposito = valor - (0.05 * valor);
        setSaldo(getSaldo() + deposito);
    }


    @Override
    public double calcularJuros() {
        return 0;
    }

    @Override
    public void passaMes() {
        setSaldo(getSaldo() - 0.1 * getSaldo());;
    }
}
