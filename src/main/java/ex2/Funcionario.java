package ex2;

public abstract class  Funcionario {
    private double salarioMensal;

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal < 0) {
            throw new IllegalArgumentException("Salario Mensal Invalido");
        }
        this.salarioMensal = salarioMensal;
    }

    public abstract double calcularPagamento();
}
