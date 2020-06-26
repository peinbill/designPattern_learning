package behavioral.commandPattern;

public class WindowFileSystemReceiver implements FileSystemReceiver{

    @Override
    public void openFile(){
        System.out.println("Opening file in Window os");
    }

    @Override
    public void writeFile(){
        System.out.println("Writing file in Window OS");
    }

    @Override
    public void closeFile(){
        System.out.println("Closing file in Window OS");
    }



}
