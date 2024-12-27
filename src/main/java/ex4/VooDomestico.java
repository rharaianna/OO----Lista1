package ex4;

public class VooDomestico extends Voo{


    @Override
    public double calcularPreco() {
        return getDistancia()*getPrecoEspecifico();
    }
}
