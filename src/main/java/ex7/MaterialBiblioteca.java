package ex7;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class MaterialBiblioteca {
    private String titulo;
    private String dataPublicacao;
    private String dataEmprestimo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String entrada) {
        if(confereFormato(entrada)){
            this.dataPublicacao = entrada;
        }
        else {
            throw new IllegalArgumentException("formato invalido");
        }
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String entrada) {
        if(confereFormato(entrada)){
            this.dataEmprestimo = entrada;
        }
        else {
            throw new IllegalArgumentException("formato invalido");
        }
    }

    public boolean confereFormato(String entrada){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate data = LocalDate.parse(entrada, formatter);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    public abstract String calcularDataDevolucao();
}
