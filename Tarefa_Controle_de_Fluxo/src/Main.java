//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main (String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Media do aluno, por favor digite de 0 a 10!");
        System.out.println("Digite a primeira nota: ");
        int nota1 = s.nextInt();
        System.out.println("Digite a segunda nota: ");
        int nota2 = s.nextInt();
        System.out.println("Digite a terceira nota: ");
        int nota3 = s.nextInt();
        System.out.println("Digite a quarta nota: ");
        int nota4 = s.nextInt();

        System.out.println("Media das notas: ");
        int mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println(mediaNotas);
        String mediaNotasSt = getMediaNotas(mediaNotas);
        System.out.println(mediaNotasSt);
    }

    public static String getMediaNotas(int mediaNotas) {
        if (mediaNotas >= 7)  {
            return "Aluno aprovado!";
        } else if (mediaNotas >=5) {
            return "Aluno de recuperaçã0!";
        } else if (mediaNotas <5) {
            return "Aluno reprovado!";
        }
        return null;
    }
}
