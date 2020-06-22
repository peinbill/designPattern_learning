package structual.bridgePattern;

public class Pentagon extends Shape{

    public Pentagon(Color c){
        super(c);
    }

    @Override
    public void applyColor(){
        color.applyColor();
    }
}
