package structual.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{

    private List<Shape> shapeList = new ArrayList<>();

    @Override
    public void draw(String fillColor){
        for(Shape sh:shapeList){
            sh.draw(fillColor);
        }
    }

    public void add(Shape s){
        this.shapeList.add(s);
    }

    public void remove(Shape s){
        this.shapeList.remove(s);
    }

    public void clear(){
        this.shapeList.clear();
    }


}
