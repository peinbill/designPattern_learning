package structual.decoratePattern;

public class TestDecoratePattern {

    public static void main(String[] args){
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();


        Car sportLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportLuxuryCar.assemble();
    }
}
