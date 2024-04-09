import java.util.List;
import java.util.Objects;

public class Pessoa {
    private String id;

    private String nome;

    private String sexo;

    public Pessoa() {

    }

    public Pessoa(String id, String nome, String sexo) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
    }

    public Pessoa(Pessoa pessoa) {
        this(pessoa.getId(), pessoa.getNome(), pessoa.getSexo());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<Pessoa> listaPessoas() {
        Pessoa pessoa1 = new Pessoa("p1" , "Silvana fernandes", "Feminino");
        Pessoa pessoa2 = new Pessoa("p2" , "Joana feliz", "Feminino");
        Pessoa pessoa3 = new Pessoa("p3" , "Mario alvez","Masculino");
        Pessoa pessoa4 = new Pessoa("p4" , "João matheus", "Masculino");
        Pessoa pessoa5 = new Pessoa("p5" , "Jhony santos", "Masculino");
        Pessoa pessoa6 = new Pessoa("p6" , "Lorena luz", "Feminino");
        return List.of(pessoa1,pessoa2,pessoa3,pessoa4,pessoa5,pessoa6);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return id.equals(pessoa.id) && nome.equals(pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
