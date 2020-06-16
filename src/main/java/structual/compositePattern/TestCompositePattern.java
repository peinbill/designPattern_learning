package structual.compositePattern;

public class TestCompositePattern {

    public static void main(String[] args){
        Shape tri = new Triangle();
        Shape cir = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Blue");
    }

}
