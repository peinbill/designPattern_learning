package behavioral.interpreterPattern;

public class InterpretClient {

    public InterpreterContext ic;

    public InterpretClient(InterpreterContext i){
        this.ic = i;
    }

    public String interpret(String str){
        Expression exp=null;
        if(str.contains("Heaxadecimal")){
            exp = new IntToHexExpression(Integer.parseInt(str.substring(0,str.indexOf("in"))));
        }else if(str.contains("Binary")){
            exp=new InToBinaryExpression(Integer.parseInt(str.substring(0,str.indexOf("in"))));
        }else {
            return str;
        }
        return exp.interpret(ic);
    }

    public static void main(String[] args){
        String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";

        InterpretClient ec = new InterpretClient(new InterpreterContext());

        System.out.println(str1+"="+ec.interpret(str1));
        System.out.println(str2+"="+ec.interpret(str2));
    }



}
