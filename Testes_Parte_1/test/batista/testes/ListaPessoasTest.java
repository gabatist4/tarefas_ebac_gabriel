package batista.testes;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class ListaPessoasTest {

    @Test
    public void testPessoasDoSexoFeminino() {
        // Obter a lista de pessoas
        List<Pessoa> lista = new Pessoa().listaPessoas();

        // Filtrar pessoas do sexo feminino
        List<Pessoa> femininos = lista.stream()
                .filter(pessoa -> pessoa.getSexo().equals("Feminino"))
                .collect(Collectors.toList());

        // Verificar se todos os indivíduos filtrados são do sexo feminino
        for (Pessoa pessoa : femininos) {
            Assert.assertEquals("Feminino", pessoa.getSexo());
        }
    }
}