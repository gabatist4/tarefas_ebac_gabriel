import carros.Carro;
import carros.Civic;
import carros.Honda;
import carros.Hyundai;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        List<Carro> carros = new ArrayList<>();
        carros.add(new Civic());
        carros.add(new Hyundai());
        carros.add(new Honda());
        imprimirCarros(carros);
    }
    public static void imprimirCarros(List<? extends Carro> lista) {
            for (Carro carro : lista) {
                System.out.println(carro);

            }
    }
}
