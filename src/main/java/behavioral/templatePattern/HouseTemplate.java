package behavioral.templatePattern;

public abstract class HouseTemplate {

    public final void buildHouse(){
        buildFounction();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
    }

    // default implementation
    private void buildWindows(){
        System.out.println("Building Glass Windows");
    }


    public abstract void buildWalls();

    public abstract void buildPillars();

    private void buildFounction(){
        System.out.println("Building foundation with cement,iron rods and sand");
    }
}
