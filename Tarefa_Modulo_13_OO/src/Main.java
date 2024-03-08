public class Main {
    public static void main(String args[]) {
        Fisica pessoa = new Fisica();
        pessoa.setNome("test");
        pessoa.setCpf(33333333333L);
        System.out.println(pessoa.getNome() + " - CPF: " + pessoa.getCpf());

        Juridica juridica = new Juridica();
        juridica.setNome("test2");
        juridica.setCnpj(111111111111111L);
        System.out.println(juridica.getNome() + " - CNPJ: " + juridica.getCnpj());
    }
}
