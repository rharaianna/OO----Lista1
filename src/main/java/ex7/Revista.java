package ex7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Revista extends MaterialBiblioteca{
    @Override
    public String calcularDataDevolucao() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataAntiga = LocalDate.parse(getDataEmprestimo(), formatter);
        LocalDate dataDevolucao = dataAntiga.plusDays(7);
        return dataDevolucao.format(formatter);
    }
}
