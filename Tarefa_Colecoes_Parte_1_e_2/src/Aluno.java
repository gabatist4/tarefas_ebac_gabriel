import java.util.Objects;

public class Aluno implements Comparable<Aluno> {

    private String nome;
    private String genero;
    private String sala;

    public Aluno(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public Aluno(String nome, String genero, String sala) {
        this(nome, genero);
        this.sala = sala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String toString() {
        return this.nome;
    }

    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.getNome());
    }

}
