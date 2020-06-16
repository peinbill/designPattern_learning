package creational.PrototypePattern;

public class PrototypePatternTest {

    public static void mai(String[] args) throws CloneNotSupportedException{
        Employees emps = new Employees();
        emps.loadData();

        Employees empsNew = (Employees) emps.clone();
        Employees empsNew2 = (Employees)emps.clone();
    }
}
