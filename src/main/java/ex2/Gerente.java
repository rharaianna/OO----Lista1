package ex2;

public class Gerente extends Funcionario{

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if(bonus < 0){
            throw new IllegalArgumentException("Bonus invalido");
        }
        this.bonus = bonus;
    }

    @Override
    public double calcularPagamento() {
        return (getBonus()+getSalarioMensal());
    }
}
