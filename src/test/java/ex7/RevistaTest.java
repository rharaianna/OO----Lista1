package ex7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RevistaTest {

    @Test
    void testNome() {
        Revista revista = new Revista();
        revista.setTitulo("Caras");
        assertEquals("Caras", revista.getTitulo());
    }

    @Test
    void testDataPublicacaoValida(){
        Revista revista = new Revista();
        revista.setDataPublicacao("10/10/2010");
        assertEquals("10/10/2010", revista.getDataPublicacao());
    }

    @Test
    void testDataPublicacaoInvalida(){
        try {
            Revista revista = new Revista();
            revista.setDataPublicacao("1010/2010");
            fail();
        }
        catch (Exception e) {
            assertEquals("formato invalido", e.getMessage());
        }
    }

    @Test
    void testDataEmprestimoValida(){
        Revista revista = new Revista();
        revista.setDataEmprestimo("10/10/2010");
        assertEquals("10/10/2010", revista.getDataEmprestimo());
    }

    @Test
    void testDataEmprestimoInvalida(){
        try {
            Revista revista = new Revista();
            revista.setDataEmprestimo("1010/2010");
            fail();
        }
        catch (Exception e) {
            assertEquals("formato invalido", e.getMessage());
        }
    }

    @Test
    void testDataDevolucao(){
        Revista revista = new Revista();
        revista.setDataEmprestimo("10/10/2010");
        assertEquals("17/10/2010",revista.calcularDataDevolucao());
    }

}