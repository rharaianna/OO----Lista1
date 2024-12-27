package ex5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    @Test
    void testNome() {
        ProdutoEletronico celular = new ProdutoEletronico();
        celular.setNome("celular");
        assertEquals("celular", celular.getNome());
    }

    @Test
    void testPrecoUnitarioValido(){
        ProdutoEletronico celular = new ProdutoEletronico();
        celular.setPrecoUnitario(5.0);
        assertEquals(5.0, celular.getPrecoUnitario());
    }

    @Test
    void testPrecoUnitarioInvalido(){
        try {
            ProdutoEletronico celular = new ProdutoEletronico();
            celular.setPrecoUnitario(-5.0);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Preco invalido", e.getMessage());
        }
    }

    @Test
    void testQuantidadeEstoqueValido(){
        ProdutoEletronico celular = new ProdutoEletronico();
        celular.setQuantidadeEstoque(5);
        assertEquals(5, celular.getQuantidadeEstoque());
    }

    @Test
    void testQuantidadeEstoqueInvalido(){
        try {
            ProdutoEletronico celular = new ProdutoEletronico();
            celular.setQuantidadeEstoque(-1);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Quantidade invalido", e.getMessage());
        }
    }

    @Test
    void vendaValido(){
        ProdutoEletronico celular = new ProdutoEletronico();
        celular.setQuantidadeEstoque(5);
        celular.vender(3);
        assertEquals(2, celular.getQuantidadeEstoque());
    }

    @Test
    void vendaInvalido(){
        try {
            ProdutoEletronico celular = new ProdutoEletronico();
            celular.setQuantidadeEstoque(5);
            celular.vender(6);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Quantidade invalido", e.getMessage());
        }
    }

    @Test
    void calcularPreco(){
        ProdutoEletronico celular = new ProdutoEletronico();
        celular.setPrecoUnitario(10);
        celular.setQuantidadeEstoque(100);
        assertEquals(100,celular.calcularPreco(10));
    }

    @Test
    void calcularPrecoInvalidoMenor0(){
        try {
            ProdutoEletronico celular = new ProdutoEletronico();
            celular.setPrecoUnitario(10);
            celular.setQuantidadeEstoque(100);
            celular.calcularPreco(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Quantidade Comprada invalida", e.getMessage());
        }
    }

    @Test
    void calcularPrecoInvalidoNaoInteiro(){
        try {
            ProdutoEletronico celular = new ProdutoEletronico();
            celular.setPrecoUnitario(10);
            celular.setQuantidadeEstoque(100);
            celular.calcularPreco(0.5);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Quantidade Comprada invalida", e.getMessage());
        }
    }

}