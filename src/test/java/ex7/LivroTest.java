package ex7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    @Test
    void testNome() {
        Livro livro = new Livro();
        livro.setTitulo("Harry Potter");
        assertEquals("Harry Potter", livro.getTitulo());
    }

    @Test
    void testDataPublicacaoValida(){
        Livro livro = new Livro();
        livro.setDataPublicacao("10/10/2010");
        assertEquals("10/10/2010", livro.getDataPublicacao());
    }

    @Test
    void testDataPublicacaoInvalida(){
        try {
            Livro livro = new Livro();
            livro.setDataPublicacao("1010/2010");
            fail();
        }
        catch (Exception e) {
            assertEquals("formato invalido", e.getMessage());
        }
    }

    @Test
    void testDataEmprestimoValida(){
        Livro livro = new Livro();
        livro.setDataEmprestimo("10/10/2010");
        assertEquals("10/10/2010", livro.getDataEmprestimo());
    }

    @Test
    void testDataEmprestimoInvalida(){
        try {
            Livro livro = new Livro();
            livro.setDataEmprestimo("1010/2010");
            fail();
        }
        catch (Exception e) {
            assertEquals("formato invalido", e.getMessage());
        }
    }

    @Test
    void testDataDevolucao(){
        Livro livro = new Livro();
        livro.setDataEmprestimo("20/11/2010");
        assertEquals("05/12/2010",livro.calcularDataDevolucao());
    }

}