package switchCase;
import java.util.Scanner;

public class ExemploIdade {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);
    }

    public static String getIdade(int idade) {
        String result;
        switch (idade) {
            case 0:
            case 5:
                result = "Vc é um Bebe";
                break;
            case 6:
            case 10:
                result = "Vc é uma criança";
                break;
            case 11:
            case 18:
                result = "Vc é um adolecente";
                break;
            default:
                result = "Vc é um adulto";
                break;
        }
        return result;
    }


}
