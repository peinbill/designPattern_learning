package structual.facadePattern;

import java.sql.Connection;

public class HelperFacade {

    public static void generateReport(DBTypes dbTypes,ReportTypes reportTypes,String tableName){
        Connection connection=null;
        switch (dbTypes){
            case MYSQL:
                connection=MysqlHelper.getMysqlDBConnection();
                MysqlHelper mysqlHelper=new MysqlHelper();
                switch (reportTypes){
                    case HTML:
                        mysqlHelper.generateMysqlHTMLReport(tableName,connection);
                        break;
                    case PDF:
                        mysqlHelper.generateMysqlPDFReport(tableName,connection);
                }
                break;

            case ORACLE:
                connection=OracleHelper.getOracleDBConnection();
                OracleHelper oracleHelper=new OracleHelper();
                switch (reportTypes){
                    case HTML:
                        oracleHelper.generateOracleHTMLReport(tableName,connection);
                        break;
                    case PDF:
                        oracleHelper.generateOraclePDFReport(tableName,connection);
                }
                break;
        }
    }

    public static enum DBTypes{
        MYSQL,ORACLE;
    }

    public static enum ReportTypes{
        HTML,PDF;
    }
}
