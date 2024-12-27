package ex6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {

    @Test
    void testTitular() {
        ContaPoupanca cp = new ContaPoupanca();
        cp.setTitular("Silva");
        assertEquals("Silva", cp.getTitular());
    }

    @Test
    void testNumeroConta() {
        ContaPoupanca cp = new ContaPoupanca();
        cp.setNumeroConta("123456789");
        assertEquals("123456789", cp.getNumeroConta());
    }

    @Test
    void testSaldo() {
        ContaPoupanca cp = new ContaPoupanca();
        cp.setSaldo(500);
        assertEquals(500, cp.getSaldo());
    }

    @Test
    void testSaqueInvalido() {
        try{
            ContaPoupanca cp = new ContaPoupanca();
            cp.setSaldo(500);
            cp.sacar(501);
        }
        catch(Exception e) {
            assertEquals("Saldo Insuficiente", e.getMessage());
        }
    }

    @Test
    void testSaqueValido() {
        ContaPoupanca cp = new ContaPoupanca();
        cp.setSaldo(500);
        cp.sacar(499);
        assertEquals(1, cp.getSaldo());
    }

    @Test
    void testDepositoInvalido() {
        try {
            ContaPoupanca cp = new ContaPoupanca();
            cp.depositar(-1);
        }
        catch (Exception e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }

    @Test
    void testDepositoValido() {
        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(100);
        assertEquals(100, cp.getSaldo());
    }

    @Test
    void testCalcularJuros(){
        ContaPoupanca cp = new ContaPoupanca();
        cp.setSaldo(100);
        assertEquals(10, cp.calcularJuros());
    }

    @Test
    void testPassaMes(){
        ContaPoupanca cp = new ContaPoupanca();
        cp.setSaldo(100);
        cp.passaMes();
        assertEquals(110, cp.getSaldo());

    }



}