package structual.decoratePattern;

import org.omg.CORBA.PUBLIC_MEMBER;

public class SportsCar extends CarDecorator{

    public SportsCar(Car c){
        super(c);
    }

    @Override
    public void assemble(){
        car.assemble();
        System.out.println("Adding features of Sports Car");
    }
}
