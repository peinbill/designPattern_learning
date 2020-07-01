package behavioral.statePattern;

public class TVStartState implements State {

    @Override
    public void doAction(){
        System.out.append("TV is turned Now");
    }

}
