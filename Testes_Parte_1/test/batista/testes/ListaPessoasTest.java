package batista.testes;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ListaPessoasTest {
    @Test
    public void test() {
        List<Pessoa> lista = new Pessoa().listaPessoas();
        //Todas as pessoas
        lista.stream().forEach(pessoa -> System.out.println(pessoa.getNome()));
        System.out.println("--------------");
        System.out.println("--------------");
        //Somente nomes femininos
        lista.stream().filter(pessoa -> pessoa.getSexo().equals("Feminino"))
                .forEach(f -> System.out.println(f));

        Assert.assertEquals("Feminino", lista);
    }
}