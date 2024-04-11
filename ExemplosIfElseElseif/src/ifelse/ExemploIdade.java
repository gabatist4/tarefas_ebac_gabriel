package ifelse;

import java.util.Scanner;

public class ExemploIdade {

        public static void main (String args[]) {
            Scanner s = new Scanner(System.in);

            System.out.println("Digite sua idade: ");
            int idade = s.nextInt();
            String idadeSt = getIdade(idade);
            System.out.println(idadeSt);
        }

        public static String getIdade(int idade) {
            if (idade >= 0 && idade <=5)  {
                return "Vc é um bebe";
            } else if (idade >=6 && idade <=10) {
                return "Vc é uma criança";
            } else if (idade >=11 && idade <=18) {
                return "Vc é um adolecente";
            } else {
                return "Vc é um adulto";
            }
        }
    }

