@AnotacaoTabela(value = "Condomínio", apartamento = {"AP 11", "AP 12", "AP 13", "AP 14"}, numeroBloco = 300)
public class Tabela {

    @AnotacaoTabela(value = "Condomínio", apartamento = {"AP 11", "AP 12", "AP 13", "AP 14"}, numeroBloco = 300)
    private String nome;

    public static void main(String[] args) {
        AnotacaoTabela anotacao = Tabela.class.getAnnotation(AnotacaoTabela.class);
        String nomeTabela = anotacao.value();
        System.out.println("Nome da tabela: " + nomeTabela);
    }
}