package behavioral.commandPattern;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.nio.file.FileSystem;

public class OpenFileCommand implements Command{

    private FileSystemReceiver fileSystem;

    public OpenFileCommand(FileSystemReceiver fs){
        this.fileSystem=fs;
    }

    @Override
    public void execute(){
        this.fileSystem.openFile();
    }


}
