package creational.factoryPattern;

public class TestAbstractFactory {
    public static void main(String[] args){
        testAbstractFactory();
    }

    private static void testAbstractFactory(){
        Computer pc = ComputerFactory2.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
    }
}
