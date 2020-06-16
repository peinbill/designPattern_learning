package creational.factoryPattern;

public class ComputerFactory2 {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }

}
