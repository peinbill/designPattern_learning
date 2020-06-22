package structual.bridgePattern;

public class Triangle extends  Shape{

    public Triangle(Color c){
        super(c);
    }

    @Override
    public void applyColor(){
        color.applyColor();
    }
}
