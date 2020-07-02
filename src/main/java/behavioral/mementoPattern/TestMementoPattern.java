package behavioral.mementoPattern;

public class TestMementoPattern {

    public static void main(String[] args){
        FileWriterCaretaker caretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriterUtil = new FileWriterUtil("data.txt");
        fileWriterUtil.write("First set of data\n");
        System.out.println(fileWriterUtil+"\n\n");

        caretaker.save(fileWriterUtil);

        fileWriterUtil.write("second set of data\n");

        System.out.println(fileWriterUtil+"\n\n");

        caretaker.undo(fileWriterUtil);

        System.out.println(fileWriterUtil+"\n\n");
    }

}
