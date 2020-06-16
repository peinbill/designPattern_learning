package structual.ProxyPattern;

public class TestProxyPattern {

    public static void main(String[] args){
        CommandExecutor executor=new CommandExecutorProxy("ABC","123");
        try{
            executor.runCommand("ls");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
