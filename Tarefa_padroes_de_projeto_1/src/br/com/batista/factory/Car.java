package br.com.batista.factory;

public abstract class Car {
    private int horsePower;
    private String fuelSource;
    private String color;

    public Car(int horsePower, String fuelSource, String color) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName());
        System.out.println("O motor está " + fuelSource + ", foi ligado e está pronto para utilizar " + horsePower + "cv" );
    }
    public void clean(){
        System.out.println("O carro foi limpo, é de cor " + color.toLowerCase());
    }
    public void mechanicCheck(){
        System.out.println("Carro foi verificado pelo mecânico, Tudo ok!");
    }
    public void fuelCar(){
        System.out.println("Tanque " + fuelSource.toLowerCase());
    }
}
