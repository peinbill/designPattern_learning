package behavioral.interpreterPattern;

public class InToBinaryExpression implements Expression{


    private int i;

    public InToBinaryExpression(int c){
        this.i = c;
    }

    @Override
    public String interpret(InterpreterContext ic){
        return ic.getBinaryFormat(i);
    }

}
