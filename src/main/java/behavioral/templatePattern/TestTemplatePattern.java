package behavioral.templatePattern;

public class TestTemplatePattern {

    public static void main(String[] args){
        HouseTemplate houseTemplate = new GlassHouse();
        houseTemplate.buildHouse();
    }
}
