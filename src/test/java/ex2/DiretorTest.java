package ex2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiretorTest {

    @Test
    void calcularPagamento() {
        Diretor diretor = new Diretor();
        diretor.setSalarioMensal(100);
        diretor.setLucroEmpresa(100);
        diretor.setPorcentagemParticipacao(0.1);
        assertEquals(110, diretor.calcularPagamento());
    }

    @Test
    void porcentagemParticipacaoValido() {
        Diretor diretor = new Diretor();
        diretor.setPorcentagemParticipacao(0);
        assertEquals(0, diretor.getPorcentagemParticipacao());
    }

    @Test
    void porcentagemParticipacaoInvalido1() {
        try{
            Diretor diretor = new Diretor();
            diretor.setPorcentagemParticipacao(-0.1);
        }
        catch(IllegalArgumentException e) {
            assertEquals("Porcentagem invalida", e.getMessage());
        }
    }

    @Test
    void porcentagemParticipacaoInvalido2() {
        try{
            Diretor diretor = new Diretor();
            diretor.setPorcentagemParticipacao(1.1);
        }
        catch(IllegalArgumentException e) {
            assertEquals("Porcentagem invalida", e.getMessage());
        }
    }

    @Test
    void lucroEmpresaMenor0() {
        Diretor diretor = new Diretor();
        diretor.setLucroEmpresa(-1);
        assertEquals(0, diretor.getLucroEmpresa());
    }

    @Test
    void lucroEmpresa() {
        Diretor diretor = new Diretor();
        diretor.setLucroEmpresa(1);
        assertEquals(1, diretor.getLucroEmpresa());
    }

    @Test
    void salarioInvalido() {
        try{
            Diretor func = new Diretor();
            func.setSalarioMensal(-1);
        }
        catch (Exception e){
            assertEquals("Salario Mensal Invalido",e.getMessage());
        }
    }





}