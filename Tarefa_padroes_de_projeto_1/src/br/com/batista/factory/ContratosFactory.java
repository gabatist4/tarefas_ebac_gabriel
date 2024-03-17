package br.com.batista.factory;

public class ContratosFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Hyundai(120, "cheio", "azul");
        } else {
            return null;
        }
    }
}