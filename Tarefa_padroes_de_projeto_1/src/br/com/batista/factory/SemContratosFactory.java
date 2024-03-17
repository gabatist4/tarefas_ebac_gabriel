package br.com.batista.factory;

public class SemContratosFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("B".equals(requestedGrade)) {
            return new Toyota(100, "cheio", "verde");
        } else {
            return null;
        }
    }
}
