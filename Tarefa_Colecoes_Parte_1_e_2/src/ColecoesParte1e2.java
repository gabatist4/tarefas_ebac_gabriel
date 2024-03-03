import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColecoesParte1e2 {
    public static void main(String[] args) {
        listaNomesCurso();
    }

    private static void listaNomesCurso() {
        List<Aluno> listaNomes = new ArrayList<Aluno>();

        Aluno a = new Aluno("Lorena silva","F");
        Aluno b = new Aluno("João carlos","M");
        Aluno c = new Aluno("David dantas","M");
        Aluno d = new Aluno("André teves","M");
        Aluno e = new Aluno("Bia cristina","F");
        listaNomes.add(a);
        listaNomes.add(b);
        listaNomes.add(c);
        listaNomes.add(d);
        listaNomes.add(e);
        Collections.sort(listaNomes);
        System.out.println("Lista de todos os alunos: " + listaNomes);

        System.out.println("");
        List<Aluno> listaFeminino = new ArrayList<Aluno>();
        List<Aluno> listaMasculino = new ArrayList<Aluno>();

        for (Aluno aluno : listaNomes) {
            if ("F".equals(aluno.getGenero())) {
                listaFeminino.add(aluno);
            } else if ("M".equals(aluno.getGenero())) {
                listaMasculino.add(aluno);
            }
        }

        System.out.println("Lista de Alunos Feminino: " + listaFeminino);
        System.out.println("");
        System.out.println("Lista de Alunos Masculino: " + listaMasculino);

    }

}