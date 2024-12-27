package ex7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmeTest {

    @Test
    void testNome() {
        Filme filme = new Filme();
        filme.setTitulo("Harry Potter");
        assertEquals("Harry Potter", filme.getTitulo());
    }

    @Test
    void testDataPublicacaoValida(){
        Filme filme = new Filme();
        filme.setDataPublicacao("10/10/2010");
        assertEquals("10/10/2010", filme.getDataPublicacao());
    }

    @Test
    void testDataPublicacaoInvalida(){
        try {
            Filme filme = new Filme();
            filme.setDataPublicacao("1010/2010");
            fail();
        }
        catch (Exception e) {
            assertEquals("formato invalido", e.getMessage());
        }
    }

    @Test
    void testDataEmprestimoValida(){
        Filme filme = new Filme();
        filme.setDataEmprestimo("10/10/2010");
        assertEquals("10/10/2010", filme.getDataEmprestimo());
    }

    @Test
    void testDataEmprestimoInvalida(){
        try {
            Filme filme = new Filme();
            filme.setDataEmprestimo("1010/2010");
            fail();
        }
        catch (Exception e) {
            assertEquals("formato invalido", e.getMessage());
        }
    }

    @Test
    void testDataDevolucao(){
        Filme filme = new Filme();
        filme.setDataEmprestimo("30/12/2010");
        assertEquals("04/01/2011",filme.calcularDataDevolucao());
    }

}