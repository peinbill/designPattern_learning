package behavioral.statePattern;

public class TVRemote {

    public static void main(String[] args){
        TVContext context = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();

        context.setState(tvStartState);
        context.doAction();
    }
}
