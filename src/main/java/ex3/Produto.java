package ex3;

public abstract class Produto {

    private String nome;
    private double precoBase;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        if (precoBase < 0){
            throw new IllegalArgumentException("preco base invalido");
        }
        this.precoBase = precoBase;
    }

    public abstract double calcularPreco();
}
