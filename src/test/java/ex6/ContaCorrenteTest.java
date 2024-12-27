package ex6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

    @Test
    void testTitular() {
        ContaCorrente cc = new ContaCorrente();
        cc.setTitular("Silva");
        assertEquals("Silva", cc.getTitular());
    }

    @Test
    void testNumeroConta() {
        ContaCorrente cc = new ContaCorrente();
        cc.setNumeroConta("123456789");
        assertEquals("123456789", cc.getNumeroConta());
    }

    @Test
    void testSaldo() {
        ContaCorrente cc = new ContaCorrente();
        cc.setSaldo(500);
        assertEquals(500, cc.getSaldo());
    }

    @Test
    void testSaqueInvalido() {
        try{
            ContaCorrente cc = new ContaCorrente();
            cc.setSaldo(500);
            cc.sacar(501);
        }
        catch(Exception e) {
            assertEquals("Saldo Insuficiente", e.getMessage());
        }
    }

    @Test
    void testSaqueValido() {
        ContaCorrente cc = new ContaCorrente();
        cc.setSaldo(500);
        cc.sacar(499);
        assertEquals(1, cc.getSaldo());
    }

    @Test
    void testDepositoInvalido() {
        try {
            ContaCorrente cc = new ContaCorrente();
            cc.depositar(-1);
        }
        catch (Exception e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }

    @Test
    void testDepositoValido() {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(100);
        assertEquals(95, cc.getSaldo());
    }

    @Test
    void testCalcularJuros(){
        ContaCorrente cc = new ContaCorrente();
        cc.setSaldo(100);
        assertEquals(0, cc.calcularJuros());
    }

    @Test
    void testPassaMes(){
        ContaCorrente cc = new ContaCorrente();
        cc.setSaldo(100);
        cc.passaMes();
        assertEquals(90, cc.getSaldo());

    }

}