package behavioral.commandPattern;

public class FIleSystemReceiverUtil {

    public static FileSystemReceiver getUnderlyingFileSystem(){
        String osName = System.getProperty("os.name");
        System.out.append("Underlying OS is:"+osName);

        if(osName.contains("Windows")){
            return new WindowFileSystemReceiver();
        }else {
            return new UnixFileSystemReceiver();
        }
    }

}
