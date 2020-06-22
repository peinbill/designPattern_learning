package structual.facadePattern;

public class TestFacadePattern {
    public static void main(String[] args) {
        String tableName = "Employee";
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
    }
}