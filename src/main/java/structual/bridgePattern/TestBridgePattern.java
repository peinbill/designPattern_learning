package structual.bridgePattern;

public class TestBridgePattern {

    public static void main(String[] args){
        Shape tri = new Triangle(new GreenColor());
        tri.applyColor();
    }
}
