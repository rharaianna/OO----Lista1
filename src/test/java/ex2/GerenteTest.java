package ex2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    @Test
    void calcularSalario() {
        Gerente gerente = new Gerente();
        gerente.setBonus(100);
        gerente.setSalarioMensal(100);
        assertEquals(200, gerente.calcularPagamento());
    }

    @Test
    void bonusValido(){
        Gerente gerente = new Gerente();
        gerente.setBonus(0);
        assertEquals(0, gerente.getBonus());
    }

    @Test
    void bonusInvalido(){
        try {
            Gerente gerente = new Gerente();
            gerente.setBonus(-1);
        } catch (Exception e) {
            assertEquals("Bonus invalido", e.getMessage());
        }
    }

    @Test
    void salarioInvalido() {
        try{
            Gerente func = new Gerente();
            func.setSalarioMensal(-1);
        }
        catch (Exception e){
            assertEquals("Salario Mensal Invalido",e.getMessage());
        }
    }

}