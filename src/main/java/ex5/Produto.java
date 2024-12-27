package ex5;

public abstract class Produto {
    private String nome;
    private double precoUnitario;
    private double quantidadeEstoque;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario>0){
            this.precoUnitario = precoUnitario;
        }
        else{
            throw new IllegalArgumentException("Preco invalido");
        }
    }

    public double getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(double quantidadeEstoque) {
        if (quantidadeEstoque<0){
            throw new IllegalArgumentException("Quantidade invalido");
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void vender(double quantidadeComprada){
        setQuantidadeEstoque(getQuantidadeEstoque() - quantidadeComprada);
    }


    public abstract double calcularPreco(double quantidadeComprada);
}
