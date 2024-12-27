package ex2;

public class Diretor extends Funcionario{

    private double lucroEmpresa;
    private double porcentagemParticipacao;

    public double getLucroEmpresa() {
        return lucroEmpresa;
    }

    public void setLucroEmpresa(double lucroEmpresa) {
        if (lucroEmpresa >= 0){
            this.lucroEmpresa = lucroEmpresa;
        }
        else {
            this.lucroEmpresa = 0;
        }
    }

    public double getPorcentagemParticipacao() {
        return porcentagemParticipacao;
    }

    public void setPorcentagemParticipacao(double porcentagemParticipacao) {
        if (porcentagemParticipacao < 0 || porcentagemParticipacao > 1){
            throw new IllegalArgumentException("Porcentagem invalida");
        }
        this.porcentagemParticipacao = porcentagemParticipacao;
    }

    @Override
    public double calcularPagamento() {
        return (getSalarioMensal() + getLucroEmpresa() * getPorcentagemParticipacao());
    }
}
