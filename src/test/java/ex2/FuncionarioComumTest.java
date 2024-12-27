package ex2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioComumTest {

    @Test
    void calcularSalario() {
        FuncionarioComum func = new FuncionarioComum();
        func.setSalarioMensal(100);
        assertEquals(100, func.getSalarioMensal());
    }

    @Test
    void salarioInvalido() {
        try{
            FuncionarioComum func = new FuncionarioComum();
            func.setSalarioMensal(-1);
        }
        catch (Exception e){
            assertEquals("Salario Mensal Invalido",e.getMessage());
        }
    }

}