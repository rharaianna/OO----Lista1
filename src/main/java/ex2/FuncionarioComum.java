package ex2;

public class FuncionarioComum extends Funcionario{

    @Override
    public double calcularPagamento(){
        return getSalarioMensal();
    }
}
