package behavioral.mementoPattern;


import javax.swing.*;
import java.io.File;

public class FileWriterUtil {
    private String fileName;
    private StringBuffer content;

    public FileWriterUtil(String file){
        this.fileName = file;
        this.content = new StringBuffer();
    }

    @Override
    public String toString(){
        return this.content.toString();
    }

    public void write(String str){
        content.append(str);
    }

    public Memento save(){
        return new Memento(this.fileName,this.content);
    }

    public void undoToLastSave(Object obj){
        Memento memento = (Memento) obj;
        this.fileName = memento.fileName;
        this.content = memento.content;

    }

    private class Memento{
        private String fileName;
        private StringBuffer content;

        public Memento(String file,StringBuffer content){
            this.fileName = file;
            this.content=new StringBuffer(content);
        }
    }


}
